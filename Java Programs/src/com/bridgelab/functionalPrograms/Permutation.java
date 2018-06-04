/******************************************************************************
 *  Purpose: for find out the permutation of the string 
 *
 *  @author  Abhishek Singh
 *  @version 1.0
 *  @since   05-03-2018
 *
 ******************************************************************************/

package com.bridgelab.functionalPrograms;

import com.bridgelab.utility.Utility;

public class Permutation {

	public static void main(String[] args) {
		Utility utility = new Utility();

		String string = "wxyz";
		int stringLength = string.length();
		utility.permute(string, 0, stringLength - 1);
	}

}