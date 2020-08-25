package com.poc.covidstreaming.data.collector;

/**
 *  Interface to define the method to read from any datasource
 */
public interface DataSourceReader {

    /**
     * Read content from a datasource
     */
    void readFromDataSource();
}
