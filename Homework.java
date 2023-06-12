package com.harish;

public class Homework 
{

	public static void main(String[] args) 
	{
		Homework plan=new Homework();
		//plan.h1();
		//plan.h2();
		//plan.h3();
		//plan.h4();
		//plan.h5();
		//plan.h6();
		//plan.h7();
		
	}
	private void h1()
	{
		int number=1;
		
		while(number<6)
		{
			System.out.println("The number is "+number);
			number=number+1;
			
		}
	}
		
	private void h2()
	{
		int number=2;
		
		while(number<=10)
		{
			System.out.println("The number is "+number);
			number=number+2;	
			
		}
		
	}
	
	private void h3() 
	{
        int number=3;
		
		while(number<=15)
		{
			System.out.println("The number is "+number);
			number=number+3;
		}
	
	}
	
	private void h4() 
	{
        int number=1;
		
		while(number<10)
		{
			System.out.println("The number is "+number);
			number=number+2;
		}
	}
	
	private void h5() 
	{
		int day=1;
		int number=1;
		
		while(day<=5)
		{
			
			System.out.println("The number is:" +number);
			day=day+1;
			number=number+day;
			
		}
	}
	
	private void h6()
	{
	
		int i=1;  //initialization
		while(i<6)  // condition
		{
			System.out.println(i+" * "+(i+1));    
			i=i+1;  //increment
		}
	}
		
	private void h7()
	{
		int i=1;  //initialization
	    while(i<6)  // condition
	    {
	      System.out.println(i+" * "+(i+1)+" * "+(i+2));    
	      i=i+1;  //increment
	    }
		
	
	}
	
	
}
