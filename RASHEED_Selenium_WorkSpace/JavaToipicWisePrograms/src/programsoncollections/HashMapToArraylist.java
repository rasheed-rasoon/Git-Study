package programsoncollections;


import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapToArraylist {
	
	public static void hahMapKeyToArrayList()
	{
	HashMap<String, String> hm=new HashMap<String,String>();
	
	hm.put("Name","Rasheed");
	hm.put("my brother","Naresh");
	
	hm.put("younger brother","uday");
	
	hm.put("my best frnd","Rakesh");
	
	hm.put("selenium icon","Mophan");
	Set<String> keyset=hm.keySet();
	ArrayList<String> al=new ArrayList<String>(keyset);
	
	for(String aList:al)
	{
		System.out.println(aList);
	}
	Collection<String> values=hm.values();
	ArrayList<String> al2=new ArrayList<String>(values);
	for(String n:al2)
	{
		System.out.println("key values are "+n);
	}
	
	Set<Entry<String, String>> entrySet=hm.entrySet();
	ArrayList<Entry<String, String>> al3=new ArrayList<Entry<String, String>>(entrySet);
	
	for(Entry<String, String> entry:al3)
	{
		
		System.out.println(entry.getKey() +" "+entry.getValue());
	}
	}
	
	
	
	
	
	
public static void main(String args[])
{
	HashMapToArraylist.hahMapKeyToArrayList();
}
}
