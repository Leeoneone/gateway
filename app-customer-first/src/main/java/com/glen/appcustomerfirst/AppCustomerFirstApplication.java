package com.glen.appcustomerfirst;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
//注册中心的客户端
@EnableDiscoveryClient
@SpringBootApplication
public class AppCustomerFirstApplication {

    public static void main(String[] args) {
        SpringApplication.run(AppCustomerFirstApplication.class, args);
    }

}
