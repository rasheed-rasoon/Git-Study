package rough;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataproviderExSampleObjectArray {
  @Test(dataProvider="getData")
  public void setData(String uname,String pwd,String k) {
	  System.out.println("user name is   "+uname);
	  System.out.println("Password is  " +pwd);
	  
	  
  }
  @DataProvider
  public Object[][] getData()
  {
	 Object[][] data=new Object[3][2] ;
	 data[0][0]="rasheed";
	 data[0][1]="Vaheeda";
	 data[1][0]="rafi";
	 data[1][1]="sufia";
	 data[2][0]="Rahil";
	 data[2][1]="Rashu";
	return data;
	  
  }
  
}
