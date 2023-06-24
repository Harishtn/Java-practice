package com.harish;

public class Strong_for 
{

	public static void main(String[] args) 
	{
		int no = 145;
		Strong_for str=new Strong_for();
		int sum = str.find_strong_number(no);
		System.out.println(sum);
		if(sum==no)
		{
			System.out.println("It is a Strong Number");
		}
		else
		{
			System.out.println("It is not a Strong Number");

		}
	}
	private int find_strong_number(int no)
	{
		int sum = 0;
		for(int rem=0;no>0;no=no/10)
		{
			rem=no%10;
			int fact = find_fact(rem);
//			System.out.println(rem);
//			System.out.println(fact);
			sum=sum+fact;
			
		}
		return sum;
	}
	private int find_fact(int rem) 
	{
		int total=1;
		while(0<rem)
		{
			total=total*rem;
			rem=rem-1;
			
		}
		return total;
		//System.out.println(total);
	}	

}

