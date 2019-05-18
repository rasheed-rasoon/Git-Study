package programsoncollections;

import java.util.HashMap;
import java.util.Map;

public class MapSapmle {
	
	public void mapSample()
	{
		HashMap<Integer,String> hm=new HashMap<Integer,String>();
		
	hm.put(1,"Rasheed");
	hm.put(2,"Ahmed");
	hm.put(3,"sheik");
	hm.put(4,"Ahmed");
	
	for(Map.Entry m:hm.entrySet())
	{
	System.out.println(m.getKey()+"  "+m.getValue());	
	}
	}
	public static void main(String args[])
	
	{
		MapSapmle m=new MapSapmle();
		m.mapSample();
	}

}
