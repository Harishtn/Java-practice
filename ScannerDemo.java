package com.harish;

import java.util.Scanner;

public class ScannerDemo 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
//	    System.out.println("Enter no1: ");
//	    int no1 = sc.nextInt();
//	    
//	    System.out.println("Enter no2: ");
//	    int no2 = sc.nextInt(); 
//	    
//	    System.out.println("Result is ");
//	    System.out.println(no1*no2);
	    
//	    System.out.println("Tell me your name: "); 
//	    String name = sc.next(); 
//	    System.out.println("Welcome to IT World "+ name);
	    
//	    System.out.println("Tell me your name "); 
//	    String name1 = sc.nextLine(); 
//	    System.out.println("Welcome to IT World "+ name1);
		
		System.out.println("Tell me any no: "); 
	    int no = sc.nextInt();
	    while(no>=1)
	    {
	      System.out.println(no); 
	      no--; 
	    }

	}

}
