package com.poc.covidstreaming;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jms.annotation.EnableJms;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableJms
@EnableScheduling
public class CovidStreamingApplication {

    public static void main(String[] args) {
        SpringApplication.run(CovidStreamingApplication.class, args);
    }
}
