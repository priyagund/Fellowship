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
		String query="insert into student values(?,?,?)";
		PreparedStatement pst;
		try {
			pst = con.prepareStatement(query);
			con.setAutoCommit(false);
			pst.setInt(1, 32);
			pst.setString(2, "pratu");
			pst.setString(3, "pune");
			pst.executeUpdate();
			System.out.println("entry is added");
			/**
			 * create savepoint here therefore you rolleback the secont query
			 *
			 */
			
			Savepoint sp=con.setSavepoint();
			pst.setInt(1, 33);
			pst.setString(2, "pooja");
			pst.setString(3, "murud");
			
			pst.executeUpdate();
			con.rollback(sp);
			con.commit();
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}		

}