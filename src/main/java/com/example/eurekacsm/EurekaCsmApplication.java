package com.example.eurekacsm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
public class EurekaCsmApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaCsmApplication.class, args);
    }

}
