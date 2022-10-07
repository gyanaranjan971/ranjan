package com.test.concepts1;
import java.sql.Connection;
import java.sql.DriverManager;
public class poojaConnector {

	static Connection connection=null;
	public static Connection getConnection()
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/gyanaranjan1","root","root");
			return connection;
		}
		catch(Exception e){
			System.out.println(e);

		}
		return connection;



	}

}




