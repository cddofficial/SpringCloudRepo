package com.cdd.demo.controller;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.cdd.demo.entity.User;
import com.cdd.demo.feign.UserFeignClient;
 
@RestController
public class CokeController {
 
	// 注入UserFeignClient
	@Autowired
	private UserFeignClient userFeignClient;
 
	// 通过RestTemplate向用户微服务发送请求
	@GetMapping("/coke/{id}")
	public User findById(@PathVariable Long id) {
		return this.userFeignClient.findById(id);
	}
}