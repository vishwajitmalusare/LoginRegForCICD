package com.connection;

import java.sql.Connection;
import java.sql.DriverManager;

public class JDBCconnetion {

	static Connection con=null;
	public static Connection getConnection()
	{
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/webapp","root","root");
		}
		catch (Exception e)
		{
			// TODO: handle exception
		}
		return con;
	}
}
