package com.poc.covidstreaming.data.processor;

import com.poc.covidstreaming.data.model.CovidCasesCountReport;
import com.poc.covidstreaming.data.model.CovidRawData;
import com.poc.covidstreaming.data.model.CovidReport;
import org.springframework.stereotype.Component;

/**
 * Class that processes and prints the raw data read from datasaource
 */
@Component
public class GetSummaryReportImpl implements GetSummaryReport {

    private boolean isHeaderPrinted = false;

    /**
     * Process each message dropped in JMS
     * @param covidRawData
     */
    public void processRecordFromJMS(CovidRawData covidRawData) {
        // Print the header first and make sure we don't print again.
        if (isHeaderPrinted == false) {
            printHeader();
        }
        // Call
        printData(new CovidReport(
                covidRawData.getCovidCountryData(),
                new CovidCasesCountReport(
                        covidRawData
                                .getCovidCountData()
                                .getLastDayCount(),
                        covidRawData
                                .getCovidCountData()
                                .getLastDayCount() - covidRawData
                                .getCovidCountData()
                                .getLastBeforeDayCount())));
    }

    /**
     * Print header information on command line
     */
    private void printHeader() {
        System.out.println("\n");
        System.out.format(
                "%25s %25s %30s %30s",
                "State",
                "Country",
                "Total cases",
                "No.Of Cases Reported last day");
        System.out.println("\n");
        isHeaderPrinted = true;
    }

    /**
     * Print values on the command line.
     * @param report
     */
    public void printData(CovidReport report) {

        System.out.format(
                "%25s %25s %30d %30d",
                report
                        .getCovidCountryData()
                        .getState(),
                report
                        .getCovidCountryData()
                        .getCountry(),
                report
                        .getCovidReportDateStats()
                        .getTotalCases(),
                report
                        .getCovidReportDateStats()
                        .getLastDayCount());
        System.out.println("\n");
    }
}
