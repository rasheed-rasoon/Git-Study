package rough;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Smple {
  @Test
  public void f() {
	  WebDriver driver= new FirefoxDriver();
	  driver.get("http://test.cgg.gov.in:8083/tsfactories/home.do");
	  
  }
}
