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
