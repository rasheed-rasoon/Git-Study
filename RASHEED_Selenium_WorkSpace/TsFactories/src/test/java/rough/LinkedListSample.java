package rough;

import java.util.LinkedList;

public class LinkedListSample {
	public void linkedListSample1()
	{
	LinkedList<String> list=new LinkedList<>();
	list.add("rasheed");
	list.add("ahmed");
	list.add("Sheik");
	list.add("bannu");
	for(String s:list)
	{
		System.out.println(s);
	}
	}

	public static void main(String[] args) {
		LinkedListSample obj=new LinkedListSample();
		obj.linkedListSample1();
	}

}
