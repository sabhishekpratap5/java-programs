/******************************************************************************
 *  Purpose: LinkedList Program
 *
 *  @author AbhishekSingh  
 *  @version 1.0
 *  @since   05-03-2018
 *
 ******************************************************************************/

package com.bridgelab.Datastructure;

class MyNode<T> {

	T data;
	MyNode<T> next;

	MyNode(T data) {
		this.data = data;
		this.next = null;
	}
}

public class LinkedList<T> {
	MyNode<T> first = null;
	MyNode<T> end;
	int count;

	public void iterate() {
		MyNode<T> temp = first;
		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
	}

	public <T> void add(T value) {

		MyNode n = new MyNode(value);
		n.data = value;
		n.next = null;
		n.next = first;
		first = n;
	}

	public <T> void remove(T item) {
		MyNode temp = first;
		MyNode prev = first;

		if (first.data == item) {
			first = first.next;

		} else {

			while (!item.equals(temp.data)) {
				prev = temp;
				temp = temp.next;
			}
			prev.next = temp.next;
		}

	}

	public <T> boolean search(T key) {
		MyNode temp = first;
		while (temp != null) {

			if ((temp.data).equals(key)) {
				return true;

			}
			temp = temp.next;
		}
		return false;
	}

	public <T> boolean isEmpty() {
		if (first == null)

		{
			return true;
		} else {
			return false;
		}
	}

	public int size() {
		MyNode<T> temp = first;
		int count = 0;
		while (temp != null) {
			temp = temp.next;
			count++;
		}

		return count;
	}

	public T pop() {
		if (first != null) {
			MyNode<T> temp = first;
			first = first.next;
			return temp.data;
		}
		return null;
	}

	public void display() {
		int size = size();
		MyNode<T> temp = first;
		for (int i = 0; i < size; i++) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
	}

	public <T> void append(T data) {
		add(data);
	}
	
	public String toString()
	{
     MyNode forword=first;
     String str="";
     while(forword!=null)
     {
      str=str+forword.data+" ";
      forword=forword.next;
     // System.out.println("r1");
     }
     return str; 		
	}

}
