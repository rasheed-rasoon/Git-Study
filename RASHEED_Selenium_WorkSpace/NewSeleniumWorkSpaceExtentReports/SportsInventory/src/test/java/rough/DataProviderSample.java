package rough;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class DataProviderSample {
  @Test(dataProvider="credentials")
  public void f(String name, String RollNumber) {
	  
	  System.out.println("name is "+name +"roll number is "+RollNumber);
  }

  @DataProvider(name = "credentials")
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { "rasheed", "66" },
      new Object[] { "ahmed'", "67" },
    };  }
}
