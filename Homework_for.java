package com.harish;

public class Homework_for 
{

	public static void main(String[] args) 
	{
		Homework_for plan=new Homework_for();
		//plan.h1();
		//plan.h2();
		//plan.h3();
		//plan.h4();
		//plan.h5();
		//plan.h6();
		plan.h7();
		
	}
	private void h1()
	{
		for(int number=1;number<6;number++)
		{
			System.out.println("The number is "+number);
			
		}
	}	
	private void h2()
	{
		for(int number=1;number<6;number=number+2)
		{
			System.out.println("The number is "+number);
			
		}
		
	}
	private void h3() 
	{
        for(int number=3;number<=15;number=number+3)
		{
			System.out.println("The number is "+number);
		}
	
	}
	private void h4() 
	{	
        for(int number=1;number<10;number=number+2)
		{
			System.out.println("The number is "+number);
		}
	}
	private void h5() 
	{
		for(int day=1,number=1;day<=5;day++,number=number+day)
		{
			
			System.out.println("The number is:" +number);
			
		}
	}
	private void h6()
	{
		for(int i=1;i<6;i++)
		{
			System.out.println(i+" * "+(i+1));    
			
		}
	}	
	private void h7()
	{
		for(int i=1;i<6;i++)
	    {
	      System.out.println(i+" * "+(i+1)+" * "+(i+2));    
	
	    }	
	
	}	
	
}
