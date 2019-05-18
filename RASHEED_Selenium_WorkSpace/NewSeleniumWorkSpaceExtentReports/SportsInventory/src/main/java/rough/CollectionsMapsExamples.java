package rough;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class CollectionsMapsExamples {
	
	public static void getKeyNamesOfHashMap()
	{
		HashMap<String,String> hm=new HashMap<String, String>();
		 hm.put("Name","Rasheed");
		 hm.put("college name", "AGCET");
		 hm.put("Branch","CSE");
		 hm.put("Roll number","G51A0566");
		 
		System.out.println("Key names of HashMap using Key set are");

		Set<String> keySet=hm.keySet();

		ArrayList<String> aList=new ArrayList<String>(keySet);	
		for(String val:aList)
		{
			System.out.println(val);}

		}	
		
	
	public static void getKeyValuesOfHashMap()
	{
		HashMap<String,String> hm=new HashMap<String, String>();
		 hm.put("Name","Rasheed");
		 hm.put("college name", "AGCET");
		 hm.put("Branch","CSE");
		 hm.put("Roll number","G51A0566");
		 
		System.out.println(""
				+ "getting Key values of HashMap using ");

		Collection<String> values=hm.values();

		ArrayList<String> aList=new ArrayList<String>(values);	
		for(String val:aList)
		{
			System.out.println(val);}

		}	
	
	
	public static void keyValuePairsOfHashMap()
	{
		

		HashMap<String,String> hm=new HashMap<String, String>();
		 hm.put("Name","Rasheed");
		 hm.put("college name", "AGCET");
		 hm.put("Branch","CSE");
		 hm.put("Roll number","G51A0566");
		 
		System.out.println(""
				+ "Key values pairs of using ");
		
		Set<Entry<String,String>> entryset=hm.entrySet();
		
		for(Entry<String,String> entry:entryset)
		{
		System.out.println(entry.getKey()+":"+entry.getValue());	
		}
		
	}
		
	
public static void main(String args[])
{
 
CollectionsMapsExamples.getKeyNamesOfHashMap();

CollectionsMapsExamples.getKeyValuesOfHashMap();
CollectionsMapsExamples.keyValuePairsOfHashMap();
}
}
