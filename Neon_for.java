package com.harish;

public class Neon_for 
{

	public static void main(String[] args) 
	{
		int no=9;
		int res=0;
		int rem=no*no;
		System.out.println(rem);
		for(;rem>0;rem=rem/10)
		{
			int no2=rem%10;
			res=no2+res;
		}
		System.out.println(res);
		if(res==no)
		{
			System.out.println(no+ " is a Neon number");
		}
		else
		{
			System.out.println(no+ " is not a Neon number");
		}
	}
}
