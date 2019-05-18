package rough;

public class Polymorphism {
	public void add(float a, int b)
	{
	float c=a+b;
	System.out.println("method with 2 parameters for add "+c);
		
	}
	public void add(int a,float b)
	{
		int d=(int) (a+b);
		System.out.println("method with 3 parameters for add  "+d);
		}
	
	public static void main(String []args)
	{
		Polymorphism p=new Polymorphism();
		
	}

}
