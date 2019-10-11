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
		int count=0;
		for (int i = 0; i < result.length; i++) {
			System.out.println("execute successfully");
//			if(result[i]==1)
//				count++;
//			System.out.println(result[i]);
		}
		//System.out.println(count +"   "+result.length);
//		if(count==result.length) {
//			System.out.println("execute successfully");
//		}
//		else
//			System.out.println("something went wrong");
	}

	private static int[] executeAll() throws SQLException {
	    st=con.createStatement();
//		String query="insert into student values(53,'riya','mumbai')";
//		st.addBatch(query);
//		String queryInsert="insert into student values(54,'priya','pune')";
//		st.addBatch(queryInsert);
	    String queryUpdate="update student set name='priya' where id=21";
		st.addBatch(queryUpdate);
//		String queryDelete="delete from student where id=53";
//		st.addBatch(queryDelete);
		return st.executeBatch();
	}

}
