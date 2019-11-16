package com.cssl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableEurekaClient
public class Springcloud01ConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(Springcloud01ConsumerApplication.class, args);
    }

}
