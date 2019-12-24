package com.cdd.demo;
 
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
 
@SpringBootApplication
@EnableEurekaClient     // 启用 eureak client
public class MicroserviceConfigClientApplication {
 
	public static void main(String[] args) {
		SpringApplication.run(MicroserviceConfigClientApplication.class, args);
	}
}