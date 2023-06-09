package com.harish;

public class LCM2 
{

	public static void main(String[] args) 
	{
		LCM2 least=new LCM2();
		least.find_lcm(3,5);

	}
	private void find_lcm(int no1, int no2) 
	{
		int big=no1>no2?no1:no2;
		int temp=big;
		System.out.println(big);
		while(true)  
		{
		    if(big%no1 ==0 && big%no2==0)
		    {
		      System.out.println("The LCM is "+ big);
		      break;
		    }
		    big = big + temp; 
		}
		
	}

}
