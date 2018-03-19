package com.bridgelab.AlgorithimsProgarm;

import com.bridgelab.utility.Utility;

public class BinaryNibbels {
	public static void main(String[] args) 
	{
		Utility utility=new Utility();
		 
	        System.out.println("enter decimal number ");
	        int decimal=utility.inputInteger();
	        String binary=utility.binaryAddPadding(decimal);
	        System.out.println("8 bit binary number is "+binary);
	        
	        String nibbles=utility.swapNibbles(binary);
	        System.out.println("after swaping of the nibbles are ");
	        System.out.println(nibbles);
       
	}

}
