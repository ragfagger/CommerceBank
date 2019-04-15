package com.project.bank;

public class AppointmentNotFoundAdvice {
	   
	    String appointmentNotFoundHandler(AppointmentNotFoundException ex) {
	        return ex.getMessage();
	}
}
