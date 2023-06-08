package com.harish;

public class Divisor 
{

	public static void main(String[] args) 
	{
		Divisor div=new Divisor();
		div.common_divisor(100,120);

	}

	private void common_divisor(int no1, int no2)
	{
		int div=2;
//		int small = 0; 
//	    if(no1<no2)
//	    {
//	      small = no1; 
//	    }
//	    else
//	    {
//	      small = no2; 
//	    }
		int greatest=-1;
	    //Ternary Operator
	    int small = no1<no2? no1:no2; 
	    
	    while(div<=small)
	//	while(div<=no1/2 && div<=no2/2)
		{
			if(no1%div==0 && no2%div==0)
			{
				
				//System.out.println(div+ " is common divisor");
				greatest=div;
			}
			div+=1;		
				
		}
	    System.out.println("Greatest Divisor "+greatest);
		
	}

}
