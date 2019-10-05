package com.jdbc.savepoint.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Savepoint;

import com.bridgelabz.statement.repositary.JdbcConnectivity;

public class SavePointTranscation implements ImplSavePoint 
{

	public void transcation()  
	{
		Connection con=JdbcConnectivity.getConnection();
		//PreparedStatement pst=null;
		String query="insert into student(?,?,?)";
		PreparedStatement pst;
		try {
			pst = con.prepareStatement(query);
			con.setAutoCommit(false);
			pst.setInt(1, 9);
			pst.setString(2, "pratu");
			pst.setString(3, "pune");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			Savepoint sp=con.setSavepoint();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		pst.setInt(1, 6);
		pst.setString(2, "akshay");
		pst.executeUpdate();
		con.rollback(sp);
		con.commit();
	}
	
}
