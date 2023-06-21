package com.harish;

public class Puzzle3_for 
{

	public static void main(String[] args) 
	{
		Puzzle3_for plan=new Puzzle3_for();
		plan.minister();

	}
	private void minister() 
	{
		double amount=1;
		double total=0;
		for(int day=1;day<=64;day++)
		{
			total=total+amount;
			amount=amount*2;
			System.out.println("Daily:"+day+":"+amount);	
			
		}
		System.out.println("Total value is "+ total);
		
	}

}

