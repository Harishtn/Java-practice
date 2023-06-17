package com.harish;

public class Divisor_for
{

	public static void main(String[] args) 
	{
		Divisor_for div=new Divisor_for();
		div.common_divisor(100,120);

	}

	private void common_divisor(int no1, int no2)
	{
		
		int greatest=-1;
	    //Ternary Operator
	    int small = no1<no2? no1:no2; 
	    
	    for(int div=2;div<=small;div++)
		{
			if(no1%div==0 && no2%div==0)
			{
				greatest=div;
			}			
		}
	    System.out.println("Greatest Divisor "+greatest);
		
	}

}
