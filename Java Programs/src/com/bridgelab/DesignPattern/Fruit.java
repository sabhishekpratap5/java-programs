/******************************************************************************
 *  Purpose: its store the fruits information.
 *
 *  @author AbhishekSingh  
 *  @version 1.0
 *  @since   05-03-2018
 *
 ******************************************************************************/

package com.bridgelab.DesignPattern;

public class Fruit implements ItemElement {
	
	private int pricePerKg;
	private int weight;
	private String name;
	
	public Fruit(int priceKg,int wt,String name )
	{
		this.pricePerKg=priceKg;
		this.weight=wt;
		this.name=name;
	}
	
	public int getPricePerKg() {
		return pricePerKg;
	}
	public int getWeight() {
		return weight;
	}
	public String getName() {
		return name;
	}
	
	public int accept(ShoppingCartVisitor visitor) {
		return visitor.visit(this);
	}

}
