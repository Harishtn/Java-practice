package com.harish;

public class Reverse 
{

	public static void main(String[] args) 
	{
		int cake = 1234; 
		int count=0;
		while(cake>0)
	    {
		    System.out.println(cake%10);    
		    cake = cake/10;
		    count+=1;
		
		}
		System.out.println("The count is "+count);
		
	}

}
