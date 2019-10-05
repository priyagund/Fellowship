package com.bridgelabz.prepared.services;

import java.sql.SQLException;

import com.bridgelabz.prepared.model.Student;

public interface ImplPrepared
{
	public int insertDataPrepared(Student student) throws SQLException;
	public void readDataPrepared()throws SQLException;
	public int updateDataPrepared(int id, Student student)throws SQLException;
	public int deleteDataPrepared(int id)throws SQLException;

 
	
}
