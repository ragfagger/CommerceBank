package com.project.bank;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Customer{

	    private @Id @GeneratedValue Long id;
	    private String FirstName;
	    private String LastName;
	    private String Email;
	    private String PhoneNumber;
	    private Boolean OnMailingList;

	    Customer() {}

	    Customer(String FirstName, String LastName, String Email, String PhoneNumber) {
	        this.FirstName = FirstName;
	        this.LastName = LastName;
	        this.Email = Email;
	        this.PhoneNumber = PhoneNumber;

	    }
	}

