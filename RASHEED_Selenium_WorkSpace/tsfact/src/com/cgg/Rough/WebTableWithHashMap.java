package com.cgg.Rough;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.cgg.Pages.EntreprenuerLoggedinPage;
import com.cgg.Pages.HomePage;
import com.cgg.testcases.TestBase;

public class WebTableWithHashMap extends TestBase {
	
	@Test
	public void HashMapWebTable() {
		driver.get("http://test.cgg.gov.in:8083/tsfactories/home.do");
		HomePage home = PageFactory.initElements(driver, HomePage.class);
		EntreprenuerLoggedinPage lp = home.Entreprenuerlogin("rasheed66", "R@sheed66");
		WebElement table= driver.findElement(By.xpath("html/body/div[1]/div[2]/center/table/tbody/tr[2]/td/table"));
List<WebElement> rows1=table.findElements(By.tagName("tr"));
for(int i=0;i<rows1.size();i++)
{
	List<WebElement> cells1=rows1.get(i).findElements(By.tagName("td"));
	
	for(int j=0;j<cells1.size();j++)
	{
		if(cells1.get(j).getText().equals("Reply Query"))
		{
		System.out.println("value is" +cells1.get(j-3).getText());
		}
	}
	}
		
	}

}
