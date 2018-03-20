package com.bridgelab.DesignPattern;

public class EagerInitialization {
	
	 private static final EagerInitialization instance = new EagerInitialization();
	 
	 public static EagerInitialization getInstance()
	 {
		 return instance;
	 }

}
