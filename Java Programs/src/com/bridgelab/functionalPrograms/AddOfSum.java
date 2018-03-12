/******************************************************************************
 *  Purpose: for find out the triplets which sum have 0. 
 *
 *  @author  Abhishek Singh
 *  @version 1.0
 *  @since   05-03-2018
 *
 ******************************************************************************/

package com.bridgelab.functionalPrograms;

import com.bridgelab.utility.Utility;

public class AddOfSum {
	public static void main(String[] args) {
		Utility utility = new Utility();
		System.out.print("enter size of array ");
		int size = utility.inputInteger();
		int array[] = new int[size];

		for (int i = 0; i < array.length; i++) {
			System.out.print("enter " + (i + 1) + " value :");

			array[i] = utility.inputInteger();
		}

		int sum = utility.addOfSum(array, size);
		System.out.println("Number of tripltes :" + sum);

	}

}
