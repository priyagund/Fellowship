package com.bridgelabz.statement.services;

import java.sql.SQLException;

import com.bridgelabz.statement.model.Student;

public interface JdbcImpl
{
	public void insertDataStatment(Student student) throws SQLException;
	public void readDataStatement()throws SQLException;
	public void updateDataStatement(int id, Student student)throws SQLException;
	public void deleteDataStatement(int id)throws SQLException;

}
