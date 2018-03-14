package com.bridgelab.utility;

import java.util.ArrayList;

public class PrimeAnagramUtility 
{
	/**
	 * @param primeArray
	 * @param anagarmArray
	 * @param primenumbers
	 * @return anagram numbers
	 */
	public static ArrayList<Integer> findAnagram(ArrayList<Integer> primeArray, ArrayList<Integer> anagarmArray, ArrayList<Integer> primenumbers) 
	{
		System.out.println("Anagram numbers");
		for (Integer ele : primeArray)
		{
			String string = Integer.toString(ele);
			int length = string.length(); 
			anagarmArray=permute(anagarmArray,string,0,length-1);
		}
		for (Integer ele : primeArray)
		{	
			String str = Integer.toString(ele);
			if(anagarmArray.contains(str))
			{
				anagarmArray.remove(str);
			}
		}
		
		for (Integer ele : primenumbers)
		{	
			String str = Integer.toString(ele);
			if(anagarmArray.contains(str))
			{
				anagarmArray.remove(str);
			}
		}
		return anagarmArray;
	}

	
	public static void printArrayElement(ArrayList<Integer> primeArray, ArrayList<Integer> anagarmArray) 
	{
		ArrayList<Integer> anagram = new ArrayList<Integer>();
		
		for (Integer ele : primeArray)
		{	
			String str = Integer.toString(ele);
			if(anagarmArray.contains(str))
			{
				anagram.add(Integer.parseInt((String)str));
			}
		}
		for(Integer ele : anagram)
		{
			System.out.print(ele+" ");
		}
		
	}
	
	
	public static  <T> ArrayList<Integer> permute(ArrayList anagarmArray,T str, int l, int r)
	{	//if string lenth is 1
    	if (l == r)
    	{
    		anagarmArray.add(str);
    	}
    	else
    	{	
    		for (int i = l; i <= r; i++)
    		{
        		str = (T) swap(str,l,i);
        		permute(anagarmArray, str, l+1, r);
        		str = (T) swap(str,l,i);
    		}
    	}
		return anagarmArray;
    	
	}

	// function to swap charactor in string
	
	public static <T> String swap(T a, int i, int j)
	{
		char temp;
		char[] charArray = ((String) a).toCharArray();
		temp = charArray[i] ;
		charArray[i] = charArray[j];
		charArray[j] = temp;
		return String.valueOf(charArray);
	}

	public static ArrayList palindromNumber(Integer[] array)
	{
		ArrayList primenumbers = new ArrayList();
		System.out.println("palindrome prime numbers are:");
        for(int i=0;i<array.length;i++)
        {
        	int num = array[i];
        	int temp = num;
        	int sum=0;
        	while (temp!=0)
        	{
        		int rem = temp%10;
        		sum = (sum*10)+rem;
        		temp = temp/10;
        	}
        	if (num == sum)
        	{
        		primenumbers.add(num);
        	}
        }
		return primenumbers;
	}
}
