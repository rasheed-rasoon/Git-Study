package rough;

import java.util.Scanner;

public class TrainglePatterns {
	
	
	public static void pattern1()
	{
		
		for(int i=1;i<=5;i++)
		{
		
	for(int j=1;j<=i;j++)
	{
		
		System.out.print(j+" ");
	}
	System.out.println();
	}
	}
	
	
	public static void pattern2()
	{
		
		for(int i=1;i<=5;i++)
			
		{
		for(int j=1;j<=i;j++)	
		{
			
			System.out.print(i+" ");
		}
			System.out.println();
			
		}
		
		
	}
	
	public static void pattern3()
	{
		for(int i=1;i<=7;i++)
			
		{
			
			for(int j=1;j<=i;j++)
			{
				
				System.out.print(j+" ");
			}
			System.out.println();
			
		}
		
for(int i=7;i>=1;i--)
			
		{
			
			for(int j=1;j<=i-1;j++)
			{
				
				System.out.print(j+" ");
			}
			System.out.println();
			
		}
		
	}
	
	
	
	
	public static void pattern4()
	{
		for(int i=7;i>=1;i--)
		{
			
			for(int j=1;j<=i;j++)
			{
				
				System.out.print(j+" ");			
		    }
		System.out.println();	
		
		}
	}
	
	
	public static void pattern5()
	{
		
		for(int i=1;i<=7;i++)
		{
		
	for(int j=7;j>=i;j--)
	{
		
		System.out.print(j+" ");
	}
	System.out.println();
	}
		
	}
	
	
	public static void pattern6()
	{
		for(int i=7;i>=1;i--)
		{
			
			for(int j=7;j>=i;j--)
			{
				
				System.out.print(j+" ");
				
			}
			System.out.println();	
			
		}
		
		
	}
	
	public static void pattern7()
	{
		for(int i=1;i<=7;i++)
		{
			
			for(int j=7-i+1;j>=1;j--)
				
			{
				
				System.out.print(j  +" ");
				
				
			}
			System.out.println();	
			
		}
		
		
	}
	
	public static void pattern8()
	{
		for(int i=7;i>=1;i--)
		{
			
			for(int j=1;j<=i;j++)
				
			{
				
				System.out.print(j  +" ");
				
				
			}
			System.out.println();	
			
		}
		for(int i=2;i<=7;i++)
		{
			
			for(int j=1 ;j<=i;j++)
				
			{
				
				System.out.print(j+" ");
				
				
			}
			System.out.println();	
			
		}
		
	}
	
	
	
	public static void pattern9()
	{
		
		for(int i=1;i<=6;i++)
		{

		for(int j=1;j<=i;j++)
			{
			System.out.print(j+" ");	
			
			}
			for(int k=i-1;k>=1;k--)
			{
			System.out.print(k+" ");	
				
		}
			System.out.println();	
			
		}
		
		
	}
	
	public static void pattern10()
	{
		
		for(int i=1;i<=6;i++)
		{
		
			for(int k=i;k>=1;k--)
			{
			System.out.print(k+" ");	
				
		}
		System.out.println();	
		}
		
	}
	
	public static void pattern11()
	{
		Scanner sc = new Scanner(System.in);
        
        //Taking rows value from the user
         
        System.out.println("How many rows you want in this pattern?");
         
        int rows = sc.nextInt();
         
        System.out.println("Here is your pattern....!!!");
         
        //Printing upper half of the pattern
         for(int i=1;i<=rows;i++)
         {
        	for(int j=1;j<i;j++)
        	{
        		System.out.print(" ");
        		
        	}
        	 for(int k=i;k<=rows;k++)
        	 {
        		 
        		 System.out.print(k);
        		 
        	 }
        	 System.out.println();
         }
         
         
         for(int i=rows;i>=1;i--)
         {
        	for(int j=1;j<i;j++)
        	{
        		System.out.print(" ");
        		
        	}
        	 for(int k=i;k<=rows;k++)
        	 {
        		 
        		 System.out.print(k);
        		 
        	 }
        	 System.out.println();
         }
         sc.close();
         
			}
			

	public static void pattern12()
	{
		Scanner sc = new Scanner(System.in);
        
        //Taking rows value from the user
         
        System.out.println("How many rows you want in this pattern?");
         
        int rows = sc.nextInt();
         
        System.out.println("Here is your pattern....!!!");
         
        //Printing upper half of the pattern
         for(int i=1;i<=rows;i++)
         {
        	for(int j=1;j<i;j++)
        	{
        		System.out.print(" ");
        		
        	}
        	 for(int k=i;k<=rows;k++)
        	 {
        		 
        		 System.out.print(k+" ");
        		 
        	 }
        	 System.out.println();
         }
         
         
         for(int i=rows;i>=1;i--)
         {
        	for(int j=1;j<i;j++)
        	{
        		System.out.print(" ");
        		
        	}
        	 for(int k=i;k<=rows;k++)
        	 {
        		 
        		 System.out.print(k+" ");
        		 
        	 }
        	 System.out.println();
         }
         sc.close();
         
			}
			

		
public static void pattern13()
{
Scanner sc=new Scanner(System.in);
System.out.println("no of Rows");
int rows=sc.nextInt();

for(int i=1;i<=rows;i++)
	
{
	for(int j=1;j<=i;j++)
	{
		
		if(j%2==0)
		{
			
			System.out.print(0);
		}
		else{
			
			System.out.print(1);
		}
	
	}
	System.out.println();

}

}
		
			
		
public static void pattern14()
{
Scanner sc=new Scanner(System.in);
System.out.println("no of Rows");
int rows=sc.nextInt();

for(int i=1;i<=rows;i++)
	
{
	for(int j=1;j<=rows;j++)
	{
		
		if(j%2==0)
		{
			
			System.out.print(0);
		}
		else{
			
			System.out.print(1);
		}
	
	}
	System.out.println();

}

}
	


public static void patttern9a()
{
Scanner sc=new Scanner(System.in);
System.out.println("enter number of rows");

int rows=sc.nextInt();

for(int i=1;i<=rows;i++)
{
	
	for(int k=1;k<=i;k++)
	{
		System.out.print(" ");
	}
	
	
for(int j=i;j<=rows;j++)
{
	System.out.print(j);
}
System.out.println();
}

for(int i=rows-1;i>=1;i--)
{
	
	for(int k=i;k>=1;k--)
	{
		System.out.print(" ");
	}
	
	
for(int j=i;j<=rows;j++)
{
	System.out.print(j);
}
System.out.println();
}

	
}
	



		
	//}
	
	public static void main(String args[])
	{
		//TrainglePatterns.trainge1();	
//		TrainglePatterns.pattern2();
//		TrainglePatterns.pattern3();
		//TrainglePatterns.pattern5();
		//TrainglePatterns.pattern6();
		//TrainglePatterns.pattern7();
		//TrainglePatterns.pattern8();
		//TrainglePatterns.pattern9();
		//TrainglePatterns.pattern10();
		//TrainglePatterns.pattern11();
		//TrainglePatterns.pattern12();
		//TrainglePatterns.pattern13();
		//TrainglePatterns.pattern14();
		
		TrainglePatterns.patttern9a();
	}

}
