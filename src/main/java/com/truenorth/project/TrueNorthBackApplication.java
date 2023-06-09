package com.truenorth.project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class TrueNorthBackApplication {

    public static void main(String[] args) {
        SpringApplication.run(TrueNorthBackApplication.class, args);
    }

}
