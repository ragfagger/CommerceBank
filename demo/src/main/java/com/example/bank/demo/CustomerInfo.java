package com.example.bank.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class CustomerInfo {

	    private @Id @GeneratedValue Long id;
	    private String FirstName;
	    private String LastName;
	    private String email;
	    private String PhoneNumber;

	    CustomerInfo() {}

	    CustomerInfo(String FirstName, String LastName, String email, String PhoneNumber) {
	        this.FirstName = FirstName;
	        this.LastName = LastName;
	        this.email = email;
	        this.PhoneNumber = PhoneNumber;
	       
	    }
	}

