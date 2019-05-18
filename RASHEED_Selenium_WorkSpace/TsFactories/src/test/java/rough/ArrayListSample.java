package rough;

import java.util.ArrayList;

public class ArrayListSample {
	
	public void arrayListSample()
	{
		ArrayList<String > aList=new ArrayList<String>();
		aList.add("Rasheed");
		aList.add("Ahmed");
		aList.add("Nagendra");
		aList.add("Mohan");
		aList.add("Mourya");
		aList.add("Sasi");
		System.out.println("size is "+aList.size());
		aList.remove(0);
		System.out.println("size is "+aList.size());
		aList.add("Vatsav");
		aList.remove("Ahmed");
		for(String a:aList)
		{
		System.out.println(a);	
			
		}
		
	}
	public void arrayListSample2()
	{
		ArrayList<String > aList2=new ArrayList<String>();
		
		aList2.add(0,"Sheik");
	aList2.add(1,"Rasheed");
	aList2.add(2,"Sheik");
	aList2.add(3,"Rafiq");
	aList2.add(4,"Rahil");
	aList2.add(5,"Nadeem");
	System.out.println("ArrayList size is  "+aList2.size());
	aList2.add(0, "Mahad");
	for(String b:aList2)
	{
	System.out.println(b);	
	}
	aList2.remove(2);
//	for(String c:aList2)
//	{
//	System.out.println(c);	
//	}
//	
	}
	public void arrayListSample3()
	{
		ArrayList list=new ArrayList();
		
		list.add("Rasheed");
		list.add("222");
		list.add(3);
		list.add(1.56);
		for(Object o:list)
		{
			System.out.println(o.toString());
			
		}
		
	}
	public void arrayListSample4()
	{
		ArrayList<String > aList3=new ArrayList<String>();
		aList3.add(null);
		aList3.add(null);
		aList3.add(null);
		for(String k:aList3)
		{
			System.out.println(k);
		}
		
	}

	public static void main(String[] args) {
		
		ArrayListSample obj=new ArrayListSample();
		//obj.arrayListSample();
		//obj.arrayListSample2();
		//obj.arrayListSample3();
		obj.arrayListSample4();

	}

}
 