package rough;

public class SubClassSample extends SampleSuper {
int i=2;
 int j=super.i;

void display()
{
	System.out.println(j);
	}
	public static void main(String[] args) {
		
SubClassSample obj=new SubClassSample();
obj.display();

	}

}
