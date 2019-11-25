package com.cdd.demo;
 
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
 
@SpringBootApplication
@EnableEurekaClient  //eureka client 注解
public class EurekaClientCokeApplication {
 
	public static void main(String[] args) {
		SpringApplication.run(EurekaClientCokeApplication.class, args);
	}
}