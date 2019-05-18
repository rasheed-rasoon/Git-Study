package rough;

public class CloneSample implements Cloneable {
	int rollno;  
	String name;  
	  
	CloneSample(int rollno,String name){  
	this.rollno=rollno;  
	this.name=name;  
	}  
	  
	public Object clone()throws CloneNotSupportedException{  
	return super.clone();
	}
	public static void main(String[] args) {
		try{  
			CloneSample s1=new CloneSample(101,"amit");  
			  
			CloneSample s2=(CloneSample)s1.clone();  
			  
			System.out.println(s1.rollno+" "+s1.name);  
			System.out.println(s2.rollno+" "+s2.name);  
			  
			}catch(CloneNotSupportedException c){}  
			  
			}  

	}


