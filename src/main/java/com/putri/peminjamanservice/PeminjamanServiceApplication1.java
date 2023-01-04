package com.putri.peminjamanservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class PeminjamanServiceApplication1 {

public static void main(String[] args) {
    SpringApplication.run(PeminjamanServiceApplication1.class, args);
}

    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
