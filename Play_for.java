package com.harish;

public class Play_for 
{

	public static void main(String[] args)
	{
		 
		for(int month=5,day=1;month==5;)
		{
		  System.out.println("Go to Play Day "+day);
		  day++;
		  if(day>31)
		  {
		    month = month + 1; 
		  }
		}		
	}

}

