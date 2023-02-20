package io.github.khietbt.tomatodiscoveryservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class TomatoDiscoveryServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(TomatoDiscoveryServiceApplication.class, args);
    }
}