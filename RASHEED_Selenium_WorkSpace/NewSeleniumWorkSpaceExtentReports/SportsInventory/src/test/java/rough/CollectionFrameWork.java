package rough;

import java.util.HashMap;
import java.util.Map.Entry;

public class CollectionFrameWork {
	
	
	public static void hMapRetrieving()
	{
	HashMap<String, Integer> hMap=new HashMap<String,Integer>();
	hMap.put("Rasheed",12);
	hMap.put("AHmed",13);
	
	//System.out.println(hMap);
	for(Entry<String,Integer> entry:hMap.entrySet())
	{
	System.out.println(entry.getKey()+"value is "+entry.getValue());	
	}
	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CollectionFrameWork.hMapRetrieving();
	}

}
