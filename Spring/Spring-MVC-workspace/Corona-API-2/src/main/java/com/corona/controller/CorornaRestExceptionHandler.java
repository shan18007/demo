package com.corona.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.corona.exceptions.CoronaErrorResponse;
import com.corona.exceptions.CoronaNotFoundException;

@ControllerAdvice
@Component
public class CorornaRestExceptionHandler {

	@ExceptionHandler
	public ResponseEntity<CoronaErrorResponse> handleCoronaException(CoronaNotFoundException ex) {
		System.out.println("Exception caought: " + ex);
		CoronaErrorResponse error = new CoronaErrorResponse();
		error.setStatus(HttpStatus.NOT_FOUND.value());
		error.setMessage(ex.getMessage());
		error.setTimestamp(System.currentTimeMillis());
		return new ResponseEntity<>(error, HttpStatus.NOT_FOUND);
	}

	@ExceptionHandler
	public ResponseEntity handleException(Exception e) {
		System.out.println("Inside Global Excpetion...");
		CoronaErrorResponse error = new CoronaErrorResponse();
		error.setStatus(HttpStatus.INTERNAL_SERVER_ERROR.value());
		error.setMessage("Something went wrong....");
		error.setTimestamp(System.currentTimeMillis());

		return new ResponseEntity<>(error, HttpStatus.INTERNAL_SERVER_ERROR);
	}
}
