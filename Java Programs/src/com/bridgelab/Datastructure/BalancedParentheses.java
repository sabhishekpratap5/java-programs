package com.bridgelab.Datastructure;

import com.bridgelab.utility.Utility;

public class BalancedParentheses {
	public static void main(String[] args) 
	{
		Utility utility = new Utility(); 
		
		boolean result=false;
		System.out.println("enter arithmatic expression ");
		String string =utility.inputString();
		if(string.length()==0) 
		{
			System.out.println(" enter the expression ");
		}
		else
		{	
			result = utility.balancedParentheses(string);
			if(result == true) 
			{
				System.out.println("it is a valid expression ");
			}
			else
			{
				System.out.println("it is not valid expression ");
			
			}
		}
	}

}
