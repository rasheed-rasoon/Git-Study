package rough;

import java.util.Scanner;

public class Patteren1 {
	public static void pattern2()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		Integer k=sc.nextInt();
		for(int i=1;i<=k;i++)
		{
			for(int j=1;j<=i;j++)
			{
			System.out.print(j +" ");	
			}
			System.out.println();
		}
			
	}
	
	public static void pattern3()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		Integer k=sc.nextInt();	
		for(int i=1;i<=k;i++)
		{
			for(int j=1;j<=i;j++)
			{
			System.out.print(i+" ");	
			}
			System.out.println();
		}
		
	}
	
	public static void pattern4()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		Integer k=sc.nextInt();	
		for(int i=1;i<=k;i++)
		{
			for(int j=1;j<=i;j++)
			{
			System.out.print(j+ " ");	
			}
			System.out.println();
		}
		
		for(int i=k;i>=1;i--)
		{
			for(int j=1;j<i;j++)
			{
			System.out.print(j +" ");	
			}
			System.out.println();
		}
	}
	
	public static void pattern5()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		Integer k=sc.nextInt();	
		for(int i=k;i>=1;i--)
		{
			for(int j=1;j<=i;j++)
			{
			System.out.print(j +" ");	
			}
			System.out.println();
		}
	}
	public static void pattern6()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		Integer k=sc.nextInt();	
		for(int i=1;i<=k;i++)
		{
			for(int j=k;j>=i;j--)
			{
			System.out.print(j +" ");	
			}
			System.out.println();
		}
	}
	public static void pattern7()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		Integer k=sc.nextInt();	
		for(int i=k;i>=1;i--)
		{
			for(int j=k;j>=i;j--)
			{
			System.out.print(j +" ");	
			}
			System.out.println();
		}
	}
	
	public static void pattern8()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		Integer k=sc.nextInt();	
		for(int i=k;i>=1;i--)
		{
			for(int j=k;j>=i;j--)
			{
			System.out.print(j +" ");	
			}
			System.out.println();
		}
	}
	
	public static void pattern9()
	{
		 Scanner sc = new Scanner(System.in);
         
	        System.out.println("How many rows you want in this pattern?");
	         
	        int rows = sc.nextInt();
	         
	        System.out.println("Here is your pattern....!!!");
	         
	        for (int i = 1; i <= rows; i++) 
	        {
	            int num = i;
	             
	            for (int j = 1; j <= i; j++) 
	            {
	                System.out.print(num+" ");
	                 
	                num = num+rows-j;
	            }
	             
	            System.out.println();
	        }
	         
	        sc.close();
	}
	public static void pattern10()
	{

		 Scanner sc = new Scanner(System.in);
        
	        System.out.println("How many rows you want in this pattern?");
	         
	        int rows = sc.nextInt();
	        for(int i=1;i<=rows;i++)
	        {
	        	for(int j=i;j>=1;j--)
		        {
		        	System.out.print(j+" ");
		        }
	        	System.out.println();
	        }
	}
	public static void pattern11()
	{

		 Scanner sc = new Scanner(System.in);
        
	        System.out.println("How many rows you want in this pattern?");
	         
	        int rows = sc.nextInt();
	        for(int i=1;i<=rows;i++)
	        {

	        	for(int j=i-1;j>=1;j--)
		        {
		        	System.out.print(" ");
		        }
	        	
	        	
	        	for(int j=i;j<=5;j++)
		        {
		        	System.out.print(j+" ");
		        }
	        	System.out.println();
	        }
	        for(int i=rows-1;i>=1;i--)
	        {

	        	for(int j=1;j<i;j++)
		        {
		        	System.out.print(" ");
		        }
	        	
	        	
	        	for(int j=i;j<=5;j++)
		        {
		        	System.out.print(j+" ");
		        }
	        	System.out.println();
	        }
	}
	public static void floydsTraingle()
	{

		 Scanner sc = new Scanner(System.in);
       
	        System.out.println("How many rows you want in this pattern?");
	         
	        int rows = sc.nextInt();
	        int val=1;
	        for(int i=1;i<=rows;i++)
	        {
	        	for(int j=1;j<=i;j++)
		        {
		        System.out.print(val+"\t");	
		        	val++;
		        }	
	        	System.out.println();
	        }
	}
	public static void pattern12()
	{
		 Scanner sc = new Scanner(System.in);
	       
	        System.out.println("How many rows you want in this pattern?");
	         
	        int rows = sc.nextInt();
	        int num=rows/2;
	        System.out.println(num);
	        for(int i=1;i<=rows;i++)
	        {
	        	
	        	
	        	for(int j=1;j<=num;j++)
		        {
		        System.out.print(" ");	
		        }
	        	for(int j=num+1;j<=num;j++)
		        {
		        System.out.print(i);	
		        }
	        	System.out.println();
	        }
		
	}
	public static void pattern14(String str)
	{
	String inputString="My anme is rasheed";
	char[] a=inputString.toCharArray();
	StringBuffer sb=new StringBuffer();
	for(int i=0;i<a.length;i++)	
	{
		if((a[i]!=' ')&&(a[i+1]!='\t'))
{
sb.append(a[i]);	
}
	
	}
	System.out.println();	
	}
	public static void main(String[] args) {
		
	//Patteren1.pattern14();
		
	}

}
