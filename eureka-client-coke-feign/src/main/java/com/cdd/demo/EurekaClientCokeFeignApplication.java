package com.cdd.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient  //eureka client 注解
@EnableFeignClients  //启用feign组件注解
public class EurekaClientCokeFeignApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaClientCokeFeignApplication.class, args);
	}
}