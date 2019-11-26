package com.cdd.demo.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.cdd.demo.config.HystrixClientFallback;
import com.cdd.demo.entity.User;

@FeignClient(name="eureka-client-user",fallback=HystrixClientFallback.class)
public interface UserFeignClient {
	
	@GetMapping("/user/{id}")
	public User findById(@PathVariable long id);
}
