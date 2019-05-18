package rough;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;



public class HashMapSample {
	public static void hashMapSample()
	{ 
	HashMap<String, String> hm=new HashMap<>();
	hm.put("name","ahmed"); 
	hm.put("name","ahmed");
	hm.put("","ahmed");
	
	for(Map.Entry m:hm.entrySet())
		System.out.println(m);
	}
		public static void hashMapToArrayList()
		{
			HashMap<String, String> hm=new HashMap<String,String>();
			hm.put("Rasheed","SHeik");
			hm.put("Nagendra","Mullapudi");
			hm.put("Pavani","M");
			hm.put("Prasanna","mulla");
			
			Set<String> s=hm.keySet();
			ArrayList<String> arr=new ArrayList<>(s);
			
			for(String str:arr)
			{
				System.out.println("Key names are "+str);
			}
			Collection<String> coll=hm.values();
			ArrayList<String> arr2=new ArrayList<>(coll);
			for(String strn:arr2)
			{
				System.out.println("Key values are  "+strn);
			}
			
			
			
			Set<Entry<String, String>> entrySet = hm.entrySet();
			ArrayList<Entry<String,String>> al=new ArrayList<Entry<String,String>>(entrySet);
			for(Entry<String,String> k:al)
			{
				System.out.println("key name and Key Values are "+k);
			}
			
		}
	public static void main(String[] args) {
				
// HashMapSample.hashMapSample();
//HashMapSample.arraySample();
		HashMapSample.hashMapToArrayList();
	 }

}
