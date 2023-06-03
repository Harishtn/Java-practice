package com.harish;

public class Straight
{

	public static void main(String[] args)
	{
		Straight obj=new Straight();
		obj.straight_order(1234);
		
	}
	private void straight_order(int no) 
	{
	    int div = 1000;
	    while(div>=1)
	    {
	    System.out.println(no/div+ " ");  // ==> 1
	    no = no%div; //no = 234
	    div = div/10; 
	    }
	    
	}

}
