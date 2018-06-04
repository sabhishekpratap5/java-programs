package com.bridgelab.AlgorithimsProgarm;

import com.bridgelab.utility.Utility;

public class BinaryNibbels {
	public static void main(String[] args)
	{
		Utility utility = new Utility();
		int lDecimalNumber;
		System.out.println("Enter the decimal no: ");
		lDecimalNumber = utility.inputInteger();
		//Utility.binarynumber(decimalnumber);
		String lBinaryString = Utility.tooBinary(lDecimalNumber);
		String swappedNibbles=Utility.swappedNibbles(lBinaryString);
		System.out.println(lBinaryString);
		System.out.println("After swapping nibbles");
		System.out.println(swappedNibbles);
		int lDecimalNumber1 = Utility.binaryToDecimal(swappedNibbles);
		System.out.println("Decimal number: " +lDecimalNumber1);
		boolean powerof2 = utility.isPowerOfTwo(lDecimalNumber1);
		if(powerof2)
		{
			System.out.println("it is power of two");
		}
		else
		{
			System.out.println("it is not power of two");
		}
		
		
		
	}
}
