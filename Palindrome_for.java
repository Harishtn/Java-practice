package com.harish;

public class Palindrome_for
{

	public static void main(String[] args)
	{
		Palindrome_for pali=new Palindrome_for();
		int no=22;
		int output=pali.reverse_number(no);
		System.out.println("Reversed number is "+output);
		if(no==output)
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not Palindrome");
		}

	}

	private int reverse_number(int no) 
	{
		 int reverse = 0; 
		 for(int rem=0;no>0;no=no/10)
		 {
		      rem = no%10; //2
		      reverse = (reverse*10) + rem; //4
		    
		 }
		 //System.out.println(reverse);
		 return reverse;
	}

}

