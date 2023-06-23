package com.harish;

public class Straight_for 
{

	public static void main(String[] args) 
	{
		Straight_for obj=new Straight_for();
		obj.straight_order(1234);
		
	}
	private void straight_order(int no) 
	{
	    for(int div=1000;div>=1;div=div/10)
	    {
	    System.out.println(no/div);  
	    no = no%div; 
	    }
	    
	}

}