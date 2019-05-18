package com.bms.rough;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.bms.testcases.TestBase;
import com.cgg.util.WaitUtil;

public class CalenderHandlingGHMCSports extends TestBase{
  @Test
  public void f() {
	  
	 // driver.get("http://inctest.apcgg.gov.in/PAYPLAY/SportsMain.aspx");
	  driver.get("http://inctest.apcgg.gov.in/PAYPLAY/GovtplayGround.aspx?&TypeOrg=1&TypeReg=1&regtext=PlayGround%20Reservation");
 WebElement sportComplexdropdown=driver.findElement(By.xpath(".//*[@id='ctl00_ContentPlaceHolder_ddlSportsComplex']"));
 WaitUtil.waitForElementClickable(sportComplexdropdown);
 Select sel=new Select(sportComplexdropdown);

  sel.selectByIndex(1);
  
  WebElement cal=driver.findElement(By.xpath(".//*[@id='ctl00_ContentPlaceHolder_Calendar1']"));
  driver.findElement(By.xpath(".//*[@id='ctl00_ContentPlaceHolder_Calendar1']/tbody/tr[1]/td/table/tbody/tr/td[3]/a")).click();

  List<WebElement> rows=cal.findElements(By.tagName("tr"));
  
	for(int i=0;i<rows.size();i++)
	{
		  List<WebElement> cells=rows.get(i).findElements(By.tagName("td"));
		  for(int j=0;j<cells.size();j++)
		  {
			System.out.println(cells.get(j).getText());  
			
			WebElement ex=cells.get(j);
		
			try{
			if(ex.isEnabled())
			{
				WaitUtil.waitForElementClickable(ex);
				System.out.println(ex.getText());
				//ex.click();
			}
			
			}
			catch(Exception e)
			{
				
			}
		  }
		
	}
  }
}
