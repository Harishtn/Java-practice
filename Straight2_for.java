package com.harish;

public class Straight2_for 
{

	public static void main(String[] args) 
	{
		Straight2_for obj=new Straight2_for();
		obj.straight_order(123456);
		obj.straight_order2(123456);
	}
	private void straight_order(int no) 
	{
		
	    for(int div=10000;div>=1;div=div/100)
	    {
	    System.out.println(no/div);  
	    no = no%div; 
	     
	    }
		
	}
	private void straight_order2(int no) 
	{
		for(int div=1000;div>=1;div=div/1000)
	    {
	    System.out.println(no/div);  
	    no = no%div; 
	    
	    }
		
	}

}
