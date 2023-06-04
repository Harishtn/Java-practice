package com.harish;

public class Straight2 
{

	public static void main(String[] args) 
	{
		Straight2 obj=new Straight2();
		obj.straight_order(123456);
		obj.straight_order2(123456);
	}

	private void straight_order(int no) 
	{
		int div = 10000;
	    while(div>=1)
	    {
	    System.out.println(no/div);  
	    no = no%div; 
	    div = div/100; 
	    }
		
	}
	private void straight_order2(int no) 
	{
		int div = 1000;
	    while(div>=1)
	    {
	    System.out.println(no/div);  
	    no = no%div; 
	    div = div/1000; 
	    }
		
	}

	
	
	
}
