package com.ednilsonrossi.hroauth.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ednilsonrossi.hroauth.feignclients.UserFeignClient;
import com.ednilsonrossi.hroauth.model.User;

@Service
public class UserService {

	Logger logger = LoggerFactory.getLogger(UserService.class);
	
	@Autowired
	private UserFeignClient userFeignClient;
	
	public User findByEmail(String email) {
		User user = userFeignClient.findByEmail(email).getBody();
		if(user == null) {
			logger.error("E-mail não encontrado: " + email);
			throw new IllegalArgumentException("E-mail não encontrado");
		}
		logger.info("E-mail encontrado: " + email);
		return user;
	}
}
