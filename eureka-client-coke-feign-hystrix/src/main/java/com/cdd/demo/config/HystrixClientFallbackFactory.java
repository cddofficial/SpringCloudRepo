package com.cdd.demo.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.cdd.demo.entity.User;
import com.cdd.demo.feign.UserFeignClient;

import feign.hystrix.FallbackFactory;

@Component
public class HystrixClientFallbackFactory implements FallbackFactory<UserFeignClient> {

	private static final Logger LOG = LoggerFactory.getLogger(UserFeignClientWithFallbackFactory.class);

	@Override
	public UserFeignClient create(Throwable cause) {
		
		LOG.info("fallback reason is:{}", cause.getMessage());
		
		return new UserFeignClientWithFallbackFactory() {
			@Override
			public User findById(long id) {
				User user = new User();
				user.setId(-2L);
				user.setName("Fallback的升级FallbackFactory");
				return user;
			}
			
		};
	}
}
