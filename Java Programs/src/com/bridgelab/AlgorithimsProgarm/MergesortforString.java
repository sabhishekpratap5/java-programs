/******************************************************************************
 *  Purpose: for find out the sorted stringarray using merge sort. 
 *
 *  @author  Abhishek Singh
 *  @version 1.0
 *  @since   05-03-2018
 *
 ******************************************************************************/

package com.bridgelab.AlgorithimsProgarm;

import com.bridgelab.utility.Utility;

public class MergesortforString {

	public static void printArray(char array[]) {
		int number = array.length;
		for (int i = 0; i < number; ++i)
			System.out.print(array[i]);
		System.out.println();
	}

	public static void main(String args[]) {
		Utility utility = new Utility();
		System.out.println("enter string");
		String str = utility.inputString();
		char array[] = str.toCharArray();

		utility.stringSort(array, 0, array.length - 1);
		printArray(array);

	}

}
