package com.bridgelab.objectOriented;

import java.util.Arrays;
import java.util.Random;

import com.bridgelab.utility.Utility;

public class SortByRank
{
	public static void main(String[] args) 
	{
		Utility utility = new Utility();
		int[] deck = new int[52];
		String[] arr= new String[52];
		String[] suits = {"Spades", "Hearts", "Diamonds", "Clubs"};
		String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
		utility.initialize(deck);
		utility.shuffleCards(deck);
		utility.generateCard(arr,deck,suits,ranks);
		utility.distribute(deck,arr);
	}
	public static void distribute(int[] deck, String[] arr) 
	{
		String arr1[][] = new String[4][9];
	    Random r = new Random();
	    int m = deck.length;
	    for(int i=0;i<4;i++)
		{
			for(int j=0;j<9;j++)
			{	
				int a = r.nextInt(m);
				arr1[i][j] = arr[a];
			}
		}
	   for(int i=0;i<arr1.length;i++)
		{	
			for(int j=0;j<arr1[i].length;j++)
			{
				System.out.print(arr1[i][j]);
			}
			System.out.println();
		}
	   System.out.print("-------------------------------------------------------------");
	   for (String outer[] : arr1) 
	   {
	       Arrays.sort(outer);

	       for (String integer : outer) {
	           System.out.print(integer);
	       }
	       System.out.println();
	   }
	    
	}

}
