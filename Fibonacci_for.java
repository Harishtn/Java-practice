package com.harish;

public class Fibonacci_for 
{

	public static void main(String[] args) 
	{
		Fibonacci_for fibo=new Fibonacci_for();
		fibo.find_fibonacci();

	}
	private void find_fibonacci() 
	{
		// 0  1  1  2  3  5  8  13
	    for(int a=0,b=1;a<=13;)
	    {
	    	int c = a + b; 
	    	System.out.print(a+" ");
	    	a = b; 
	    	b = c; 
	    }
		
	}

}

