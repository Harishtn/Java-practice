package com.harish;


public class Reverse2 
{

	public static void main(String[] args) 
	{
		Reverse2 rev=new Reverse2();
		rev.sum_of_digits(1234);

	}
	private void sum_of_digits(int no) 
	{
	    int sum = 0; 
	    while(no>0)
	    {
	      int rem = no%10; //3
	      sum = sum + rem; //7
	      no = no/10; //12
	    }
	    System.out.println("The sum is:" +sum);
	    
	}
}
