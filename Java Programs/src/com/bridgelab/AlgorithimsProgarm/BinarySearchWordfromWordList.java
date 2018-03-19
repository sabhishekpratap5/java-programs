/******************************************************************************
 *  Purpose: for search key using binary search from a file. 
 *
 *  @author  Abhishek Singh
 *  @version 1.0
 *  @since   05-03-2018
 *
 ******************************************************************************/

package com.bridgelab.AlgorithimsProgarm;

import java.util.Arrays;

import com.bridgelab.utility.Utility;

public class BinarySearchWordfromWordList {
	public static void main(String[] args) {
		Utility utility = new Utility();
		String string[] = utility.readWordFromFile();
		Arrays.sort(string);
		System.out.println("enter String ");

		String key = utility.inputString();
		utility.binarySearchInt(string, key);
		Utility.print(string, string.length);
	}

}
