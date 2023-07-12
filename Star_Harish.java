package com.harish;

public class Star_Harish 
{

	public static void main(String[] args) 
	{
		Star_Harish sh= new Star_Harish();
		sh.pattern_H();
		System.out.println();
		sh.pattern_A();
		System.out.println();
		sh.pattern_R();
		System.out.println();
		sh.pattern_I();
		System.out.println();
		sh.pattern_S();
		System.out.println();
		sh.pattern_H2();
		
	}
	private void pattern_H() 
	{
		for(int line=1;line<=7;line++)
		{
			if(line<=7)
			{
				for(int star=1;star<=7;star++)
				{
					if(star==1 || star==7 || line==4)
					{
						System.out.print("* ");
					}
					else
					{
						System.out.print("  ");
					}
				}
				System.out.println("");
			}
		}
	}
	
	private void pattern_A() 
	{
		 for (int line = 1; line<=7; line++) 
		 {
	          for (int star = 1; star <=7; star++) 
	          {
	                if(line==1)
	                {
	                  if(star==1||star==7)
	                    System.out.print("  ");
	                  else
	                    System.out.print("* ");
	                }
	                else
	                {
	                  if(star==1||star==7||line==4)
	                  {
	                    System.out.print("* ");
	                  }
	                  else
	                  {
	                    System.out.print("  ");
	                  }
	                
	                }
	           }
	           System.out.println();
	      }
	}
	private void pattern_R()
	{
		 for (int line = 1; line<=7; line++) 
		 {
	           for (int star= 1; star <=7; star++)
	           {
	              if(line==1|| line==4|| star==1)
	              {
	                if(line==1 && star==1||line==1 && star==7||line==4 && star==7)
	                {
	                   System.out.print("  ");
	                }
	                else
	                {
	                  System.out.print("* ");
	                }   
	              }
	              else
	              {
	                if(line==5 && star==5||line==6 && star==6||line==7 && star==7||line==2 && star==7||line==3 && star==7)
	                {
	                  System.out.print("* ");
	                }
	                else
	                {
	                  System.out.print("  ");
	                }
	              }
	                
	           }
	           System.out.println();
	            
	      }
	    
	}
	private void pattern_I() 
	{
		for(int star=1; star<=7; star++)
		 {
		     System.out.print("* ");
		 }
		 System.out.println();
		 for(int star=1; star<=6; star++)
		 {
			 for(int space=1; space<=6; space++)
		     {
		        System.out.print(" ");
		     }
		     System.out.println("* ");
		 }
		 for(int star=1; star<=7; star++)
		 {
		     System.out.print("* ");
		 }		
	}
	private void pattern_S() 
	{
	    for (int line = 1; line<=7; line++) 
	    {
	         for (int star = 1; star <=7; star++) 
	         {
	              if(line==1||line==4||line==7)
	              {
	                if(line==1 && star==1||line==4 && star==1||line==4 && star==7||line==7 && star==7)
	                {
	                	System.out.print("  ");
	                }
	                else
	                {
	                	System.out.print("* ");
	                }
	              }
	              else if(line==2 && star==1||line==3 && star==1||line==5 && star==7||line==6 && star==7)
	              {
	            	  System.out.print("* ");
	              }
	              else
	              {
	            	  System.out.print("  ");
	              }
	              
	          }
	          System.out.println();
	    }
	}
	private void pattern_H2() 
	{
		for(int line=1;line<=7;line++)
		{
			if(line<=7)
			{
				for(int star=1;star<=7;star++)
				{
					if(star==1 || star==7 || line==4)
					{
						System.out.print("* ");
					}
					else
					{
						System.out.print("  ");
					}
				}
				System.out.println("");
			}
		}
	}
	
	
	
	
	
	
}
