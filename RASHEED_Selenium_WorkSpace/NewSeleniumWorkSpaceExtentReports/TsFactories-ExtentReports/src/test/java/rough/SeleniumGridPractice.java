package rough;



	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.remote.DesiredCapabilities;
	import org.openqa.selenium.remote.RemoteWebDriver;
	 
	import java.net.MalformedURLException;
	import java.net.URL;
	 
	public class SeleniumGridPractice {
	 public static WebDriver driver;
	 
	 public static void main(String[]  args) throws MalformedURLException, InterruptedException{
	 
	 String URL = "http://www.DemoQA.com";
	 String Node = "http://10.2.24.47:4444/wd/hub";
	 DesiredCapabilities cap = DesiredCapabilities.firefox();
	 
	 driver = new RemoteWebDriver(new URL(Node), cap);
	 
	 driver.navigate().to(URL);
	 Thread.sleep(5000);
	 driver.quit();
	 } 
	

}

