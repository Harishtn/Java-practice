package com.harish;

public class Division4_for 
{

	public static void main(String[] args) 
	{
		Division4_for div=new Division4_for();
		div.find_smallest_divisor(49);

	}
	private void find_smallest_divisor(int no) 
	{
		  
		    int smallest = -1; 
		    for(int div=2;div<=no/2;div++)
		    {
		      if(no%div==0)
		      {
		        smallest = div; 
		        break; 
		      }
		    }
		    System.out.println("The smallest divisor is "+ smallest);	
	}

}

