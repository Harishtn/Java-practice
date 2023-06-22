package com.harish;

public class Sequence_for 
{

	public static void main(String[] args) 
	{
		for(int no=1;no<=10;no+=2)        //2<=9
		{
		    System.out.print(no+" "); //1
		    if(no==9)
		    {
		        no = 0; 
		    }
		}
	}
}
