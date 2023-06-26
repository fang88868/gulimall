package com.example.gulimall;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


@SpringBootApplication
@EnableDiscoveryClient
public class GulimallApplication {

    public static void main(String[] args) {
        SpringApplication.run(GulimallApplication.class, args);
    }

}
