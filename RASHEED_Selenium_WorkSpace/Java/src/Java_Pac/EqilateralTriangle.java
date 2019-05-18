package Java_Pac;

public class EqilateralTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=7;
		for(int i=1;i<=num;i++){
            for(int j=1;j<num-(i-1);j++){
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
            	
                System.out.print("*");
                for(int k1=1;k1<k;k1+=k){
              
                    System.out.print("*");
                  	
                }
            }
            System.out.println();
        }

	}

}
