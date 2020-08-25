package com.poc.covidstreaming.data.processor;

import javax.annotation.Resource;

import com.poc.covidstreaming.configuration.ActiveMQConfiguration;
import com.poc.covidstreaming.data.model.CovidRawData;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

/**
 * Class to dequeue a message from JMS
 */
@Component
public class Dequeue {

    /**
     * Class that generates covid report
     */
    @Resource
    private GetSummaryReport getSummaryReport;

    /**
     * Method to receive a message from JMS
     * @param covidRawData
     */
    @JmsListener(destination = ActiveMQConfiguration.QUEUE_NAME)
    public void receiveMessage(CovidRawData covidRawData) {
        try {
            getSummaryReport.processRecordFromJMS(covidRawData);
        } catch (Exception e) {
            System.out.println("Error de-serializing the string " + e);
        }
    }
}
