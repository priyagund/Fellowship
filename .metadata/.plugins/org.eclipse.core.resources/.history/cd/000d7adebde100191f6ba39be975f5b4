package com.bridgelazs.utility;

import com.bridgelabz.model.Address;
import com.bridgelabz.model.Person;

public class OopsUtility
{
   Person person=new Person();
	public static void showCards(String[][]player) 
	{
		for(int i=0;i<player.length;i++)
		{
			for(int j=0;j<player[i].length;j++) 
			{
				player[i][j]=player[i][j].replaceAll("11","jack" );
				player[i][j]=player[i][j].replaceAll("12","queen" );
				player[i][j]=player[i][j].replaceAll("13","king" );
				player[i][j]=player[i][j].replaceAll("14","Ace" );
				System.out.println(player[i][j]);
			}
		}
		for(int i=0;i<player.length;i++) 
		{
			for(int j=0;j<player[i].length;j++) 
			{
				System.out.print(player[i][j]);
			}
		}
			System.out.println();
			
			
	}

	
		public static String[] sortCards(String[] player) {
			String temp = "";
			for (int j = 0; j < player.length; j++) {
				for (int j2 = j+1; j2 < player.length; j2++) {
					int len1 = player[j].length() - 1;
					int len2 = player[j2].length() - 1;
					int n1 = player[j].charAt(len1) + (player[j].charAt(len1 - 1)) * 10;
					int n2 = player[j2].charAt(len2) + (player[j2].charAt(len2 - 1)) * 10;
					if (n1 > n2) {
						temp = player[j];
						player[j] = player[j2];
						player[j2] = temp;
					}

				}
			}
			
			return player;
		}
		
		
		public static void addPerson()
		{    Person person=new Person();
		     Address address=new Address();
			System.out.println("enter first name");
			person.setName(Utility.getStr());
			System.out.println("enter last name");
			person.setLastname(Utility.getStr());
			System.out.println("enter state name");
			address.setCity(Utility.getStr());
			System.out.println("enter city name ");
			address.setCity(Utility.getStr());
			System.out.println("enter zip code");
			address.setZip(Utility.getStr());
			
		}
		
		
      
		
}
