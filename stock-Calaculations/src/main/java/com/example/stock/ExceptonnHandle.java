package com.example.stock;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExceptonnHandle {
	@ExceptionHandler(value = CompanyNotFoundErr.class)
	public ResponseEntity<String> error(){
		return new ResponseEntity<String>("company not found please "
				+ "enter a valid company name",HttpStatus.BAD_REQUEST);
		
	}

}
