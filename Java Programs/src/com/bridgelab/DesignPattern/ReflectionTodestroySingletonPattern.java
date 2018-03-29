/******************************************************************************
 *  Purpose: Refelection to destroy singleton pattern
 *
 *  @author AbhishekSingh  
 *  @version 1.0
 *  @since   05-03-2018
 *
 ******************************************************************************/

package com.bridgelab.DesignPattern;

import java.lang.reflect.Constructor;

public class ReflectionTodestroySingletonPattern {
	public static void main(String[] args) {
		EagerInitialization instanceOne= EagerInitialization.getInstance();
		EagerInitialization instanceTwo= null;
		try {
			 Constructor[] constructors = EagerInitialization.class.getDeclaredConstructors();
			for(Constructor constructor : constructors)
			{
				//constructor.setAccessible(true);
				instanceTwo=(EagerInitialization)
						constructor.newInstance();
				break;
			}
			
			
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
			
		}
		System.out.println(instanceOne.hashCode());
		System.out.println(instanceTwo.hashCode());
	}

}
