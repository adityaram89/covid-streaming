package com.poc.covidstreaming.data.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * Covid cases count to be used in Report
 */
@AllArgsConstructor
@Getter
public class CovidCasesCountReport {

    /**
     * Total coivd cases for a country
     */
    private Integer totalCases;

    /**
     * Last day covid cases count
     */
    private Integer lastDayCount;
}
