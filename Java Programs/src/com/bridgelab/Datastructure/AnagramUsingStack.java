/******************************************************************************
 *  Purpose: for find out the anagarm using stack of the String
 *
 *  @author AbhishekSingh  
 *  @version 1.0
 *  @since   05-03-2018
 *
 ******************************************************************************/

package com.bridgelab.Datastructure;

import java.util.ArrayList;

import com.bridgelab.utility.LinkedStack;
import com.bridgelab.utility.Utility;


public class AnagramUsingStack {
	
	public static void main(String[] args) 
	{
		Utility utility = new Utility();
		LinkedStack ls = new LinkedStack();  
		ArrayList<Integer> arr = utility.primeNumbers(0,1000); 
		ArrayList<Integer> anagram = new ArrayList<Integer>();
		for(int ele : arr)
		{
			int temp = ele;
			int sum=0;
			while(temp!=0)
			{
				int rem = temp%10;
				sum =(sum*10)+rem;
				temp = temp/10;
			}
			if(arr.contains(sum))
			{
				anagram.add(sum);
				anagram.sort(null);
			}
		}
		for(int ele:anagram)
		{
			ls.push(ele);
		}
		ls.display();
	}


}
