package com.poc.covidstreaming.data.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * Model to hold covid country information
 */
@AllArgsConstructor
@Getter
public class CovidCountryData {

    /**
     * Covid data state information
     */
    private String state;

    /**
     * Covid data country information
     *
     */
    private String country;

    /**
     * A default constructor
     */
    public CovidCountryData() {
    }
}
