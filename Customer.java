package com.example.customeronlytest;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Customer{

	    private @Id @GeneratedValue(strategy=GenerationType.IDENTITY) Long userId;
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

	public Long getUserId() {
		return userId;
	}

	public void setId(Long id) {
		this.userId = id;
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

