package com.bridgelab.Datastructure;

import com.bridgelab.utility.Utility;

public class UnorderdListNode {

	
	public static void main(String[] args) {

		LinkedList<Integer> linkedlist=new LinkedList<Integer>(); 	 
		Utility utility=new Utility();
		String string[]=utility.readListOfWords();


		for(int i=0;i<string.length;i++)
		{
			linkedlist.append((string[i]));
		}


		System.out.print("Enter the Key : ");

		String key=utility.inputString();
		boolean result=linkedlist.search(key);


		if(result)
		{
			System.out.println(key+" Key is Found ");
			linkedlist.remove(key);
			System.out.println(key+" Key is deleted ");
			System.out.println("updated list is ");
			Utility.writeFileOrUpdate(linkedlist);



		}
		else
		{
			linkedlist.add(key);
			System.out.println(key+" Key is not Found ");
			System.out.println(key+" Key is added ");
			System.out.println("updated list is ");
			Utility.writeFileOrUpdate(linkedlist);

		}

		linkedlist.iterate();
		linkedlist.size();



	

	
		
		
		
	}

}
