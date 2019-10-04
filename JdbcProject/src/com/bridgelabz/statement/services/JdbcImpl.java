package com.bridgelabz.model;

import java.sql.SQLException;

public interface JdbcImpl
{
	
 public void insertDataStatment(Object student) throws SQLException;
 public void readDataStatement()throws SQLException;
 public void updateDataStatement(int id, Object student)throws SQLException;
 public void deleteDataStatement(int id)throws SQLException;


 
}
