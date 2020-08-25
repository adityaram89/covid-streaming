package com.poc.covidstreaming.data.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * Covid report data
 */
@Getter
@AllArgsConstructor
public class CovidReport {

    /**
     * Covid country information
     */
    private CovidCountryData covidCountryData;

    /**
     * Covid cases count report
     */
    private CovidCasesCountReport covidReportDateStats;
}
