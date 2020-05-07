package com.example.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author papi
 * @data 2020/4/23
 */
@SpringBootApplication
@EnableDiscoveryClient
public class Consul80Application {
    public static void main(String[] args) {
        SpringApplication.run(Consul80Application.class,args);
    }
}
