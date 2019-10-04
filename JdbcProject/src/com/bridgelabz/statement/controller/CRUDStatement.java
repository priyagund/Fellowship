package com.bridgelabz.statement.controller;

import java.sql.SQLException;
import java.util.Scanner;

import com.bridgelabz.model.Student;
import com.bridgelabz.statement.services.Jdbc;

public class CRUDStatement 
{
 public static void main(String[] args) throws SQLException  {
	 Jdbc jdbc=new Jdbc();
	 Scanner scanner = new Scanner(System.in);
	 Student student=new Student();
	 boolean exit=true;
	 while(exit) 
	 {
			 System.out.println("enter choice\n1.insert value into table\n2.update value\n3.delete value\n4.read table\n5.exit ");
			 int choice=scanner.nextInt();
		     switch(choice)
		     {
		     case 1:
		             //insert data into table
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
						
						break;
						
		     case 2:
		    	     // update date to table
		    	    jdbc.readDataStatement();
		    	    System.out.println("enter id for update");
		    	    int id=scanner.nextInt();
		    	    System.out.println("enter new name");
		    	    student.setName(scanner.next());
		    	    System.out.println("enter new address");
		    	    student.setAddress(scanner.next());
		    	    jdbc.updateDataStatement(id, student);
		    	    jdbc.readDataStatement();
		    	    break;
		    	    
		     case 3:
		    	 // delete data 
		    	 
		    	 jdbc.readDataStatement();
		    	 System.out.println("enter id for delete the data");
		    	 int id1=scanner.nextInt();
		    	 jdbc.deleteDataStatement(id1);
		    	 jdbc.readDataStatement();
		    	 System.out.println("data deleted successfully");
		    	 break;
		    	 
		     case 4:// read table data	 
		    	 
		    	    //System.out.println("show table");
		    	    jdbc.readDataStatement();
		    	    break;
		     case 5:exit=false;  
		    	 
		    default :
		    	System.out.println("you enter wrong choice");
		    	
		    	
		    	
				 
		     }
		     
		     
		        
			 
		     
	 
		     
	  
	
	 }	 
  
	 
 }
 
}
