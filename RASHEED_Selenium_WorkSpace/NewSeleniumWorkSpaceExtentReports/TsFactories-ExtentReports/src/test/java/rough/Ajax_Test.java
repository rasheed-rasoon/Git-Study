package rough;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Ajax_Test {
	WebDriver driver;
  @Test
  public void f() throws Exception {
	  driver.findElement(By.id("src")).sendKeys("Hyd");
	  Thread.sleep(2000);
	WebElement ajax_box=  driver.findElement(By.xpath(".//*[@id='search']/div/div[1]/div/ul"));
 
  List<WebElement>values=ajax_box.findElements(By.tagName("li"));
  
  for (WebElement option : values) {
	  
	  if (option.getText().equalsIgnoreCase("Hyderabad")) {
		  option.click();
		  break;
		
	}
	
}
  }
  @BeforeTest
  public void beforeTest() throws Exception {
	  System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("https://redbus.in");
	  Thread.sleep(4000);
  }
}
