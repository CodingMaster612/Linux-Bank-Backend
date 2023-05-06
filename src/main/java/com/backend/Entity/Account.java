package com.backend.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="account")
public class Account {
	  @Id
	   
	  @Column(name = "id")
	  
	  
	  @GeneratedValue(strategy = GenerationType.IDENTITY)
	  Integer id;
	  
	  
	  @Column(name="balamce")
	  Integer balance;
	  
	  @Column(name="history")
	  String history;
	  
}
