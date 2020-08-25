package com.poc.covidstreaming.data.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * Model to hold Covid cases count read from CSV.
 */
@AllArgsConstructor
@Getter
public class CovidCasesCount {

    /**
     * Last day covid cases count in datasource
     */
    private Integer lastDayCount;

    /**
     * Last before day covid cases count in datasource
     */
    private Integer lastBeforeDayCount;

    /**
     * A default constructor
     */
    public CovidCasesCount() {
    }
}
