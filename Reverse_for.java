package com.harish;

public class Reverse_for 
{

	public static void main(String[] args) 
	{
		
		int count=0;
		for(int cake=1234;cake>0;count++)
	    {
		    System.out.println(cake%10);    
		    cake = cake/10;
		}
		System.out.println("The count is "+count);
		
	}

}