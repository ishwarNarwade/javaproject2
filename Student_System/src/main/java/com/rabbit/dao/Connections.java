package com.rabbit.dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class Connections {
	
	static Connection cn;
	
	
	public static Connection connect() {
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/rabbit","root","root"); 
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return cn;
	}
	

}
