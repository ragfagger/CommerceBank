package com.example.customertest;

 class CustomerNotFoundException extends RuntimeException {

	    CustomerNotFoundException(Long id) {
	        super("Could not find customer " + id);
	}
}
