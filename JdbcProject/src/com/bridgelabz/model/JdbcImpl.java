package com.bridgelabz.model;

import java.sql.SQLException;

public interface JdbcImpl
{
	
 public void insertDataStatment(Object student) throws SQLException;
 public void readDataStatement();
 public void updateDataStatement();
 public void deleteDataStatement();
 
}
