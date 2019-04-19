package com.example.customertest;

public class CustomerNotFoundAdvice {
	   
	    String customerNotFoundHandler(CustomerNotFoundException ex) {
	        return ex.getMessage();
	}
}
