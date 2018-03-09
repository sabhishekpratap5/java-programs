package com.bridgelab.Datastructure;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class UserDefinedLinkedList<T>
{
	Node<T> frist=null;
		public  Node<T> list()
		{
			Node<T> n=new Node<T>();
			return n;
		}
		
		
	public void add(T item)
	{
		Node<T> n=list();
		n.data=item;
		n.next=null;
		n.next=frist;
		frist=n;
	}
	
	public void remove(T item)
	{
		Node<T> temp=frist;
		while(true)
		{
			if(temp.next.data.equals(item))
			{
				temp.next=temp.next.next;
				break;
			}
			temp=temp.next;
		}
	}
	
	public boolean search(T item)
	{
		Node<T> temp=frist;
		while(temp!=null)
		{
			if((temp.data).equals(item))
			{
				return true;
			}
			temp=temp.next;
		}
		return false;
		
	}
		public boolean isEmpty()
		{
			if(frist==null)
				return true;
			else
				return false;
		}
		
		
	public int size()
	{
		Node<T> temp=frist;
		int count=0;
		while(temp!=null)
		{
			count++;
			temp=temp.next;
		}
		return count;
		
	}
	
	
	public T pop()
	{
		if(frist!=null)
		{
		 Node<T> temp=frist;
		 frist=frist.next;
		 return temp.data;
		}
		return null;
	}
	public void disply()
	{
	   int size=size();
		Node<T> temp=frist;
		for(int i=0;i<size;i++)
		{
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
	}
	public void soting()
	{
		int length=size();
		Node<T>temp=frist;
		Node<T>temp1 = null;
		for (int i = 0; i < length; i++) {
			for (int j = 0; j < length - i - 1; j++) {

				if ((temp.data.compareTo(temp.next.data)>0)) {
					 temp1.data = temp.data;
					 temp.data = (T) temp.next.data;
					  temp.next.data=temp1.data;
				}
			}
		}
	}
	
}


class Node<T>
{
	T data;
	Node next; 

public class Test {

}
