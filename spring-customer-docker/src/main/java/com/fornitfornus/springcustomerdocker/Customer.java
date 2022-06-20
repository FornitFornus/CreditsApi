package com.fornitfornus.springcustomerdocker;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

@RestController
public class Customer {

    @GetMapping("/showForGui")
    public Credit[] get() {

        RestTemplate restTemplate = new RestTemplate();

        ResponseEntity<Credit[]> exchange = restTemplate.exchange(
                "http://credit:9090/credits",
                HttpMethod.GET,
                HttpEntity.EMPTY,
                Credit[].class);

        Credit[] body = exchange.getBody();
        return body;
    }
}
