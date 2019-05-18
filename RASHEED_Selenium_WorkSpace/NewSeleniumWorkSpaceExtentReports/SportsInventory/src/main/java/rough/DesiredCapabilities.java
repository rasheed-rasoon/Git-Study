package rough;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DesiredCapabilities {
	private static WebDriver driver;
	public static void firefoxDriver()
	{
//	System.setProperty("webdriver.gecko.driver","D:");
//	   DesiredCapabilities capabilities = DesiredCapabilities.firefoxDriver();
//       capabilities.setCapability("marionette", true);
       driver = new FirefoxDriver();
	
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
