package com.harish;

public class Perfect 
{

	public static void main(String[] args) 
	{
		 Perfect pn=new Perfect();
		 pn.perfect_number(496);

	}

	private void perfect_number(int no) 
	{
		int div=1;
		int rem=0;
		int sum=0;
		while(div<=no/2)
		{
			rem=no%div;
			if(rem==0)
			{
				System.out.println(div);
				sum=sum+div;
			}
			div=div+1;
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
