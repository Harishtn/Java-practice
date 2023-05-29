package com.harish;

public class Puzzle3 
{

	public static void main(String[] args) 
	{
		Puzzle3 plan=new Puzzle3();
		plan.minister();

	}

	private void minister() 
	{
		int day=1;
		double amount=1;
		double total=0;
		
		while(day<=64)
		{
			total=total+amount;
			amount=amount*2;
			System.out.println("Daily:"+day+":"+amount);
			day=day+1;
			
		}
		System.out.println("Total value is "+ total);
		
	}

}
