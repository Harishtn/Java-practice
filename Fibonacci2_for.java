package com.harish;

public class Fibonacci2_for 
{

	public static void main(String[] args) 
	{
		Fibonacci2_for fib=new Fibonacci2_for();
		fib.fib_without_third_variable();

	}
	private void fib_without_third_variable()
	{
		    for(int a=0,b=1,count=0;count<10;count++)
		    {
		      System.out.print(a+" ");
		      a = b-a; 
		      b = a+b; 
		    }	  
	}

}

