package com.poc.covidstreaming.data.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * Model to hold Covid Raw Data read from datasource
 */
@AllArgsConstructor
@Getter
public class CovidRawData {

    /**
     * A default constructor
     */
    public CovidRawData() {
    }

    /**
     * Covid country information
     */
    private CovidCountryData covidCountryData;

    /**
     * Covid cases information for a specific country.
     */
    private CovidCasesCount covidCountData;

}
