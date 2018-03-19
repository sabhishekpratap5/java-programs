/******************************************************************************
 *  Purpose:for find out the 2D matrix 
 *
 *  @author  Abhishek Singh
 *  @version 1.0
 *  @since   05-03-2018
 *
 ******************************************************************************/

package com.bridgelab.functionalPrograms;

import com.bridgelab.utility.Utility;

public class Array2d {

	public static void main(String[] args) {
		Utility utility = new Utility();
		System.out.println("enter number of rows ");
		int m = utility.inputInteger();
		System.out.println("enter number of columns ");
		int n = utility.inputInteger();

		int a[][] = Utility.arrayInt(m, n);
		double b[][] = Utility.arrayDouble(m, n);
		String c[][] = Utility.arrayBoolean(m, n);

		Utility.display(a, b, c, m, n);

	}

}
