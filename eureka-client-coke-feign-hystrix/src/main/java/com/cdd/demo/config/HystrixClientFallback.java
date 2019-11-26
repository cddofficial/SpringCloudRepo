package com.cdd.demo.config;

import org.springframework.stereotype.Component;

import com.cdd.demo.entity.User;
import com.cdd.demo.feign.UserFeignClient;

@Component
public class HystrixClientFallback implements UserFeignClient{

	@Override
	public User findById(long id) {
		User user = new User();
		user.setId(-1L);
		user.setName("Fallback");
		return user;
	}

}
