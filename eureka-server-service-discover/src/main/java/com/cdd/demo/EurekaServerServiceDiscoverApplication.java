package com.cdd.demo;
 
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
 
@SpringBootApplication
@EnableEurekaServer    //eureka server注解
public class EurekaServerServiceDiscoverApplication {
 
	public static void main(String[] args) {
		SpringApplication.run(EurekaServerServiceDiscoverApplication.class, args);
	}
}