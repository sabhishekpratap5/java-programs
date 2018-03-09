package com.bridgeit.Programs;
import java.util.ArrayList;
import java.util.NoSuchElementException;
import com.bridgeit.Utility.*;
/*  Class linkedStack  */
class linkedQueue
{
    protected Node front, rear;
    public int size;
 
    /* Constructor */
    public linkedQueue()
    {
        front = null;
        rear = null;
        size = 0;
    }    
    /*  Function to check if queue is empty */
    public boolean isEmpty()
    {
        return front == null;
    }    
   
    /*  Function to insert an element to the queue */
    public void insert(int data)
    {
        Node nptr = new Node(data, null);
        if (rear == null)
        {
            front = nptr;
            rear = nptr;
        }
        else
        {
            rear.setLink(nptr);
            rear = rear.getLink();
        }
        size++ ;
    }    
    /*  Function to remove front element from the queue */
    public Object remove()
    {
        if (isEmpty() )
            throw new NoSuchElementException("Underflow Exception");
        Node ptr = front;
        front = ptr.getLink();        
        if (front == null)
            rear = null;
        size-- ;        
        return ptr.getData();
    }    
    
    /*  Function to display the status of the queue */
    public void display()
    {
        System.out.print("\nQueue = ");
        if (size == 0)
        {
            System.out.print("Empty\n");
            return ;
        }
        Node ptr = front;
        while (ptr != rear.getLink() )
        {
            System.out.print(ptr.getData()+" ");
            ptr = ptr.getLink();
        }
        System.out.println();        
    }
}
public class Queue 
{
	public static void main(String[] args) 
	{
		Utility u = new Utility();
		linkedQueue ls = new linkedQueue();  
		ArrayList<Integer> arr = u.primeNumbers(0,1000); 
		ArrayList<Integer> anagram = new ArrayList<Integer>();
		for(int ele : arr)
		{
			int temp = ele;
			int sum=0;
			while(temp!=0)
			{
				int rem = temp%10;
				sum =(sum*10)+rem;
				temp = temp/10;
			}
			if(arr.contains(sum))
			{
				anagram.add(sum);
				anagram.sort(null);
			}
		}
		for(int ele:anagram)
		{
			ls.insert(ele);
		}
		ls.display();
	}
}
