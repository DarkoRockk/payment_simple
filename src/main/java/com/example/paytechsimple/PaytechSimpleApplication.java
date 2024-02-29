package com.example.paytechsimple;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class PaytechSimpleApplication {

    public static void main(String[] args) {
        SpringApplication.run(PaytechSimpleApplication.class, args);
    }

}
