package com.harish;

public class Division5 
{

	public static void main(String[] args) 
	{
		Division5 div=new Division5();
		div.smallest_greatest_divisor(100);

	}
	private void smallest_greatest_divisor(int no) 
	{
	      int div = 2; 
	      int greatest = 0,smallest=0; 
	      while(div<=no/2)
	      {
	        if(no%div==0)
	        {
	          if(smallest == 0)
	            smallest=div;
	            greatest = div;
	        
	         }
	        div = div+1; 
	      }
	      System.out.println("Greatest Divisor is "+ greatest);
	      System.out.println("Smallest Divisor is "+ smallest);
	 }
	
	
	
}
