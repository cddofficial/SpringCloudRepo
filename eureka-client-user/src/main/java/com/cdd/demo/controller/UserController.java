package com.cdd.demo.controller;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
 
import com.cdd.demo.entity.User;
import com.cdd.demo.repository.UserRepository;
 
@RestController
public class UserController {
	
	@Autowired
	private UserRepository userRepository;
 
	@GetMapping("/user/{id}")
	public User findById(@PathVariable long id) {
		 return this.userRepository.findById(id).get();
	}
}