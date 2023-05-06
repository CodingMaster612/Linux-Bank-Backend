package com.backend.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.backend.Entity.User;
import com.backend.Repo.UserRepo;
@Service
public class UserService {
	
	@Autowired
    UserRepo userRepo;
	 public User signIn(User user) {
	        
	       
	        return userRepo.signIn(user.getEmail(), user.getPassword());

	       
	    }
	 
	 public User save(User user) {
			
		    return userRepo.save(user);
		}
}
