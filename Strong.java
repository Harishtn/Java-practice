package com.harish;

public class Strong 
{
	public static void main(String[] args) 
	{
		int no = 145;
		Strong str=new Strong();
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
		while(no>0)
		{
			int rem=no%10;
			int fact = find_fact(rem);
//			System.out.println(rem);
//			System.out.println(fact);
			sum=sum+fact;
			no/=10;
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
