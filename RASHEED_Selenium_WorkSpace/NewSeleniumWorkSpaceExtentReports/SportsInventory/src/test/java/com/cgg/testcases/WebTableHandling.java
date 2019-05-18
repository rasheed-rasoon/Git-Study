package com.cgg.testcases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import com.cgg.util.WaitUtil;

public class WebTableHandling {
	WebDriver driver;
	
	@Test
	public void webtableGetData()
	{
		System.setProperty("webdriver.gecko.driver", "F:\\softwares\\Driver\\geckodriver.exe");
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		
		driver.get("http://testghmc.cgg.gov.in/WMS");
		
		driver.findElement(By.id("txtUserName")).sendKeys("15605");
		driver.findElement(By.id("txtPassword")).sendKeys("123");
		driver.findElement(By.id("btnLogin")).click();
		
	driver.get("http://testghmc.cgg.gov.in/WMS/ALLDBNOTEVIEW.ASPX");
WebElement table=driver.findElement(By.xpath("//*[@id='maincontentplaceholder_gvWork']"));
//WaitUtil.waitForElementClickable(table);

List<WebElement> row=table.findElements(By.tagName("tr"));

for(int i=0;i<row.size();i++)
{
	List<WebElement> cells=table.findElements(By.tagName("td"));

	for(int j=0;j<cells.size();j++)
	{
		System.out.println(cells.get(j).getText());
	}	
}
		
	}
	
	
	

}
