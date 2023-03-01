package com.dsproject.serverlocator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ServerLocationApplication {
    public static void main(String[] args) {

        SpringApplication.run(ServerLocationApplication.class, args);
    }
}
