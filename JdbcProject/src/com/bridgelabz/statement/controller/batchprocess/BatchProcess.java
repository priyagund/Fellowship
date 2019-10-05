package com.bridgelabz.statement.controller.batchprocess;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import com.bridgelabz.statement.repositary.JdbcConnectivity;

public class BatchProcess {
	static Connection con= JdbcConnectivity.getConnection();
	static Statement st= null;

	public static void main(String[] args) throws SQLException {
		
		int []result=executeAll();
		for (int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}
	}

	private static int[] executeAll() throws SQLException {
	    st=con.createStatement();
		String query="insert into student values(13,'riya','pune')";
		st.addBatch(query);
		String queryInsert="insert into student values(14,'priya','pune')";
		st.addBatch(queryInsert);
		String queryUpdate="update student set name='priya' where id=14";
		st.addBatch(queryUpdate);
		String queryDelete="delete from student where id=1";
		st.addBatch(queryDelete);
		return st.executeBatch();
	}

}
