package com.harish;

public class Sequence 
{

	public static void main(String[] args) 
	{
		int no = 1; 
		while(no<=10)        //2<=9
		{
		    System.out.print(no+" "); //1
		    if(no==9)
		    {
		        no = 0; 
		    }
		    no+=2; //2
		}
	}

}
