package com.te.empapp.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.te.empapp.exception.EmployeeException;

@ControllerAdvice
public class ExceptionHandlerController {

	@ExceptionHandler(EmployeeException.class)
	public String handleExp(EmployeeException exception , HttpServletRequest request) {
		
		request.setAttribute("errMsg", exception.getMessage());
		return "empHomePage";
	}
}
