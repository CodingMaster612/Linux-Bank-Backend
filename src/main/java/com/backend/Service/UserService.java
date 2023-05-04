package com.backend.Service;

import org.springframework.beans.factory.annotation.Autowired;

import com.backend.Entity.User;
import com.backend.Repo.UserRepo;

public class UserService {
	
	@Autowired
    UserRepo userRepo;
	 public User signIn(User user) {
	        
	       
	        return userRepo.signIn(user.getEmail(), user.getPassword());

	       
	    }
}
