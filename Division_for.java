package com.harish;

public class Division_for
{

	public static void main(String[] args)
	{

		int count=0;
		for(int no=100,div=1;div<=no;div++)
		{
			if(no%div==0)
			{
				System.out.println("The divisor is "+div);
				count=count+1;
			}	
		}
		System.out.println("The count is "+count);
		
	}

}
