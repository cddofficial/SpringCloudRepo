package com.cdd.demo.controller;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
 
import com.cdd.demo.entity.User;
 
@RestController
public class CokeController {
 
	// 注入RestTemplate
	@Autowired
	private RestTemplate restTemplate;
 
	// 通过RestTemplate向用户微服务发送请求
	@GetMapping("/coke/{id}")
	public User findById(@PathVariable Long id) {
		return this.restTemplate.getForObject("http://localhost:9002/user/" + id, User.class);
	}
}