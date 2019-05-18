import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MavenSUitePractice {
	
	public WebDriver driver;
  @Test
  public void f() {
	  System.setProperty("webdriver.chrome.driver","F:\\softwares\\Drivers\\chromedriver.exe");
	  driver=new ChromeDriver();
	  
	  driver.get("http://inctest.apcgg.gov.in");
	  }
}
