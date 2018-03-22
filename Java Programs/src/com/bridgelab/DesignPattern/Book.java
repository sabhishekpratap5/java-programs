/******************************************************************************
 *  Purpose: its store the information of Books.
 *
 *  @author AbhishekSingh  
 *  @version 1.0
 *  @since   05-03-2018
 *
 ******************************************************************************/

package com.bridgelab.DesignPattern;

public class Book implements ItemElement{
	private int price;
	private String isbnNumber;
	
	public Book(int cost,String isbn)
	{
		this.price = cost;
		this.isbnNumber=isbn;
	}
	
	public int getPrice() {
		return price;
	}
	public String getIsbnNumber() {
		return isbnNumber;
	}
	public int accept(ShoppingCartVisitor visitor)
	{
		return visitor.visit(this);
	}

}
