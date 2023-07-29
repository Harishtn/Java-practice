package com.harish;

public class School2_Construct 
{
	
		int num;
		String name;
		public School2_Construct(int i, String string)
		{
			i=num;
			string=name;
		}
		public School2_Construct() 
		{
			
		}
		public static void main(String[] args) 
		{
		    School2_Construct teacher=new School2_Construct();
		    School2_Construct teach=new School2_Construct(123,"Hari");
		    System.out.println(teach.name);    
		}
}

