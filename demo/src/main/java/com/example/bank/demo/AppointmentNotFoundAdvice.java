package com.example.bank.demo;

public class AppointmentNotFoundAdvice {
	   
	    String appointmentNotFoundHandler(AppointmentNotFoundException ex) {
	        return ex.getMessage();
	}
}
