package com.bms.testcases;

import java.util.Hashtable;

import org.openqa.selenium.support.PageFactory;
import org.testng.SkipException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.bms.Pages.BMSLoginPages;
import com.cgg.util.TestUtil;

public class FormwardFromPaoToCggAdmin extends TestBase{
	@Test(dataProvider="getData")
  public void forwardFromPaoToJdwaknr(Hashtable<String, String> data) {
	  if (!TestUtil.isExecutable(this.getClass().getSimpleName(), xls) || data.get("Runmode").equalsIgnoreCase("N"))
			throw new SkipException("Skipping the Test Case Number");
	  driver.get("http://ghmctest.cgg.gov.in/ETicketing");
	  BMSLoginPages login=PageFactory.initElements(driver, BMSLoginPages.class);
	  login.Login(data.get("LoginId"), data.get("Password"));
	  
	  
	  
	  
  }
  @DataProvider
	public Object[][] getData() {

		return TestUtil.getData(this.getClass().getSimpleName(), xls);
	}
}
