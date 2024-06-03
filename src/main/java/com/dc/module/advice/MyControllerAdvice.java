package com.dc.module.advice;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
@ResponseStatus(HttpStatus.BAD_REQUEST)
public class MyControllerAdvice {
	@ExceptionHandler(MethodArgumentNotValidException.class)
	public Map<String, String> handleException(MethodArgumentNotValidException m) {
		Map<String, String> error = new HashMap<String, String>();
		m.getBindingResult().getFieldErrors().forEach(err -> error.put(err.getField(), err.getDefaultMessage()));
		return error;
	}

}
