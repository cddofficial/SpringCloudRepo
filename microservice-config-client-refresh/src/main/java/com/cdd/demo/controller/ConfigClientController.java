package com.cdd.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class ConfigClientController {
	
	// 把配置文件中profile属性值注入到该属性
	@Value("${profile}")
	private String profile;
	
	@GetMapping("/profile")
	public String getProfile() {
		return profile;
	}

}
