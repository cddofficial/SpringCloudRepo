package com.cdd.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableEurekaClient  //eureka client 注解
public class EurekaClientCokeApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaClientCokeApplication.class, args);
	}

	// 向spring容器中中注册RestTemplate
	@Bean
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}

}