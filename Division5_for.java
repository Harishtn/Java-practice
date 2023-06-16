package com.harish;

public class Division5_for 
{

	public static void main(String[] args) 
	{
		Division5_for div=new Division5_for();
		div.smallest_greatest_divisor(100);

	}
	private void smallest_greatest_divisor(int no) 
	{
	      int greatest = 0,smallest=0; 
	      for(int div=2;div<=no/2;div++)
	      {
	        if(no%div==0)
	        {
	          if(smallest == 0)
	          {
	            smallest=div;
	          }
	          greatest = div;
	        
	        } 
	      }
	      System.out.println("Greatest Divisor is "+ greatest);
	      System.out.println("Smallest Divisor is "+ smallest);
	 }		
	
}
