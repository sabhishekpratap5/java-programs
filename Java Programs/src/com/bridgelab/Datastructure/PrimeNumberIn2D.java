/******************************************************************************
 *  Purpose: this program is refer for Prime number which is store in 2D Array.
 *
 *  @author AbhishekSingh  
 *  @version 1.0
 *  @since   05-03-2018
 *
 ******************************************************************************/

package com.bridgelab.Datastructure;

import java.util.ArrayList;

import com.bridgelab.utility.Utility;

public class PrimeNumberIn2D {
	public static void main(String[] args) 
	{
		Utility utility = new Utility();
		
		ArrayList<Integer> arr = utility.primeNumbers(0,1000);
		utility.print2DArray(arr);
	}

}
