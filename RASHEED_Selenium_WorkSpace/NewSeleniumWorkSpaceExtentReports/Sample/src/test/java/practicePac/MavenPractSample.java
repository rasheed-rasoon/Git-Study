package practicePac;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;


public class MavenPractSample {
	public WebDriver driver;
	
	@Test
	public void executesessionone()
	{
		
		System.setProperty("webdriver.chrome.driver","F:\\softwares\\Drivers\\chromedriver.exe");
		
		System.out.println();
		driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		//driver.close();
		}
		
	@Test
	public void executesessionTwo()
	{
		
		System.setProperty("webdriver.chrome.driver","F:\\softwares\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
	driver.close();
		}
		
		
		@Test
		public void executeSessionThree()
		{
			System.setProperty("webdriver.gecko.driver","F:\\softwares\\Drivers\\geckodriver.exe");
			driver=new FirefoxDriver();
			driver.get("https://www.google.com/");
			driver.manage().window().maximize();
			//driver.close();
			
		}

		
	
	
}