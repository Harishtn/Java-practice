package com.harish;

public class Fibonacci 
{
	public static void main(String[] args)
	{
		Fibonacci fibo=new Fibonacci();
		fibo.find_fibonacci();

	}
	private void find_fibonacci() 
	{
		// 0  1  1  2  3  5  8  13
	    int a = 0, b = 1; 
	    while(a<=13)
	    {
	    	int c = a + b; 
	    	System.out.print(a+" ");
	    	a = b; 
	    	b = c; 
	    }
		
	}

}
