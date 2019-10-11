package com.bridgelabz.statement.services;

import com.bridgelabz.statement.model.Student;
import com.bridgelabz.statement.repositary.JdbcConnectivity;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.bridgelabz.statement.services.JdbcImpl;


public class Jdbc implements JdbcImpl {
	static Connection con = JdbcConnectivity.getConnection();
	static Statement st = null;
	// com.bridgelabz.statement.repositary.JdbcConnectivity.getConnection();

	/**
	 * purpose: insert data into table
	 *
	 */
	public void insertDataStatment(Student student) throws SQLException {
		String query = "insert into student values(" +  student.getId() + "," + " '"
				+  student.getName() + "','" + student.getAddress() + "')";

		st = con.createStatement();

		st.executeUpdate(query);

	}

	/**
	 * purpose: read data from table
	 *
	 */

	public void readDataStatement() throws SQLException {
		String query = "select * from student";
		st = con.createStatement();
		ResultSet rs = st.executeQuery(query);
		while (rs.next()) {
			System.out.println("id: " + rs.getInt(1) + " name: " + rs.getString(2) + " address: " + rs.getString(3));
		}

	}

	/**
	 * purpose: update data into table
	 *
	 */
	public void updateDataStatement(int id, Student student) throws SQLException {
		String query = "update student set name='" + ((Student) student).getName() + "', address='"
				+ ((Student) student).getAddress() + "' where id=" + id + "";

//		st = con.createStatement();
		st.executeUpdate(query);

	}

	/**
	 * purpose: delete data to table
	 *
	 */
	public void deleteDataStatement(int id) throws SQLException {
		String query = "delete from student where id='" + id + "'";
		st = con.createStatement();
		st.executeUpdate(query);
	}

}
