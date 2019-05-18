package rough;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NoOfLinks {
	public static void main(String[] args) throws Exception {
		
			WebDriver driver=new FirefoxDriver();
			driver.manage().window().maximize();
			driver.get("https://www.irctc.co.in/eticketing/loginHome.jsf");
			List<WebElement> listlinks = driver.findElements(By.tagName("a"));
			System.out.println("link size is "+listlinks.size());
			for(WebElement w:listlinks)
			{
				System.out.println(w.getText());
				
			}
			
			for(WebElement k:listlinks)
			{
				try{
				Thread.sleep(3000);
				System.out.println("Going to click on " +k.getText());
			driver.findElement(By.linkText(k.getText())).click();
				}
				catch(StaleElementReferenceException e)
				{
				e.printStackTrace();	
				}
				catch(Exception e)
				{
				e.printStackTrace();	
				}
				
			if(driver.getTitle().equals("underConsTitle"))
			{
				System.out.println(k.getText()+"  link is under constuction");
			}
			else
			{
				System.out.println(k.getText()+" link is working");
			}
			driver.navigate().back();
				
				
			

	}
			//verify each link
//			String[] linkTest=new String[listlinks.size()];
//						
//			for(String s:linkTest)
//			{
//				try{
//				driver.findElement(By.linkText(s)).click();
//				}
//				catch(Exception e)
//				{
//				System.out.println();	
//				}
//				if(driver.getTitle().equals("underConsTitle"))
//				{
//					System.out.println("under constuction");
//				}
//				else
//				{
//					System.out.println(s+" link is working");
//				}
//				driver.navigate().back();
//				
			}
			
	 // driver.quit();

    }


