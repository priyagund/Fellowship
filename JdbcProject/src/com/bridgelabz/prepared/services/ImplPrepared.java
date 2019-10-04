package com.bridgelabz.prepared.services;

import java.sql.SQLException;

public interface ImplPrepared
{
	public void insertDataPrepared(Object student) throws SQLException;
	public void readDataPrepared()throws SQLException;
	public void updateDataPrepared(int id, Object student)throws SQLException;
	public void deleteDataPrepared(int id)throws SQLException;

 
	
}
