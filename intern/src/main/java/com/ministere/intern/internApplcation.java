package com.ministere.intern;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class internApplcation {
    public static void main(String[] args) {
        SpringApplication.run(internApplcation.class,args);
    }
}
