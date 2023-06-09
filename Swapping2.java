package com.harish;

public class Swapping2
{

	public static void main(String[] args) 
	{
		Swapping2 sw=new Swapping2();
		sw.swap_water(100,200);

	}
	private void swap_water(int no1, int no2)
	{
		System.out.println("no1 "+no1);
		System.out.println("no2 "+no2);   
		no1=no1+no2; // Without the inclusion of third variable in swapping
		no2=no1-no2;
		no1=no1-no2;
		System.out.println("no1 "+no1);
		System.out.println("no2 "+no2);
		
	}

}
