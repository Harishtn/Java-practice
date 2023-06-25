package com.harish;

public class School_Construct
{
	String name; //null
	int rollno;

	public School_Construct(String name, int rollno) 
	{
		System.out.println("How are you?");
		this.name = name; 
	    this.rollno = rollno;
	}
	//Constructor Overloading
	public School_Construct(String fname, String lname, int rollno) 
	{
		this.name=fname+lname;
		this.rollno=rollno;
		
	}
	public School_Construct()  //No-args Constructor or Zero Argument Constructor
	{
		System.out.println("No-args Constructor");
	}
	public static void main(String[] args) 
	{
		School_Construct stud1=new School_Construct("Bharani",101);
		School_Construct stud2=new School_Construct("Santhiya",102);
		School_Construct stud3=new School_Construct("harish",103);
		School_Construct stud4=new School_Construct("Kalai","arasan",104);
//		System.out.println(stud1.name);
//		System.out.println(stud2.name);
//		System.out.println(stud1.rollno);
//		System.out.println(stud2.rollno);
//		System.out.println(stud4.name);
		School_Construct stud5=new School_Construct();
		School_Construct stud6=new School_Construct();
		School_Construct stud7=new School_Construct();
		
		stud1.participate();
		stud2.write_exam();
		stud4.participate();
		
	}
	private void participate() 
	{
		System.out.println(rollno);
		
	}
	private void write_exam() 
	{
		System.out.println(name);
		
	}

}
