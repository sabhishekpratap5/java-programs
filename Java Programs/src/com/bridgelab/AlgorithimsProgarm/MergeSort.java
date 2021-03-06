/******************************************************************************
 *  Purpose: for find out the sorted array using merge sort
 *
 *  @author  Abhishek Singh
 *  @version 1.0
 *  @since   05-03-2018
 *
 ******************************************************************************/

package com.bridgelab.AlgorithimsProgarm;

import com.bridgelab.utility.Utility;

public class MergeSort {

	public static void main(String args[]) {
		Utility utility = new Utility();
		System.out.println("enter array length ");
		int number = utility.inputInteger();
		int array[] = new int[number];

		System.out.println("enter array elements ");
		for (int i = 0; i < number; i++) {
			array[i] = utility.inputInteger();
		}

		System.out.println("Given Array ");
		utility.printArray(array);

		utility.sort(array, 0, array.length - 1);

		System.out.println("\nSorted array");
		utility.printArray(array);
	}
}
