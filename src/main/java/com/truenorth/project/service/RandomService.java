package com.truenorth.project.service;

import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.ClientResponse;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Service
public class RandomService {

//    WebClient client;
//
//    public RandomService(WebClient client) {
//        this.client = client;
//    }

    public static void main(String[] args) {
        String response = new RandomService().generate();
        System.out.println("response "+response);
    }

    public String generate(){

        WebClient webClient = WebClient.create();
        ClientResponse response = webClient.get()
                .uri("https://www.random.org/strings/?num=1&len=10&digits=on&unique=on&format=plain&rnd=new")
                .exchange()
                .block();

        return response.bodyToMono(String.class).block();
    }
}
