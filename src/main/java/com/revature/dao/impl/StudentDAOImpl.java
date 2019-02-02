package com.revature.dao.impl;
import java.sql.*;
import org.springframework.stereotype.Repository;
import com.revature.dao.StudentDAO;
import com.revature.exceptionhandling.ServicesException;
@Repository
public class StudentDAOImpl implements StudentDAO{
	//database queries..
	
	
	public Boolean login(String a,String b) throws ServicesException 
	{
		Connection con;
		try
		{
		 Class.forName("com.mysql.jdbc.Driver");
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/java","root","root");
   Statement st=con.createStatement();
String s="select email,password from students where  email='"+a+"' AND password='"+b+"' ";
ResultSet rs=st.executeQuery(s);
if(rs.next())
{
		return true;
		
}
else
{
		return false;
}
		}
		catch(Exception e)
		{
			throw new ServicesException(e);
		}
		 
	}
	
	

}
