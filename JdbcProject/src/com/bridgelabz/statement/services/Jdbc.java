package com.bridgelabz.statement.services;
import com.bridgelabz.model.Student;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.bridgelabz.statement.services.JdbcImpl;
import com.bridgelabz.statement.repositary.JdbcConnectivity;
import com.mysql.cj.protocol.Resultset;


public class Jdbc implements JdbcImpl
{
	static Connection con=null;
	       Statement st=null;
	//com.bridgelabz.statement.repositary.JdbcConnectivity.getConnection();

/**
 *purpose: insert data into table
 *
 */
	public void insertDataStatment(Object student) throws SQLException
	{
		String query="insert into student values("+((Student) student).getId()+","
				+ " '"+((Student) student).getName()+"','"
				+((Student) student).getAddress()+"')";
		
		st=con.createStatement();
		
		st.executeUpdate(query);
		
	}

	/**
	 *purpose: read data from table
	 *
	 */
	
	@Override
	public void readDataStatement() throws SQLException
	{
		String query="select * from student";
		st=con.createStatement();
		ResultSet rs= st.executeQuery(query);
		while (rs.next()) 
		{
			System.out.println("id: " + rs.getInt(1) + " name: " + rs.getString(2) + " address: " + rs.getString(3));
		}
		
		
		
	}

	/**
	 *purpose: update data into  table
	 *
	 */
	@Override
	public void updateDataStatement(int id, Object student) throws SQLException
	{
		String query="update student set name='" + ((Student) student).getName() + "', address='"
				+ ((Student) student).getAddress() + "' where id=" + id + "";
		
		st=con.createStatement();
		st.executeUpdate(query);
		
	}

	/**
	 *purpose: delete data to table
	 *
	 */
	@Override
	public void deleteDataStatement(int id) throws SQLException
	{
		String query="delete from student where id='"+id+"'";
		st=con.createStatement();
		st.executeUpdate(query);
	}
}
