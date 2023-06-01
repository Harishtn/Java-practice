package com.harish;

public class Division {

	public static void main(String[] args) 
	
	{
		int no=100;
		int div=1;
		int count=0;
		
		while(div<=no)
		{
			if(no%div==0)
			{
				System.out.println("The dvisior is "+div);
				count=count+1;
			}
		div=div+1;
			
		}
		System.out.println("The count is "+count);
		
	}

}
