package com.bridgelab.Datastructure;

import com.bridgelab.utility.Utility;
public class BinarySearchTree {

	public static void main(String[] args) 
	{
		try
		{
			Utility utility = new Utility();
			System.out.println("how many time you want to check ");
			int noOfTime = utility.inputInteger();
			for (int i=1;i<=noOfTime;i++)
			{
				System.out.println("enter the number of node ");
				long node = utility.inputInteger();
				long count = utility.binarySearchTree((int) node);
				System.out.println(count);
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
