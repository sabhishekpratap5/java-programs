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
		Utility.insertChar(string,array);
		reverse = Utility.popChar(array,reverse);
		Utility.checkPalindrom(string,reverse);
	}

}
