package com.liuxu.demo_getway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class DemoGetwayApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoGetwayApplication.class, args);
    }

}
