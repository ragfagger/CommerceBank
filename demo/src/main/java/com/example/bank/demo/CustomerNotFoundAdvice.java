package com.example.bank.demo;

public class CustomerNotFoundAdvice {
	   
	    String customerNotFoundHandler(CustomerNotFoundException ex) {
	        return ex.getMessage();
	}
}
