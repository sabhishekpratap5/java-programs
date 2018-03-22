/******************************************************************************
 *  Purpose: Interface for item element
 *
 *  @author AbhishekSingh  
 *  @version 1.0
 *  @since   05-03-2018
 *
 ******************************************************************************/

package com.bridgelab.DesignPattern;

public interface ItemElement {
	
	public int accept(ShoppingCartVisitor visitor);

}
