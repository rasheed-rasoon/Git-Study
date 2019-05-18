package stringPrograms;

public class thisForMethod {
	
	
	public thisForMethod(int a) {
		this();
		System.out.println("conctructor with parameter "+a);
	}
	public  thisForMethod()
	{
	
	System.out.println("constructor without parameter");	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		thisForMethod a=new thisForMethod(2);

	}

}
