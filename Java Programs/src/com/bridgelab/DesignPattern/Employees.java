package com.bridgelab.DesignPattern;

import java.util.ArrayList;
import java.util.List;

public class Employees implements Cloneable {
	
	private List<String>empList;
	public Employees() {
		empList = new ArrayList<String>();
	}
	
	public Employees(List<String>list)
	{
		this.empList=list;
	}
	
	public void loadData() {
		empList.add("Pankaj");
		empList.add("Abhishek");
		empList.add("Rakesh");
		empList.add("Pardeep");
	}
	public List<String>getempList()
	{
		return empList;
	}
	
	public Object clone ()throws CloneNotSupportedException
	{
		List<String>temp=new ArrayList<String>();
		
		for(String s  : this.getempList())
		{
			temp.add(s);
		}
		return new Employees(temp);
	}

}
