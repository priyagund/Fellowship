package com.bridgelabz.prepared.services;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.bridgelabz.model.Student;
import com.bridgelabz.statement.repositary.JdbcConnectivity;

public class JdbcPrepared implements ImplPrepared
{
   Connection con=JdbcConnectivity.getConnection();
   PreparedStatement pst=null;
   Student student =new Student();
   
   public void insertDataPrepared(Object Student) throws SQLException 
   {
	   String query="insert into student values (?,?,?)";
	   
		pst=con.prepareStatement(query);
		pst.executeUpdate();
		pst.setInt(1, arg1);
		pst.setString(2, ((Student) student).getName());
		pst.setString(3, ((Student) student).getAddress());
		int count= pst.executeUpdate();
		System.out.println(count+"row/s updated");

   }

@Override
public void readDataPrepared() 
{
	String query="select * from student";
	try {
		pst=con.prepareStatement(query);
		ResultSet rs=pst.executeQuery();
		
	    while(rs.next()) 
	    {
	    	System.out.println("id: " + rs.getInt(1) + " name: " + rs.getString(2) + " address: " + rs.getString(3));
	    }
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}




@Override
public void updateDataPrepared(int id, Object student) 
{

	 String query="update student set name='" + ((Student) student).getName() + "', address='"
			+ ((Student) student).getAddress() + "' where id=" + id + "";
	
	 try {
		
		pst= con.prepareStatement(query);
		pst.executeUpdate();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}



@Override
public void deleteDataPrepared(int id)  
{
	String query="delete from student where id='"+id+"'";
	try {
		pst=con.prepareStatement(query);
		pst.executeUpdate();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}
}
