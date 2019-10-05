package com.bridgelabz.prepared.controller.batchprocess;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import com.bridgelabz.statement.repositary.JdbcConnectivity;

public class BatchPrepared
{
	static Connection con= JdbcConnectivity.getConnection();
	static PreparedStatement pst= null;

	public static void main(String[] args) throws SQLException {
		
		int []result=executeAll();
		for (int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}
	}

	private static int[] executeAll() throws SQLException 
	{
	
		String query="insert into student values (?,?,?)";
		
		pst=con.prepareStatement(query);
		pst.setInt(1,16);
		pst.setString(2, "priyanka");
		pst.setString(3, "latur");
		pst.addBatch();
		
		pst.setInt(1,17);
		pst.setString(2, "shree");
		pst.setString(3, "pune");
		pst.addBatch();
		return pst.executeBatch();
	}
}
