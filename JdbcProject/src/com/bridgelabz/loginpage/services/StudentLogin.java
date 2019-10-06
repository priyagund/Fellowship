package com.bridgelabz.loginpage.services;

import java.sql.SQLException;

import com.bridgelabz.loginpage.model.Student;

public interface StudentLogin
{
 
 public Student checkStudent(int id,String name) throws SQLException;
 public int insertStudent(Student student) throws SQLException;
 
 
}
