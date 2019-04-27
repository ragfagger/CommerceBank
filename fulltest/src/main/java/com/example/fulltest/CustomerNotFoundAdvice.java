package com.example.fulltest;

public class CustomerNotFoundAdvice {
	   
	    String customerNotFoundHandler(CustomerNotFoundException ex) {
	        return ex.getMessage();
	}
}
