package com.bridgelab.Datastructure;

import com.bridgelab.utility.Utility;

class OrderdNode<T>{

	T data;
	OrderdNode<T> next;

	OrderdNode(T data){
		this.data=data;
		this.next=null;
	}
}

public class OrderdLinkedList <T>{
	OrderdNode <T> first=null;
	OrderdNode <T> end;
	int count;
	public void iterate()
	{
		OrderdNode<T> temp = first;
		while(temp!=null)
		{
			System.out.print(temp.data+" ");
			temp = temp.next;
		}
	}




	public <T> void add(T value)
	{  

		OrderdNode  n= new OrderdNode (value);
		n.data=value;
		
		n.next=first;
		first=n;
	}


	public <T>void remove( T item) {
		OrderdNode temp = first;
		OrderdNode prev = first;

		if(first.data==item){
			first =first.next;

		}else {

			while(!item.equals(temp.data)) {
				prev=temp;
				temp =temp.next;
			}
			prev.next=temp.next;
		}


	}




	public <T> boolean search(T key)
	{
		OrderdNode temp = first;
		while(temp!=null)
		{

			if((temp.data).equals(key))
			{
				return true;

			}
			temp=temp.next;
		}
		return false;
	}

	public <T> boolean isEmpty()
	{
		if(first==null)

		{
			return true;
		}
		else 
		{
			return false;
		}
	}
	public int size()
	{
		OrderdNode<T> temp=first;
		int count =0;
		while(temp!=null)
		{
			temp=temp.next;
			count++;
		}

		return count;
	}

	public T pop()
	{
		if (first!=null)
		{
			OrderdNode <T>temp = first;
			first=first.next;
			return  temp.data;
		}
		return null;
	}

	public void display()
	{
		int size=size();
		OrderdNode<T> temp=first;
		for(int i=0;i<size;i++)
		{
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
	}

	public <T> void append(T value)
	{

		OrderdNode node=new OrderdNode(value);

		if(first==null)
			first=node;
		else
			end.next=node;

		end=node;
		count++;
	}
	
	
	public static <T extends Comparable<T>> String[] sortList(OrderdLinkedList<T> orderlinkedlist)
	{
		
		String string=orderlinkedlist.toString();
		System.out.println(string);
		String string1[]=string.split(" ");
		
		String array[]=Utility.bubbleSortInt(string1);
		Utility.print(array, array.length);
		
		return array;
	
		}
	
	    

	public String toString()
	{
		String string ="";
		OrderdNode<T> temp=first;
		while(temp!=null)
		{
			string=string+temp.data+" ";
			temp=temp.next;
		}
		return string;
	}


}
