package rough;

import java.util.Scanner;

public class Patterns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("how many rows you want in this program");
		int rows=sc.nextInt();
		for(int i=1;i<=rows;i++)
		{
			for(int j=1;j<=rows-i;j++)
			{
				
				System.out.print(1);
			}	
		for(int j=1;j<=i;j++)
		{
			
			System.out.print(i);
		}
		System.out.println();
		}

	}

}
