package com.project.bank;

 class AppointmentNotFoundException extends RuntimeException {

	    AppointmentNotFoundException(Long id) {
	        super("Could not find customer " + id);
	}
}
