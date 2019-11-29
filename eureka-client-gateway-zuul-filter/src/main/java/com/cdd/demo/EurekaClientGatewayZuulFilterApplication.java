package com.cdd.demo;
 
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

import com.cdd.demo.filter.PreZuulFilter;
 
@SpringBootApplication
@EnableZuulProxy   // 启用Zuul注解
public class EurekaClientGatewayZuulFilterApplication {
 
	public static void main(String[] args) {
		SpringApplication.run(EurekaClientGatewayZuulFilterApplication.class, args);
	}
	
	// 注册到spring容器中
	@Bean
	public PreZuulFilter preZuulFilter() {
		return new PreZuulFilter();
	}
}	