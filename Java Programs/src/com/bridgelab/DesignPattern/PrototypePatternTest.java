package com.bridgelab.DesignPattern;

import java.util.List;

public class PrototypePatternTest {
	public static void main(String[] args)throws CloneNotSupportedException
	{
		Employees emps = new Employees();
		emps.loadData();
		
		//use clone method to get employees object.
		
		Employees empsNew = (Employees)emps.clone();
		Employees empsNew1 = (Employees)emps.clone();
		
		List <String>list=empsNew.getempList();
		list.add("john");
		List<String>list1 = empsNew1.getempList();
		list1.remove("Pankaj");
		System.out.println("emp list : "+emps.getempList());
		System.out.println("empNew list : "+list);
		System.out.println("empNew1 list : "+list1);
		
	}

}
