package com.cgg.Rough;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapSample {

	public void hashMapSample()
	{
		HashMap<String,Integer> hm=new HashMap<String,Integer>();
		hm.put("Sno", 12);
		hm.put("Sno1",13);
		hm.put("Sno2", 14);
		for(Map.Entry m:hm.entrySet())
			
		{
			System.out.println(m.getKey()+""+m.getValue());
		}
		
		}
	
	public void hahmapIntoHashMap()
	{
		HashMap<String,Integer> hm=new HashMap<String,Integer>();
		hm.put("Sno", 12);
		hm.put("Sno1",13);
		hm.put("Sno2", 14);
		for(Map.Entry m:hm.entrySet())
			
		{
			System.out.println(m.getKey()+""+m.getValue());
		}
		
		HashMap<String, Integer> anotherHashMap=new HashMap<String,Integer>();
		
		anotherHashMap.putAll(hm);
		for(Map.Entry k:anotherHashMap.entrySet())
			{
			System.out.println("anther Map values "+k.getKey()+" "+k.getValue());
			}}
	
	public void hashMapGetKeys()
	
	{
		
		HashMap<String,Integer> hm=new HashMap<String,Integer>();
		hm.put("Sno", 12);
		hm.put("Sno1",13);
		hm.put("Sno2", 14);
		
		Set<String> s=hm.keySet();
		for(String st:s)
		{
		System.out.println("Key names are "+st);	
		}
		Iterator<String> it=s.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		Collection<Integer> col=hm.values();
		Iterator<Integer> itr=col.iterator();
		while(itr.hasNext())
		{
			System.out.println("values are "+itr.next());
		}
		
		System.out.println("values are "+col);
		//System.out.println(s);
		
		Set<Entry<String,Integer>> setOfPairs=hm.entrySet();
		
		for(Entry<String,Integer> n:setOfPairs)
		{
			System.out.println("set value pairs are  "+n);
		}
	}
	
	public static void main(String []args)
	{
		HashMapSample obj=new HashMapSample();
		//obj.hashMapSample();
		//obj.hahmapIntoHashMap();
		obj.hashMapGetKeys();
		
	}
	
}
