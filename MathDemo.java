package com.harish;

public class MathDemo 
{

	public static void main(String[] args) 
	{
		MathDemo md=new MathDemo();
		//md.Math_functions();
		//md.find_sqrt(64);
		//md.find_floor(35.6);
		//md.find_ceil(65.2);
		//md.find_max(20,5);
		//md.find_min(10,20);
		//md.find_abs(-125);
		//int result=md.find_power(10,3);
		//System.out.println("The power is "+result);
		//double sign=md.find_sign(5);
		//System.out.println(sign);
		//md.find_roundoff(99.123);
	}
	private void Math_functions() 
	{
		int no = -125; 
	    System.out.println(no);
	    
	    no = Math.abs(no);
	    System.out.println(no);
	    
	    double d = 1.23456789;
	    d = Math.ceil(d);
	    System.out.println(d);
	    
	    d = Math.floor(1.23456789);
	    System.out.println(d);
	    
	    d = Math.pow(10, 2);    //Method Calling
	    System.out.println(Math.pow(10, 2));
	    
	    System.out.println(Math.sqrt(64));
		
	}
	private void find_sqrt(int no) 
	{
		int div = 2; 
		while(div<=no/2) 
		{
		    if(no/div == div)
		    {
		      System.out.println("Square root is "+ div);
		      break;
		    }
		    div = div+1; 
		}
		
	}
	private void find_floor(double no) 
	{
		System.out.println(no);
	    
		int no2 = (int)no;      //Type Casting: 
	    //Converting from one datatype to another datatype
	    
	    System.out.println((double)no2);
		
	}
	private void find_ceil(double no) 
	{
		  System.out.println(no);    //64.0
		  
		  int no2 = (int)no;      //64; 
		  
		  if(no2 == no)          //no2 = 64, no = 64.0
		  {
		      System.out.println(no2);
		      //System.out.println("Hi");
		  }
		  else
		  {
		      System.out.println((double)no2+1);
		      //System.out.println("Hello");
		  }    
		
	}
	private void find_max(int no1, int no2)
	{
		 if(no1>no2)
		 {
		      System.out.println(no1);
		 }
		 else
		 {
		      System.out.println(no2);
		 }
	
	}
	private void find_min(int no1, int no2)
	{
		 if(no1<no2)
		 {
		      System.out.println(no1);
		 }
		 else
		 {
		      System.out.println(no2);
		 }
	
	}
	private void find_abs(int no) 
	{
		 if(no>0)
		 {
		      System.out.println(no);
		 }
		 else
		 {
		      System.out.println(no*-1);
		 }
		
	}
	private int find_power(int a, int b) 
	{
		 int p = 1;
		 while(b>0)
	     {
		     p = p * a; 
		     b = b - 1; 
		 }
		 //System.out.println("Power is "+ p);
		 return p;
		
	}
	private double find_sign(int no) 
	{
	    if(no>0)
	      return 1.0;
	    else if(no<0)
	      return -1.0;
	    else
	      return 0.0;
	    
	}
	private void find_roundoff(double d) 
	{
		 double d1 = d - (int)d; 
		 //System.out.println(d1);
		 if(d1<0.5)
		 {
		      System.out.println((int)d);
		 }
		 else
		 {
		      System.out.println((int)d+1);
		 }
		
	}
	

}
