package com.cdd.demo.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.cdd.demo.config.HystrixClientFallbackFactory;
import com.cdd.demo.entity.User;

@FeignClient(
		name="eureka-client-user",
//		fallback=HystrixClientFallback.class,  // fallback与fallbackFactory不能同时配置
		fallbackFactory=HystrixClientFallbackFactory.class)
public interface UserFeignClient {
	
	@GetMapping("/user/{id}")
	public User findById(@PathVariable long id);
}
