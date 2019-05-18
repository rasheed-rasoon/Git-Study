package rough;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;




public class SikuliSampleCode {
	public static WebDriver driver;
	
	@BeforeTest
	@Parameters("browser")
	public void crossBrowsing(String browser)
	{
		if(browser.equals("firefox"))
		{
			System.setProperty("WebDriver.gecko.driver","F:\\softwares\\Driver\\geckodriver.exe");
			driver=new FirefoxDriver();
			
		}
		else if(browser.equals("chrome"))
		{
			
			System.setProperty("webdriver.chrome.driver","F:\\softwares\\Drivers\\chromedriver.exe");	
			driver=new ChromeDriver();
		}
		
	}
	
	
	
	@Test
	public static void sikuliPractice() throws FindFailed
	{


		// TODO Auto-generated method stub
driver=new FirefoxDriver();
driver.get("testghmc.cgg.gov.in/sports");
driver.manage().window().maximize();

Screen sc=new Screen();
String image1="C:\\Users\\Brahmakumar\\Desktop\\SikuliImages\\Capture.PNG";
String image2="C:\\Users\\Brahmakumar\\Desktop\\SikuliImages\\CaptchaRefresh.PNG";

Pattern mobileNum=new Pattern(image1);
sc.wait(image1);

sc.type(mobileNum,"9491023820");
sc.click(image2);
	}


}
