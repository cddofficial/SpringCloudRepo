package com.cdd.demo;
 
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
 
@SpringBootApplication
@EnableZuulProxy   // 启用Zuul注解
public class EurekaClientGatewayZuulApplication {
 
	public static void main(String[] args) {
		SpringApplication.run(EurekaClientGatewayZuulApplication.class, args);
	}
	
//	// 注册PatternServiceRouteMapper的bean
//	@Bean
//	public PatternServiceRouteMapper serviceRouteMapper() {
//	    return new PatternServiceRouteMapper(
//	        "(?<name>^.+)-(?<version>v.+$)",
//	        "${version}/${name}");
//	}
}	