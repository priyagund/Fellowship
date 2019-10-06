package com.bridgelabz.loginpage.services;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.bridgelabz.loginpage.model.Student;
import com.bridgelabz.statement.repositary.JdbcConnectivity;

public class ImplStudentLogin implements StudentLogin
{
     
	static Connection con=JdbcConnectivity.getConnection();
	static PreparedStatement pst=null;

	@Override
	public int insertStudent(Student student) throws SQLException
	{
		
		String query = "insert into student values(?,?,?)";
		pst =  con.prepareStatement(query);
		pst.setInt(1, student.getId());
		pst.setString(2, student.getName());
		pst.setString(3, student.getAddress());

		return pst.executeUpdate();
	}

	@Override
	public Student checkStudent(int id,String name) throws SQLException
	{
		Student student=new Student();
		String query="select * from student where id=? and name=?";
		pst=con.prepareStatement(query);
		pst.setInt(1,id);
		pst.setString(2, name);
		
		ResultSet rs=pst.executeQuery();
		while(rs.next()) 
		{
			student.setId(rs.getInt(1));
			student.setName(rs.getString(2));
			student.setAddress(rs.getString(3));
		}
		
		return student;
	}

	

	
	

}
