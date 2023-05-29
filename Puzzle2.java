package com.harish;

public class Puzzle2 
{

	public static void main(String[] args) 
	{
		Puzzle2 plan=new Puzzle2();
		plan.father_plan();
	}

	private void father_plan() 
	{
			
			int day=1;
			int savings=0;
			
			while(day<=10)
			{
				savings=savings+day;
				System.out.println("Daily:"+savings);
				day=day+1;
				
			}
			System.out.println("Total Savings is:"+savings);
			
		
	}
	

}
