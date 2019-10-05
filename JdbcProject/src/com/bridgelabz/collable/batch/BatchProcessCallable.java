package com.bridgelabz.collable.batch;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import com.bridgelabz.statement.repositary.JdbcConnectivity;

public class BatchProcessCallable {
	static Connection con= JdbcConnectivity.getConnection();
	static CallableStatement cst= null;

	public static void main(String[] args) throws SQLException {
		
		int []result=executeAll();
		for (int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}
	}

	private static int[] executeAll() throws SQLException {
		cst=con.prepareCall("call insertIntoStudent(?,?,?)");
		cst.setInt(1,21);
		cst.setString(2, "ritu");
		cst.setString(3,"panvel");
		
		cst.addBatch();
		
		cst.setInt(1,20);
		cst.setString(2, "pallavi");
		cst.setString(3,"panvel");
		cst.addBatch();
		
		
		return cst.executeBatch();
	}

}
