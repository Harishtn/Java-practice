package com.harish;

public class Puzzle 
{

	public static void main(String[] args) 
	{
		Puzzle plan=new Puzzle();
		plan.daughter_plan();
	}
	
	void daughter_plan()
	{
		
		int day=1;
		int packet_money=5;
		int savings=0;
		
		while(day<=10)
		{
			savings=savings+packet_money;
			System.out.println("Daily:"+savings);
			day=day+1;
			
		}
		System.out.println("Total Savings is:"+savings);
		
		
	}	
		
}
