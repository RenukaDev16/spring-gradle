package com.revature.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.revature.bizz.StudentService;
import com.revature.exceptionhandling.ControllerException;


import org.springframework.web.bind.annotation.PostMapping;
@RestController
public class StudentController{
	@Autowired
	StudentService manager;
	//@RequestMapping (value="/login",method=RequestMethod.POST)
	@PostMapping("/login")
	ResponseEntity<String>login(@RequestParam(value="email") String email,@RequestParam(value="password") String password) 
	{
		try
		{
		Boolean result=	manager.login(email,password);
			if(result)
			{
				return new ResponseEntity<String>("login success",	HttpStatus.OK);
			}
			else
			{
				return new  ResponseEntity<String>("Incorrect username or password",HttpStatus.OK);
			}
		}
		catch(ControllerException e)
		{
			return new ResponseEntity<String>("Internal Server Error", HttpStatus.INTERNAL_SERVER_ERROR);
		}
	
}
}
