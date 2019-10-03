package com.bridgelabz.services;
import com.bridgelabz.model.Student;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import com.bridgelabz.model.JdbcImpl;
import com.bridgelabz.repositary.JdbcConnectivity;

public class Jdbc implements JdbcImpl
{
	static Connection con=JdbcConnectivity.getConnection();
	Statement st=null;
	
	public void insertDataStatment(Object student) throws SQLException
	{
		String query="insert into student values("+((Student) student).getId()+","
				+ " '"+((Student) student).getName()+"','"
				+((Student) student).getAddress()+"')";
		
		st=con.createStatement();
		
		st.executeUpdate(query);
		
	}

	@Override
	public void readDataStatement() {
		
		
	}

	@Override
	public void updateDataStatement() {
		
		
	}

	@Override
	public void deleteDataStatement() {
		
		
	}
}
