/******************************************************************************
 *  Purpose:Shoping cart for visitors.
 *
 *  @author AbhishekSingh  
 *  @version 1.0
 *  @since   05-03-2018
 *
 ******************************************************************************/
package com.bridgelab.DesignPattern;

public interface ShoppingCartVisitor {
	int visit(Book book);
	int visit(Fruit fruit);

}
