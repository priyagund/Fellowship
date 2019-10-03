package com.bridgelabz.repositary;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcConnectivity {
	static String url = "jdbc:mysql://localhost:3306/college?verifyServerCertificate=false&useSSL=true";
	static String username = "root";
	static String password = "root";
	static Connection con = null;

	public static Connection getConnection() 
	{  
		try {
			con = DriverManager.getConnection(url, username, password);
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return con;
	}

}
