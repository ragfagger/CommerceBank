package com.example.bank.demo;

 class AppointmentNotFoundException extends RuntimeException {

	    AppointmentNotFoundException(Long id) {
	        super("Could not find customer " + id);
	}
}
