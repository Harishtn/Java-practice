package com.harish;

public class Division2_for 
{

	public static void main(String[] args)
	{
		Division2_for loopingObj = new Division2_for(); 
	    int count = loopingObj.count_divisors(100);
	    loopingObj.find_prime_no(count);
	    
	}
	private void find_prime_no(int count) 
	{
		    
		    if(count==0)
		    {
		      System.out.println("Prime number");
		    }
		    else
		    {
		      System.out.println("Not Prime");
		    }
	}
	
	private int count_divisors(int no) 
	{
			int count=0;
			for(int div=2;div<no;div++)
			{
				if(no%div==0)
			      {
			        count = count + 1; 
			      }
			}
			System.out.println("The count is "+count);
			return count;
	}
}
