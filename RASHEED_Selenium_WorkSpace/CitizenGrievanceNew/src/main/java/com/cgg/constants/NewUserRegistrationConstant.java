public class ar_op{
	int a,b,c;
	ar_op(){
	a=10;
	b=20;
	}
	void add(){
		c=a+b;
		System.out.println("the addition is"+c);
	}
	void sub(){
		c=a-b;
		System.out.println("the subtraction is"+c);
	}
	void multi(){
		c=a*b;
		System.out.println("the multiplication is"+c);
	}
}