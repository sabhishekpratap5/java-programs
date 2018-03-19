/******************************************************************************
 *  Purpose: for find out Binary number of the decimal number
 *
 *  @author  Abhishek Singh
 *  @version 1.0
 *  @since   05-03-2018
 *
 ******************************************************************************/

package com.bridgelab.AlgorithimsProgarm;

import com.bridgelab.utility.Utility;

public class ToBinary {
	public static void main(String[] args) {
		Utility utility = new Utility();
		int num, array[] = new int[32];

		System.out.println("Please Enter the Number ");
		num = utility.inputInteger();
		int[] string = utility.toBinary(num);
		array = string;

		System.out.println();

	}

}
