package com.revature.dao;
import com.google.protobuf.ServiceException;
import com.revature.exceptionhandling.ServicesException;

public interface StudentDAO {

	public Boolean login(String email,String password) throws  ServicesException ;
}
