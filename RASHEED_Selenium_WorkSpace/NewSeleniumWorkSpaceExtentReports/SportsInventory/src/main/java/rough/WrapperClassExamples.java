package rough;

public class WrapperClassExamples {
	
	
	public static void stringToInteger()
	{
		
		String str=new String("100");
		Integer it1=Integer.valueOf(str);
	}
	
	
	public static void integerToSTring()
	{
		int i=100;
		Integer i1=Integer.valueOf(i);
		//String str=i1.toString();
	//	System.out.println(str);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WrapperClassExamples.integerToSTring();
	}

}
