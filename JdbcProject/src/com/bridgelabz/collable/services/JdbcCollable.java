package com.bridgelabz.collable.services;

import java.sql.CallableStatement;
import java.sql.Connection;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.bridgelabz.collable.model.Student;
import com.bridgelabz.statement.repositary.JdbcConnectivity;
public class JdbcCollable implements CallableImpl
{
	static Connection con = JdbcConnectivity.getConnection();
	static CallableStatement cs = null;

	
	@Override
	public int insertDataCollable( Student student)
	{
//		String query="call insertIntoStudent(?,?,?)";
		try {
			cs=con.prepareCall("call insertIntoStudent(?,?,?)");
			cs.setInt(1, (student).getId());
			cs.setString(2, (student).getName());
			cs.setString(3, (student).getAddress());
			 return cs.executeUpdate();

		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return 0;
		
	}


	@Override
	public void readDataCollable() 
	{
		try {
			cs=con.prepareCall("call readStudent");
			ResultSet rs = cs.executeQuery();

			while (rs.next()) {
				System.out
						.println("id: " + rs.getInt(1) + " name: " + rs.getString(2) + " address: " + rs.getString(3));
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
	}

	 
	@Override
	public int updateDataCollable(int id, Student student) 
	{
//		String query = "update student set name='" + student.getName() + "', address='"
//				+ student.getAddress() + "' where id=" + id + "";
		try {
			cs = con.prepareCall("call updateStudent(?,?,?)");
			cs.setInt(1, id);
			cs.setString(2, student.getName());
			cs.setString(3, student.getAddress());
			return cs.executeUpdate();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	    return 0;
		
	}
 
	@Override
	public int deleteDataCollable(int id) 
	{
		try {
			cs=con.prepareCall("call deleteDataStudent(?)");
			cs.setInt(1,id);
			 return cs.executeUpdate();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return 0;
	}

}
