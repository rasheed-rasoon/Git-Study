package rough;

public class BubbleSortAlgothm {
static int temp=0;
	public static void main(String[] args) {

int intArray[]={35,25,13,17,3};
System.out.println("Before sortig");
for(int a:intArray)
{
System.out.println(a);	
}
bubblesort(intArray);
System.out.println("After bubble sort");
for(int a:intArray)
{
System.out.println(a);	
}
	}

	private static void bubblesort(int[] intArray) {
		for(int i=0;i<intArray.length;i++)
		{
		for(int j=1;j<(intArray.length)-i;j++)
		{
		if(intArray[j-1]>intArray[j])
		{
			temp=intArray[j-1];
			intArray[j-1]=intArray[j];
			intArray[j]=temp;
			
		}
			
		}
		}
		
	}

}
