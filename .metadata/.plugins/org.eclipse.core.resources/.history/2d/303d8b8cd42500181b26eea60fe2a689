package com.bridgelab.Datastructure;

import com.bridgelab.utility.Utility;

public class OrderdList {
	
	public static void main(String[]args)
	{
		OrderdLinkedList<Integer> orderdlinkedlist=new OrderdLinkedList<Integer>(); 	 
		Utility utility=new Utility();
		String string[]=utility.readListOfInteger();


		for(int i=0;i<string.length;i++)
		{
			orderdlinkedlist.append(Integer.parseInt(string[i]));
		}


		System.out.print("Enter the Key : ");

		int key=utility.inputInteger();
		boolean result=orderdlinkedlist.search(key);


		if(result)
		{
			System.out.println(key+" Key is Found ");
			orderdlinkedlist.remove(key);
			System.out.println(key+" Key is deleted ");
			System.out.println("updated list is ");
			
			
			
			String array[]=OrderdLinkedList.sortList(orderdlinkedlist);
			Utility.writeFileOrUpdateIntegerfile(array);



		}
		else
		{
			orderdlinkedlist.add(key);
			System.out.println(key+" Key is not Found ");
			System.out.println(key+" Key is added ");
			System.out.println("updated list is ");
			
			String array[]=OrderdLinkedList.sortList(orderdlinkedlist);
			Utility.writeFileOrUpdateIntegerfile(array);

		}

		//orderdlinkedlist.iterate();
		orderdlinkedlist.size();


	}


}
