package programsoncollections;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SampleProg {
	public static void main(String args[])
	{
		WebDriver driver= new FirefoxDriver();
		driver.get("www.google.com");
		/*	System.setProperty("webdriver.chrome.driver", "F:\\softwares\\Drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();*/
		driver.navigate().to("www.google.com");

	}

}
