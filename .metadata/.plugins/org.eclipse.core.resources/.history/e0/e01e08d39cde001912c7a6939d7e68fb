package com.bridgelabz.oops;

import java.util.Random;

import com.bridgelazs.utility.OopsUtility;
import com.bridgelazs.utility.Utility;

public class DeckOfCard 
{
 public static void main(String[] args) 
 {
	String [] suit= {"Clubs","Diamonds", "Hearts", "Spades"};
	String[] Rank= {"02", "03", "04", "05", "06", "07", "08", "09", "10","Jack", "Queen", "King","Ace"};
	String[][] array=new String[4][9];
	String [] cards=new String [52];
	int length=cards.length;
	Random random=new Random();
	
	
	while(length>0)
	{
		for(int i=0;i<4;i++) 
		{
			for(int j=0;j<13;j++)
			{
				cards[i]=suit[i]+Rank[12];
				
				length--;
			}
		}
	}
	int i=0;
	for(int j=0;j<cards.length;j++)
	{
		for(int j2=0;j2<cards[j].length();j2++) 
		{
			array[j][j2]=cards[i];
			i++;
		}
	}
	
		System.out.println(" deck of cards before sorting ");
		OopsUtility.showCards(array);
	
}
}