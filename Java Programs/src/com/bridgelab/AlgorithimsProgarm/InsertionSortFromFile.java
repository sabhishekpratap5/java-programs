/******************************************************************************
 *  Purpose: for find out the sorted array from a file using insertionsort. 
 *
 *  @author  Abhishek Singh
 *  @version 1.0
 *  @since   05-03-2018
 *
 ******************************************************************************/

package com.bridgelab.AlgorithimsProgarm;

import com.bridgelab.utility.Utility;

public class InsertionSortFromFile {
	public static void main(String[] args) {
		Utility utility = new Utility();
		String string[] = utility.insertionSortFromFile();

		utility.insertionSortString(string);
		utility.print(string, string.length);
	}

}
