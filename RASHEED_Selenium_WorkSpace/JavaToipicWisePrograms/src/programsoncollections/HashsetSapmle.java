package programsoncollections;

import java.util.HashSet;
import java.util.Iterator;

public class HashsetSapmle {
	
	public void hashsetBasic()
	{
		HashSet<String> hs=new HashSet<String>();
		hs.add("rasheed");
		
		hs.add("Naresh");
		hs.add("rasheed");
	Iterator<String> itr=hs.iterator();
	while(itr.hasNext())
	{
		System.out.println(itr.next());
	}
	
	
	}

	
	
	public static void main(String []args)
	{
		
		HashsetSapmle obj=new HashsetSapmle();
		obj.hashsetBasic();
		
	}

}
