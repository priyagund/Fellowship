package com.bridgelabz.prepared.controller;

import java.sql.SQLException;
import java.util.Scanner;

import com.bridgelabz.model.Student;
import com.bridgelabz.prepared.services.JdbcPrepared;
import com.bridgelabz.statement.services.Jdbc;

public class CRUDPrepared
{
	public static void main(String[] args) throws SQLException  {
		 JdbcPrepared jdbc=new JdbcPrepared();
		 Scanner scanner = new Scanner(System.in);
		 Student student=new Student();
		 boolean exit=true;
		 while(exit)
		 {
			 System.out.println("enter choice\n1.insert value into table\n2.update value\n3.delete value\n4.read table ");
			 int choice=scanner.nextInt();
			  switch(choice)
			  {
			  case 1:
				    System.out.println("Enter student id  : ");
					student.setId(scanner.nextInt());
					System.out.println("Enter student name : ");
					student.setName(scanner.next());
					System.out.println("Enter student address  : ");
					student.setAddress(scanner.next());
				    jdbc.insertDataPrepared(student);
					System.out.println("value inserted  succesfully ");
					
					break;
					
			  case 2:
				    jdbc.readDataPrepared();
		    	    System.out.println("enter id for update");
		    	    int id=scanner.nextInt();
		    	    System.out.println("enter new name");
		    	    student.setName(scanner.next());
		    	    System.out.println("enter new address");
		    	    student.setAddress(scanner.next());
		    	    jdbc.updateDataPrepared(id, student);
		    	    jdbc.readDataPrepared();
		    	    break;
		    	    
			  case 3:
				     jdbc.readDataPrepared();
			    	 System.out.println("enter id for delete the data");
			    	 int id1=scanner.nextInt();
			    	 jdbc.deleteDataPrepared(id1);
			    	 jdbc.readDataPrepared();
			    	 System.out.println("data deleted successfully");
			    	 break;
			    	 
			case 4: jdbc.readDataPrepared();
	    	       break;  	
	    	       
		   default :
			   System.out.println("you enter wrong choice");
			  
			  }
			  
			 
			  
		 }	  
			 
			 
			 
	}		 
			 
			 
			 
			 
 }
		 
		 
		 
		 
		 
		 
		 

