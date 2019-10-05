package com.bridgelabz.prepared.controller;

import java.sql.SQLException;
import java.util.Scanner;

import com.bridgelabz.prepared.model.Student;
import com.bridgelabz.prepared.services.JdbcPrepared;


public class CRUDPrepared
{
	public static void main(String[] args) throws SQLException  {
		 JdbcPrepared jdbc=new JdbcPrepared();
		 Scanner scanner = new Scanner(System.in);
		
		 boolean exit=true;
		 while(exit)
		 {
			 System.out.println("enter choice\n1.insert value into table\n2.update value\n3.delete value\n4.read table\n5.exit ");
			 int choice=scanner.nextInt();
			  switch(choice)
			  {
			  case 1: Student student=new Student();
				    System.out.println("Enter student id  : ");
					student.setId(scanner.nextInt());
					System.out.println("Enter student name : ");
					student.setName(scanner.next());
					System.out.println("Enter student address  : ");
					student.setAddress(scanner.next());
				    //jdbc.insertDataPrepared(student);
					System.out.println(jdbc.insertDataPrepared(student)+"student inserted successfully");
					
					break;
					
			  case 2:Student studentUpdate=new Student();
				    jdbc.readDataPrepared();
		    	    System.out.println("enter id for update");
		    	    int id=scanner.nextInt();
		    	    System.out.println("enter new name");
		    	    studentUpdate.setName(scanner.next());
		    	    System.out.println("enter new address");
		    	    studentUpdate.setAddress(scanner.next());
		    	   
		    	    jdbc.readDataPrepared();
		    	    System.out.println(jdbc.updateDataPrepared(id, studentUpdate)+"student data updated");
		    	    break;
		    	    
			  case 3:
				     jdbc.readDataPrepared();
			    	 System.out.println("enter id for delete the data");
			    	 int id1=scanner.nextInt();
			    
			    	 System.out.println(jdbc.deleteDataPrepared(id1)+"data deleted successfully");
			    	 jdbc.readDataPrepared();
			    	 break;
			    	 
			case 4: jdbc.readDataPrepared();
	    	        break; 
	    	       
			case 5: exit=false;
	    	       
		   default :
			   System.out.println("you enter wrong choice");
			  
			  }
			  
			 
			  
		 }	  
			 
			 
			 
	}		 
			 
			 
			 
			 
 }
		 
		 
		 
		 
		 
		 
		 

