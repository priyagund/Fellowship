package com.bridgelabz.loginpage.controller;



import java.sql.SQLException;
import java.util.Scanner;

import com.bridgelabz.loginpage.model.Student;
import com.bridgelabz.loginpage.services.ImplStudentLogin;

public class StudentLogin
{
  public static void main(String[] args) throws SQLException 
{
	  ImplStudentLogin studentlogin=new ImplStudentLogin();
	  Student student=new Student();
	  Scanner scanner=new Scanner(System.in);
	  
	  boolean exit=true;
	  
	  while(exit)
	  {
		  System.out.println("enter choice\n1.student login\n2.resgister student\n3.exit");
		  int choice=scanner.nextInt();
		  switch(choice)
		  {
		  case 1:
			  System.out.println("enter your id");
			  int id=scanner.nextInt();
			  
			  System.out.println("enter your name");
			  String name=scanner.next();
			  student = studentlogin.checkStudent(id, name);
			  
				if (student != null) {
					if (student.getId() > 0) {
						System.out.println(student.getId());
						System.out.println(student.getName());
						System.out.println(student.getAddress());
						System.out.println("login successfully");
					}
					else 
					{
						System.out.println("student not fount ");
						
					}
					
				}
				   break;
				  
				
				case 2:
					System.out.println("enter student detail for register");
					System.out.println("enter student id");
					int regId=scanner.nextInt();
					student.setId(regId);
					System.out.println("enter student  name for register");
					String regName=scanner.next();
					student.setName(regName);
					System.out.println("enter student address for register");
					String regAddress=scanner.next();
					student.setAddress(regAddress);
					
					if(studentlogin.checkStudent(regId, regName).getName()==null)
					{
						studentlogin.insertStudent(student);
						System.out.println("you have been register successfully");
						
		            }
					else {
						
						System.out.println("student already register");
					}
					break;
				
				case 3: 
					 exit=false;
					 System.out.println("thank you for being with us");
					
					
	  }
		  
	  
	  } 
	  
	scanner.close();
	

}
} 
