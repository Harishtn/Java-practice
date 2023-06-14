package com.harish;

public class Armstrong_for 
{

	public static void main(String[] args) 
	{
		int no=1634;
		int num=no;
		int count=0;
		for(;no>0;count++)
		{
			no=no/10;
		}
		System.out.println("The count is "+count);
		int total=0;
		for(no=1634;no>0;)
		{
			int rem=no%10;
			//System.out.println(rem);
			int result=find_power(rem,count);
			total=total+result;
			no=no/10;
		}
		System.out.println("The total is "+total);
		if(num==total)
		{
			System.out.println("It is an Armstrong Number");
		}
		else
		{
			System.out.println("It is not an Armstrong Number");
		}
	}
	private static int find_power(int rem, int count) 
	{
		int result=1;
		for(;count>0;count--)
		{
			result=result*rem;
		}
		return result;
	}	
	
}
