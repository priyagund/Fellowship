package com.bridgelabz.controller;

import java.sql.SQLException;
import java.util.Scanner;

import com.bridgelabz.model.Student;
import com.bridgelabz.services.Jdbc;

public class Test 
{
 public static void main(String[] args)  {
	 Jdbc jdbc=new Jdbc();
	 Scanner scanner = new Scanner(System.in);
	 Student student=new Student();
	 
	 System.out.println("Enter student id  : ");
		student.setId(scanner.nextInt());
		System.out.println("Enter student name : ");
		student.setName(scanner.next());
		System.out.println("Enter student address  : ");
		student.setAddress(scanner.next());
		try {
			jdbc.insertDataStatment(student);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("value inserted  succesfully ");
	 
	
}
}
