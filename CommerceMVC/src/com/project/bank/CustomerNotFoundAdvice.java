package com.project.bank;

public class CustomerNotFoundAdvice {
	   
	    String customerNotFoundHandler(CustomerNotFoundException ex) {
	        return ex.getMessage();
	}
}
