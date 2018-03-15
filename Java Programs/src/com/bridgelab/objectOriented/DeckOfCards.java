package com.bridgelab.objectOriented;

import java.util.Arrays;

public class DeckOfCards 
{
	public static void main(String[] args) 
	{
	    String[] suits = {"Clubs", "Diamonds", "Hearts", "Spades"};
	    
	    String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10","Jack", "Queen", "King", "Ace"};
	    String array [][] = new String[4][9];
	    // initialize deck
	    int n = suits.length * ranks.length;
	    String[] deck = new String[n];
	    for (int i = 0; i < ranks.length; i++) 
	    {
	        for (int j = 0; j < suits.length; j++) 
	        {
	            deck[suits.length*i + j] = ranks[i] + "->" + suits[j];
	        }
	    }
	
	    // shuffle
	    for (int i = 0; i < n; i++) 
	    {
	        int r = i + (int) (Math.random() * (n-i));
	        String temp = deck[r];
	        deck[r] = deck[i];
	        deck[i] = temp;
	    }
	  // print shuffled deck
	
	    for (int i = 0; i < 4; i++)
	    {
	        for (int j = 0; j < 9; j++) 
	        {
	            array[i][j]=(deck[i + j * 4]);
	        }
	    }
	    
	    for(int i=0;i<array.length;i++)
	    {
	    	for(int j=0;j<array[i].length;j++)
	    	{
	    		System.out.println(array[i][j]);
	    		
	    	}
	    	System.out.println();
	    }
    
	    System.out.println("--------------------------------------------------------------------");
	   for (String outer[] : array) 
	   {
	       Arrays.sort(outer);

	       for (String integer : outer) 
	       {
	           System.out.println(integer);
	       }
	       System.out.println();
	   }

	}
}