package com.revature.dao.impl;
import java.sql.*;
import org.springframework.stereotype.Repository;
//import com.google.protobuf.ServiceException;
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
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/java","root","admin");
   Statement st=con.createStatement();
String s="select s.email,s.password from student s where  s.email='"+a+"' AND s.password='"+b+"' ";
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
