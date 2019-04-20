package com.example.customeronlytest;

public class CustomerNotFoundAdvice {
	   
	    String customerNotFoundHandler(CustomerNotFoundException ex) {
	        return ex.getMessage();
	}
}
