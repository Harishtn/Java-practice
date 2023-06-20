package com.harish;

public class Perfect_for 
{

	public static void main(String[] args) 
	{
		Perfect_for pn=new Perfect_for();
		pn.perfect_number(496);

	}
	private void perfect_number(int no) 
	{
		int sum=0;
		for(int div=1,rem=0,mul=1;div<=no/2;div++)
		{
			rem=no%div;
			if(rem==0)
			{
				System.out.println(div);
				sum=sum+div;
			}
		}
		System.out.println(sum);
		if(no==sum)
		{
			System.out.println("It is a Perfect number");
		}
		else
		{
			System.out.println("It is not a Perfect number");
		}
	}

}
