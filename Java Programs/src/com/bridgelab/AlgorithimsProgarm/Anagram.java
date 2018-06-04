/******************************************************************************
 *  Purpose: for find out the anagarm of the String
 *
 *  @author AbhishekSingh  
 *  @version 1.0
 *  @since   05-03-2018
 *
 ******************************************************************************/

package com.bridgelab.AlgorithimsProgarm;

import com.bridgelab.utility.Utility;

public class Anagram {

	public static void main(String[] args) {
		Utility utility = new Utility();
		System.out.println("Enter first String ");
		String s1 = utility.inputString();
		s1 = s1.replaceAll("\\s","");
		System.out.println("Enter second string ");

		String s2 = utility.inputString();
		s2 = s1.replaceAll("\\s","");

		String string1 = s1.toLowerCase();
		String string2 = s2.toLowerCase();

		char char1[] = string1.toCharArray();
		char char2[] = string2.toCharArray();

		utility.anagram(char1, char2);

	}

}
