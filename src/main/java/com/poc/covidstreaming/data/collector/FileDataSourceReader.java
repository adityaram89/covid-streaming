package com.poc.covidstreaming.data.collector;

import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;
import javax.annotation.Resource;

import com.poc.covidstreaming.data.model.CovidCasesCount;
import com.poc.covidstreaming.data.model.CovidCountryData;
import com.poc.covidstreaming.data.model.CovidRawData;
import com.poc.covidstreaming.data.processor.GetSummaryReport;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class FileDataSourceReader {

    @Value("${covid.streaming.file.download.url}")
    private String fileDownloadURL;

    private String downloadedFilePath = "covid_data.csv";

    @Value("${covid.streaming.file.column.country.name}")
    private String countryColumnName;

    @Value("${covid.streaming.file.column.state.name}")
    private String StateColumnName;

    @Value("${covid.reports.country.name}")
    private String countryToSearch;

    private int countryColumnIndex;

    private int stateColumnIndex;

    @Resource
    private GetSummaryReport getSummaryReport;

    @Resource
    private Enqueue enqueue;

    private static final String COMMA = ",";

    // Scheduler to run the job every 6 hours.
    @Scheduled(fixedRate = 21600000)
    public void readFromDataSource() {
        try {
            // Stream the file from the GIT repo. No need to download the file and process it.
            URLConnection urlConnection = new URL(fileDownloadURL).openConnection();
            // The stream will be closed automatically once the scope ends.
            try (InputStream inputStream = urlConnection.getInputStream()) {
                // Stream the file from URL line by line. No need to load the file in memory.
                try (Scanner scanner = new Scanner(inputStream, "UTF-8")) {
                    // Read the header and determine the index position of "State" and "Country"
                    if (scanner.hasNextLine()) {
                        String[] headerColumnNames = scanner
                                .nextLine()
                                .split(COMMA);
                        setColumnIndexInCSV(headerColumnNames);
                    }
                    while (scanner.hasNextLine()) {
                        String[] values = scanner
                                .nextLine()
                                .split(COMMA);

                        //If the indexes are less than 0, then some thing is wrong in the file.
                        if (countryColumnIndex < 0
                                || stateColumnIndex < 0) {
                            StringBuilder errorMessage = new StringBuilder();
                            errorMessage
                                    .append("Country name column: ")
                                    .append(countryColumnName)
                                    .append(" or state name column : ")
                                    .append(StateColumnName)
                                    .append(" not found in the datasource. ");
                            throw new RuntimeException(errorMessage.toString());
                        }

                        while (scanner.hasNextLine()) {
                            String[] line = scanner
                                    .nextLine()
                                    .split(COMMA);
                            if (line[countryColumnIndex].equalsIgnoreCase(countryToSearch)) {
                                // Read each line, if it matches with the selected country, drop it in the queue. We
                                // can process it later
                                enqueue.publishToQueue(
                                        new CovidRawData(
                                                new CovidCountryData(
                                                        line[stateColumnIndex],
                                                        line[countryColumnIndex]),
                                                new CovidCasesCount(
                                                        new Integer(line[line.length - 1]),
                                                        new Integer(line[line.length - 2]))));
                            }
                        }
                    }
                }
            }
        } catch (Exception e) {
            System.out.println("Error processing data: " + e);
        }
    }

    private void setColumnIndexInCSV(String[] header) {
        boolean isCountryFound = false;
        boolean isStateFound = false;
        for (int index = 0; index < header.length - 1; index++) {
            if (header[index].equalsIgnoreCase(countryColumnName)) {
                countryColumnIndex = index;
                isCountryFound = true;
                if (isStateFound) {
                    break;
                }
            } else if (header[index].equalsIgnoreCase(StateColumnName)) {
                stateColumnIndex = index;
                isStateFound = true;
                if (isCountryFound) {
                    break;
                }
            }
        }
    }
}
