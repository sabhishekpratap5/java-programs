package com.bridgelab.utility;


import java.util.Comparator;

import org.json.simple.JSONObject;


public class Sort implements Comparator<Object> 
{
	String str ;
	public Sort(String str) 
	{
		this.str =str;
	}

	public int compare(Object o1, Object o2) 
	{
		JSONObject obj1=(JSONObject)o1;  
		JSONObject obj2=(JSONObject)o2;  
		return (obj1.get(str).toString()).compareTo(obj2.get(str).toString());
	}

}
