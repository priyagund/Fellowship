package com.bridgelabz.prepared.services;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import com.bridgelabz.prepared.model.Student;

import com.bridgelabz.statement.repositary.JdbcConnectivity;

public class JdbcPrepared implements ImplPrepared {
	static Connection con = JdbcConnectivity.getConnection();
	static PreparedStatement pst = null;

	public int insertDataPrepared(Student student) throws SQLException {
		String query = "insert into student values (?,?,?)";

		pst = con.prepareStatement(query);

		pst.setInt(1, student.getId());
		pst.setString(2, (student.getName()));
		pst.setString(3, (student.getAddress()));
		return pst.executeUpdate();

		// System.out.println(count + "row/s updated");
		// return count;
	}

	@Override
	public void readDataPrepared() {
		String query = "select * from student";
		try {
			pst = con.prepareStatement(query);
			ResultSet rs = pst.executeQuery();

			while (rs.next()) {
				System.out
						.println("id: " + rs.getInt(1) + " name: " + rs.getString(2) + " address: " + rs.getString(3));
			}
		} catch (SQLException e) {

			e.printStackTrace();
		}

	}

	@Override
	public int updateDataPrepared(int id, Student student) {

		String query = "UPDATE student SET name=?, address=? WHERE id=?";

		try {

			pst = con.prepareStatement(query);
			pst.setString(1, student.getName());
			pst.setString(2, student.getAddress());
			pst.setInt(3, id);
			return pst.executeUpdate();
		} catch (SQLException e) {

			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public int deleteDataPrepared(int id) {
		String query = "delete from student where id=?";
		try {
			pst = con.prepareStatement(query);
			pst.setInt(1, id);
			return pst.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;

	}

}
