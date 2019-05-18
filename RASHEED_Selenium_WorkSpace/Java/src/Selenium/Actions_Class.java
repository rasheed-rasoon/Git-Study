package Selenium;

			import org.testng.annotations.Test;
			import org.testng.annotations.BeforeTest;
			import org.openqa.selenium.By;
			import org.openqa.selenium.WebDriver;
			import org.openqa.selenium.firefox.FirefoxDriver;
			import org.openqa.selenium.interactions.Actions;
			import org.testng.annotations.AfterTest;

public class Actions_Class 
{
	public WebDriver driver;
  @Test
  public void f() throws Exception 
  		{
			  driver.findElement(By.xpath(".//*[@id='user_type']")).click();
			  Thread.sleep(2000);
			  driver.findElement(By.xpath(".//*[@id='userName']")).sendKeys("rasheed");
			  driver.findElement(By.xpath(".//*[@id='userName']")).sendKeys("rashi");
			  Actions a=new Actions(driver);
			  a.moveToElement(driver.findElement(By.xpath(".//*[@id='lnk1']"))).build().perform();
	  
	  
        }
  @BeforeTest
  public void beforeTest() throws InterruptedException
        {
	  
			  driver=new FirefoxDriver();
			  driver.get("http://test.cgg.gov.in/tsfactories/home.do");
			  driver.manage().window().maximize();
			  Thread.sleep(3000);
	 
        }

  @AfterTest
  public void afterTest() 
  {
  }

}
