package com.revature.bizz;

import com.revature.exceptionhandling.ControllerException;
public interface StudentService {

	public Boolean login(String email , String password) throws ControllerException ; //abstract method impl in another class
	
}
