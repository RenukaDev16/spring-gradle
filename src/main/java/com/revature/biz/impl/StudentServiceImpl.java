package com.revature.biz.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.google.protobuf.ServiceException;
import com.revature.bizz.StudentService;
import com.revature.dao.StudentDAO;
import com.revature.exceptionhandling.ControllerException;
import com.revature.exceptionhandling.ServicesException;
@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	StudentDAO dao;
	public Boolean login(String email,String password )throws ControllerException
	{
try
{
	return dao.login(email,password) ;
	}
	catch(ServicesException e)
	{
		throw  new ControllerException(e.getMessage());
	}
					
	}
}
