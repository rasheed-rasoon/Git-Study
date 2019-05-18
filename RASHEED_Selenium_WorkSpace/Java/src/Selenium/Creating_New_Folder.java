package Selenium;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Creating_New_Folder {
	public WebDriver driver;
	private static String[] links = null;
	  private static int linksCount = 0;

  @Test
  public void f() throws Exception {
	  WebDriver driver=new FirefoxDriver();
	  driver.get("http://selenium-makeiteasy.blogspot.in/");
	  List<WebElement> linksize = driver.findElements(By.tagName("a")); 
	  linksCount = linksize.size();                                       //to get number of links for the particulat url
	  System.out.println("Total no of links Available: "+linksCount);       // to get total number of links
	  links= new String[linksCount];
	  System.out.println("List of links Available: ");  
	  // print all the links from webpage 
	  for(int j=0;j<linksCount;j++)
	  {
	  links[j] = linksize.get(j).getAttribute("href");
//	  System.out.println(all_links_webpage.get(i).getAttribute("href"));
	  } 
	  // navigate to each Link on the webpage
	  for(int k=0;k<linksCount;k++)
	  {
	  System.out.println("now it's going to click 	on "+ k +" link ");
	  driver.navigate().to(links[k]);
	  Thread.sleep(1000);
	  File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	  FileUtils.copyFile(src,new File("F:\\RASHEED_Selenium_WorkSpace\\GHMC)Project\\Links\\ link "+k+".png"));


	  
	  }}
}

