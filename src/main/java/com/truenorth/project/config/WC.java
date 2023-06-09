package com.truenorth.project.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;

@Configuration
public class WC {

    @Bean
    public WebClient webClient(){
        WebClient client = WebClient.create();

        return client;

    }


}
