package com.harish;

public class Fibonacci2 
{

	public static void main(String[] args) 
	{
		Fibonacci2 fib=new Fibonacci2();
		fib.fib_without_third_variable();

	}
	private void fib_without_third_variable()
	{
		    int a = 0, b = 1; 
		    int count = 0; 
		    while(count<10)
		    {
		      System.out.print(a+" ");
		      a = b-a; 
		      b = a+b; 
		      count=count+1; 
		    }	  
	}

}
