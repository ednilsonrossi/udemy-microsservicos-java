package com.ednilsonrossi.hruser.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ednilsonrossi.hruser.model.User;

public interface UserRepository extends JpaRepository<User, Long>{

	User findByEmail(String email);
	
}
