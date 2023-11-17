package com.example.stock;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExceptionHandle {

	
  @ExceptionHandler(value = CompanyNotFound.class)
  public ResponseEntity<String> handleException(){
	  return new ResponseEntity<String>("company not available",HttpStatus.BAD_REQUEST);
  }
}
