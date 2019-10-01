package com.bridgelabz.datastructure;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class LinkListFileRead 
{
	
	public static void main(String[] args) throws IOException
	{    
		LinkedList<String> list=new LinkedList<String>();
		String[] array=new String[4];
		 String str=" ";
		 
		 File f=new File("/home/bridgeit/Desktop/priya/Felloship/CorePrograms/src/ListUnordered");
         FileReader fr=new FileReader(f);
         BufferedReader Br=new BufferedReader(fr);
          
          while((str=Br.readLine())!=null) {
    
        	  for(int i=0;i<array.length;i++)
        	  {
        		  array=str.split(" ");
        	  }
               for(int i=0;i<array.length;i++)
               System.out.print(array[i]+" ");
               System.out.println();
        	  System.out.println(array[1]);
          }
   
   
}

}