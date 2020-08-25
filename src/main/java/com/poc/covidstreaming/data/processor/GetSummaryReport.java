package com.poc.covidstreaming.data.processor;

import com.poc.covidstreaming.data.model.CovidRawData;
import org.springframework.web.bind.annotation.RestController;

/**
 * Interface to display summary report
 */
@RestController
public interface GetSummaryReport {

    /**
     * Method to process a record from JMS
     * @param covidRawData
     */
    void processRecordFromJMS(CovidRawData covidRawData);
}