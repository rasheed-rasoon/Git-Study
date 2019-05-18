package rough;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class FucntionUtilSample {
	WebDriver driver;
	WebElement element=driver.findElement(By.xpath(""));
	
	public void mouseHover()
	{
Actions a=new Actions(driver).moveToElement(element);
a.build().perform();
	}
}
