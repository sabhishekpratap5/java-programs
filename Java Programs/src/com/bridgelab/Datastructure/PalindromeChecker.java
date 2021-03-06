/******************************************************************************
 *  Purpose: This program is refer for Palindrom Checking.
 *
 *  @author AbhishekSingh  
 *  @version 1.0
 *  @since   05-03-2018
 *
 ******************************************************************************/

package com.bridgelab.Datastructure;

import java.util.ArrayDeque;

import com.bridgelab.utility.Utility;

public class PalindromeChecker {

	public static void main(String[] args) 
	{
		Utility utility = new Utility();
		
		System.out.println("enter the string ");
		String string = utility.inputString();
		String reverse = "";
		ArrayDeque<Character> array = new ArrayDeque<Character>();
		utility.insertChar(string,array);
		reverse = utility.popChar(array,reverse);
		utility.checkPalindrom(string,reverse);
	}

}
