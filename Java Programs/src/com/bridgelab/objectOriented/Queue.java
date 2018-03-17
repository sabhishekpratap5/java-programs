/******************************************************************************
 *  Purpose:Logic of Queue. 
 *
 *  @author  Abhishek Singh
 *  @version 1.0
 *  @since   05-03-2018
 *
 ******************************************************************************/
package com.bridgelab.objectOriented;

import java.util.NoSuchElementException;

import com.bridgelab.utility.Node;


class Queue
{
    protected Node front, rear;
    public int size;
 
    /* Constructor */
    public Queue()
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
    public void insert(String symbol)
    {
        Node nptr = new Node(symbol, null);
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
