package com.revature.exceptionhandling;

import com.google.protobuf.ServiceException;

public class ControllerException extends Exception{
	private static final long serialVersionUID = 1L;
public ControllerException(String msg)
{
	super(msg);
}

}
