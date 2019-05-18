package rough;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class MouseHover {
private WebDriver driver;
  @Test
  public void f() {
	  driver=new FirefoxDriver();
	  driver.manage().window().maximize();
	  driver.get("http://test.cgg.gov.in:8083/tsfactories");
	  driver.findElement(By.xpath(".//*[@id='login_type_div1']/a[2]")).click();
	  driver.findElement(By.xpath(".//*[@id='userName']")).sendKeys("rasheed66");
	  driver.findElement(By.xpath(".//*[@id='password']")).sendKeys("R@sheed66");
	  driver.findElement(By.cssSelector("input#login")).click();
	  WebElement ele=driver.findElement(By.cssSelector("a#lnk1"));
	  Actions builder=new Actions(driver);
	  builder.moveToElement(ele);
	  builder.click().build().perform();
	  
  }
}
