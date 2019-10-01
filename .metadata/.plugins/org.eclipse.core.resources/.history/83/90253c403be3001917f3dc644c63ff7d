/******************************************************************************
* 
 Purpose: Read in the following message: Hello <<name>>, We have your full
		  name as <<full name>> in our system. your contact number is 91-xxxxxxxxxx.
		  Please,let us know in case of any clarification Thank you BridgeLabz 01/01/2016.
		  Use Regex to replace name, full name, Mobile#, and Date with proper value. 

*
*  @author  Priyanka gund
*  @version 1.0
*  @since   13-09-2019
*
******************************************************************************/
package com.bridgelabz.controller;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.bridgelazs.utility.Utility;
 
public class RegularExpression 
{
 public static void main(String[] args) 
 {   
	Scanner scanner= new Scanner(System.in);
	String str= " Hello <<name>>, We have your full\n" + 
			"name as <fullName> in our system. your contact number is 91-xxxxxxxxxx.\n" + 
			"Please,let us know in case of any clarification Thank you BridgeLabz 01/01/2016.";
	String firstName,MobNumber = "", fullName ="",Date="";
	boolean match,match1,match2;
	

		System.out.println("enter your firstname");
		firstName=scanner.nextLine();
		
		System.out.println("enter your fullname");
		fullName=scanner.nextLine();
		
		
		System.out.println("enter your mobNumber");
		MobNumber=scanner.nextLine();
		
		System.out.println("enter your date");
		Date=scanner.nextLine();
		
		Pattern pattern=Pattern.compile("[a-zA-Z]+");
        Matcher m = pattern.matcher(firstName); 

		
		Pattern p1=Pattern.compile("[a-zA-Z]{3,20}[\\s]{1}[a-zA-Z]{3,20}[\\s]{1}[a-zA-Z]{3,20}$");
        Matcher m1 = p1.matcher(fullName); 

		Pattern p2=Pattern.compile("[7-9]{1}[0-9]{9}");
        Matcher m2 = p2.matcher(MobNumber); 
        
        Pattern p3=Pattern.compile("[1-31]{1}/[1-12]{1}/[1-9]{4}");
        Matcher m3 = p3.matcher(Date);


        if(m.matches()&&m1.matches()&&m2.matches())
		{
			 str=str.replace("<<name>>", firstName);
			 str=str.replace("<fullName>", fullName);
			 str=str.replace("xxxxxxxxxx", MobNumber);
			 str=str.replace("01/01/2016", Date);

			System.out.println(str);

		}
    
	}
	
	
}

