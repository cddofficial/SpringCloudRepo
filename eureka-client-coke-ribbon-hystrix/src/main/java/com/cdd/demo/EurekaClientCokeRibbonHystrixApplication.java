package com.cdd.demo;
 
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;
 
@SpringBootApplication
@EnableEurekaClient  //eureka client 注解
@EnableCircuitBreaker  // 启用断路器
public class EurekaClientCokeRibbonHystrixApplication {
 
	public static void main(String[] args) {
		SpringApplication.run(EurekaClientCokeRibbonHystrixApplication.class, args);
	}
	
	@Bean   // 向spring容器中中注册RestTemplate
	@LoadBalanced  // 负载均衡注解
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}
}