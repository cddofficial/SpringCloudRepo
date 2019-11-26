package com.cdd.demo.controller;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.cdd.demo.entity.User;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
 
@RestController
public class CokeController {
 
	// 注入RestTemplate
	@Autowired
	private RestTemplate restTemplate;
 
	// 通过RestTemplate向用户微服务发送请求
	@GetMapping("/coke/{id}")
	@HystrixCommand(fallbackMethod="findByIdFallback")   // 发生异常回调方法，配置方法名
	public User findById(@PathVariable Long id) {	
		// 方法getForObject当前请求路径参数已经换成了用户微服务的 serviceId,
		return this.restTemplate.getForObject("http://eureka-client-user/user/" + id, User.class);
	}
	
	// 发生异常回调方法
	// 返回，参数要和原方法一致
	public User findByIdFallback(@PathVariable Long id) {
		User user = new User();
		user.setId(0l);
		user.setName("微服务");
		return user;
	}
}