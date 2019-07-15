package com.adechinan.dev.sbauthgateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy  // act as zuul proxy.
@EnableEurekaServer //for making this application as eureka server.
public class SbAuthgatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(SbAuthgatewayApplication.class, args);
    }

}
