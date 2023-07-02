package com.harish;

public class Adder_Method_Overload
{
	   public static void main(String[] args)
	   {  
	      System.out.println(Adder_Method_Overload.add(11,11)); 
	 
	      System.out.println(Adder_Method_Overload.add(11,11,11));  
	   }
	   static int add(int a,int b)
	   {
	      return a+b;
	   }  
	   static int add(int a,int b,int c)
	   {
	      return a+b+c;
	   }  
}
