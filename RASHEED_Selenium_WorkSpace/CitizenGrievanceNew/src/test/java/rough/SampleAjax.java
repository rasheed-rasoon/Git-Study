package rough;

import java.util.List;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SampleAjax {
	WebDriver driver;
	WebDriverWait wait;
  
  public void ajax(String weblocator,String textToSelect ) throws Exception {
	
	  try {
		  
			WebElement autoOptions = driver.findElement(By.xpath(weblocator));
			wait.until(ExpectedConditions.visibilityOf(autoOptions));

			List<WebElement> optionsToSelect = autoOptions.findElements(By.tagName("li"));
			for(WebElement option : optionsToSelect){
		        if(option.getText().equals(textToSelect)) {
		        	System.out.println("Trying to select: "+textToSelect);
		            option.click();
		            break;
		        }
		    }
			
		} catch (NoSuchElementException e) {
			System.out.println(e.getStackTrace());
		}
	
 
  }
  @Test
  public void test() throws Exception{
	  driver.findElement(By.id("src")).sendKeys("hyder");
	  Thread.sleep(5000);
	  ajax(".//*[@id='search']/div/div[1]/div/ul","Hyderabad");

	  
	 
      //find the calendar
      WebElement dateWidget = driver.findElement(By.xpath(".//*[@id='rb-calendar_onward_cal']"));  
      List<WebElement> columns=dateWidget.findElements(By.tagName("td"));  

      //comparing the text of cell with today's date and clicking it.
      for (WebElement cell : columns)
      {
         if (cell.getText().equals("21"))
         {
            cell.click();
            
         }
      }
      Thread.sleep(2000);
	driver.findElement(By.xpath(".//*[@id='search_btn']")).click();
	Thread.sleep(8000);
WebElement table=driver.findElement(By.xpath(".//*[@id='buses_viewonward']/div/ul/li[1]/div[1]/div/div[1]"));
List<WebElement> table_button=table.findElements(By.tagName("button"));
for (WebElement particularfield : table_button) {
	if (particularfield.getText().equalsIgnoreCase("View Seats")) {
		particularfield.click();
		
	}
}

Thread.sleep(8000);
driver.findElement(By.xpath(".//*[@id='buses_viewonward']/div/ul/li[1]/div[2]/div[1]/div[2]/div[3]")).click();
  }
  @BeforeTest
  public void beforeTest() throws Exception {
	  System.setProperty("webdriver.chrome.driver","D:\\stdy\\Drivers\\chromedriver.exe");
	  ChromeOptions options = new ChromeOptions();
	  options.addArguments("start-maximized");
	  driver=new ChromeDriver(options); 
	  driver.get("https://redbus.in");
	  Thread.sleep(4000);
	  wait = new WebDriverWait(driver, 5);
	  	  
  }


}
