package rough;

import java.util.ArrayList;
import java.util.HashSet;

public class HashsetSample {
	public void HashsetSample1()
	{
	HashSet<String> hs=new HashSet<String>();	
     hs.add("rasheed");
     hs.add("ahmed");
     hs.add("Sheik");
     hs.add("Chinnu"); 
     hs.add("Chinnu");
     hs.add(null);
     hs.add(null);
     for(String l:hs)
     {
    	System.out.println(l); 
     }
     ArrayList<String> al=new ArrayList<>(hs);
     
     for(String n:al)
     {
    	 System.out.println("Array list values"+n);
     }
	}

	public static void main(String[] args) {
		HashsetSample obj5=new HashsetSample();
		obj5.HashsetSample1();

	}

}
