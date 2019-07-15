package com.adechinan.dev.sbcartapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class SbCartapiApplication {

    public static void main(String[] args) {
        SpringApplication.run(SbCartapiApplication.class, args);
    }

}
