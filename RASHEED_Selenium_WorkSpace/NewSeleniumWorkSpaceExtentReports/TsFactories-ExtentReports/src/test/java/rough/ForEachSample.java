package rough;

public class ForEachSample {

	public void forEachArray() {
		int arr[] = { 1, 2, 3, 4 };
		for (int i : arr) {
			System.out.println(i);

		}
	}
	public void forEachObjectDoubleArrayArray()
	{
		
		String[][] bookData = {
                {"Head First Java", "Kathy Serria"},
                {"Effective Java", "Joshua Bloch"},
                {"Clean Code", "Robert martin"},
                {"Thinking in Java", "Bruce Eckel"},
        };	
		for(String[] a:bookData)
		{
			for(String b:a)
			{
				System.out.println(b);
			}
		}
	}
	public void forEachObjectSingleArrayArray()
	{
		
		String[] bookData = {"Head First Java", "Kathy Serria"};	
		for(String a:bookData)
		{
		System.out.println(a);	
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ForEachSample obj=new ForEachSample();
		obj.forEachObjectSingleArrayArray();
		
	}

}
