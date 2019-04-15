package com.project.bank;

 class CustomerNotFoundException extends RuntimeException {

	    CustomerNotFoundException(Long id) {
	        super("Could not find customer " + id);
	}
}
