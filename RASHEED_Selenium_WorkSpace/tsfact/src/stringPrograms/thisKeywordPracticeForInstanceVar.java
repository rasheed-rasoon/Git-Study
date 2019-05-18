package stringPrograms;

public class thisKeywordPracticeForInstanceVar {
	int rollnum;
	String name;
	double fee;
	public thisKeywordPracticeForInstanceVar(int rollnum,String name,double fee) {
		this.rollnum=rollnum;
		this.name=name;
		this.fee=fee;
	}
	public void display()
	{
		System.out.println(rollnum +" "+name+"  "+fee);
		
		
	}


	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		thisKeywordPracticeForInstanceVar t1=new thisKeywordPracticeForInstanceVar(55,"rasheed",555023);
		t1.display();
		
		thisKeywordPracticeForInstanceVar t2=new thisKeywordPracticeForInstanceVar(66,"ahemd",5558.23);
		t2.display();
		thisKeywordPracticeForInstanceVar t3=new thisKeywordPracticeForInstanceVar(55,"sheik",999.2125);
		
		t3.display();
		

	}

}
