package Appointments;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

public class AppointmentNotFoundAdvice {
	   
	    String appointmentNotFoundHandler(AppointmentNotFoundException ex) {
	        return ex.getMessage();
	}
}
