package com.poc.covidstreaming.data.collector;

import javax.annotation.Resource;

import com.poc.covidstreaming.configuration.ActiveMQConfiguration;
import com.poc.covidstreaming.data.model.CovidRawData;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;

/**
 * Class to publish the payload to the queue
 */
@Component
public class Enqueue {

    /**
     * JMS template object to publish data to JMS
     */
    @Resource
    private JmsTemplate jmsTemplate;

    /**
     * Method to publish payload to JMS
     * @param covidRawData
     */
    public void publishToQueue(CovidRawData covidRawData) {
        try {
            jmsTemplate.convertAndSend(ActiveMQConfiguration.QUEUE_NAME, covidRawData);
        } catch (Exception e) {
            System.out.println(" Error publishing data to queue" + e);
        }
    }
}
