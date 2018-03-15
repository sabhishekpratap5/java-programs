package com.bridgelab.objectOriented;

import java.util.NoSuchElementException;

import com.bridgelab.utility.Node;


public class Stack 
{
	
    protected Node top ;
    protected int size ;
 
    /*  Constructor  */
    public Stack()
    {
        top = null;
        size = 0;
    }    
    /*  Function to check if stack is empty */
    public boolean isEmpty()
    {
        return top == null;
    }    
       
    /*  Function to push an element to the stack */
    public void push(String symbol)
    {
        Node nptr = new Node (symbol, null);
        if (top == null)
            top = nptr;
        else
        {
            nptr.setLink(top);
            top = nptr;
        }
        size++ ;
    }    
    /*  Function to pop an element from the stack */
    public Object pop()
    {
        if (isEmpty() )
            throw new NoSuchElementException("Underflow Exception") ;
        Node ptr = top;
        top = ptr.getLink();
        size-- ;
        return ptr.getData();
    }    
     
    /*  Function to display the status of the stack */
    public void display()
    {
        System.out.print("\nStack = ");
        if (size == 0) 
        {
            System.out.print("Empty\n");
            return ;
        }
        Node ptr = top;
        while (ptr != null)
        {
            System.out.print(ptr.getData()+" ");
            ptr = ptr.getLink();
        }
        System.out.println();        
    }

}
