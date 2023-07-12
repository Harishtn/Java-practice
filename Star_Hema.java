package com.harish;

public class Star_Hema
{

	public static void main(String[] args)
	{
		Star_Hema hh=new Star_Hema();
		hh.pattern_H();
		System.out.println();
		hh.pattern_E();
		System.out.println();
		hh.pattern_M();
		System.out.println();
		hh.pattern_A();
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
	private void pattern_E() 
	{
		for(int line=1;line<=7;line++)
		{
				for(int star=1;star<=7;star++)
				{
					if(line==1 || line==7 || line==4  || star==1 )
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
	private void pattern_M()
	{
		 for(int line = 1; line<=9;line++)
		 {
		        for(int star = 1; star<=7; star++)
		        {
		          if(line<=4)
		          {
		            if(star==line || star==8-line || star==1 || star==7)
		            {
		              System.out.print("* ");
		            }
		            else
		            {
		                System.out.print("  "); 
		            }
		          }
		          else
		          {
		        	  if(star==1 || star==7)
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

}
