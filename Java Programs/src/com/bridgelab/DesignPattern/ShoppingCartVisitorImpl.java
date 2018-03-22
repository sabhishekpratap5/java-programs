/******************************************************************************
 *  Purpose:Shoping cart visitors impliments
 *
 *  @author AbhishekSingh  
 *  @version 1.0
 *  @since   05-03-2018
 *
 ******************************************************************************/
package com.bridgelab.DesignPattern;

public class ShoppingCartVisitorImpl implements ShoppingCartVisitor {
	
	public int visit(Book book) {
		int cost=0;
		if (book.getPrice()>50)
		{
			cost=book.getPrice()-5;
		}
		else {
			cost=book.getPrice();
		}
		System.out.println("Book ISBN: "+book.getIsbnNumber() + " cost ="+cost);
		return cost;
	}
	public int visit(Fruit fruit)
	{
		int cost = fruit.getPricePerKg()*fruit.getWeight();
		System.out.println(fruit.getName() + " cost = "+cost);
		return cost;
	}

}
