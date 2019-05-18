package rough;


interface intr1
{
int i=2;
void display();
	
	
}

public class testClass1 implements intr1{
	
	public void display() {
		System.out.println("java program");
	}
	
	
	public static void main(String args[])
	
	{
		testClass1 obj=new testClass1();
		obj.display();
		
	}

	
}
