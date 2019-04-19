package com.example.customertest;


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

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstName() {
		return FirstName;
	}

	public void setFirstName(String firstName) {
		FirstName = firstName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getPhoneNumber() {
		return PhoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		PhoneNumber = phoneNumber;
	}

	public Boolean getOnMailingList() {
		return OnMailingList;
	}

	public void setOnMailingList(Boolean onMailingList) {
		OnMailingList = onMailingList;
	}
}

