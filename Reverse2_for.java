package com.harish;

public class Reverse2_for
{

	public static void main(String[] args) 
	{
		Reverse2_for rev=new Reverse2_for();
		rev.sum_of_digits(1234);

	}
	private void sum_of_digits(int no) 
	{
	    int sum = 0; 
	    for(int rem=0;no>0;no=no/10)
	    {
	      rem = no%10; 
	      sum = sum + rem;
	    }  
	    System.out.println("The sum is:" +sum);
	    
	}
}

