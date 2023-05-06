package com.backend.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.backend.Entity.Account;

@Repository         
public interface AccountRepo extends JpaRepository<Account, Integer>{
    
	
    
    
} 