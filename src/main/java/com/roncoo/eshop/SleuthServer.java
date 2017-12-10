package com.roncoo.eshop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.sleuth.zipkin.stream.EnableZipkinStreamServer;

@SpringBootApplication
@EnableZipkinStreamServer
//@EnableZipkinServer
@EnableEurekaClient
public class SleuthServer {

    public static void main(String[] args) {
        SpringApplication.run(SleuthServer.class, args);
    }
	
}