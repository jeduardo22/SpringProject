package com.springNelio.resources.exceptions;

import javax.servlet.http.HttpServletResponse;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;

import com.springNelio.services.exceptions.ObjectNotFoundException;

@ControllerAdvice
public class ResourceExceptionHandler {
	
	
	public ResponseEntity<StandardError> objectNotFound(ObjectNotFoundException e, HttpServletResponse request){

		StandardError err = new StandardError(HttpStatus.NOT_FOUND.value(),e.getMessage() , System.currentTimeMillis());
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(err);
		
}

}
