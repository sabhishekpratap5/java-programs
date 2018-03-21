package com.bridgelab.DesignPattern;

public class EagerInitialization {
	
	 private static final EagerInitialization INSTANCE = new EagerInitialization();
	 
	 public static EagerInitialization getInstance()
	 {
		 return INSTANCE;
	 }

}
