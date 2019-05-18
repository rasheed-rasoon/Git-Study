package com.cgg.testcases;

import java.util.Hashtable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.SkipException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.cgg.util.TestUtil;

public class NaukriLaunch extends TestDataBase2 {
	//public static WebDriver driver = null;


	
	@Test(dataProvider="getData")
	public void testLogin(Hashtable <String,String>data) throws Exception{
		test=report.startTest("Testing Naukri Registration functionality");

		if(!TestUtil.isExecutable(this.getClass().getSimpleName(), xls)|| data.get("Runmode").equalsIgnoreCase("N"))
			throw new SkipException("Skipping the Test Case Number");


		 driver.findElement(By.id("naukriApp.appModules.login:id/b_register")).click();
		 driver.findElement(By.id("naukriApp.appModules.login:id/resman_fullname_edittext")).sendKeys(data.get("Name"));

	}




	@DataProvider
	public Object[][] getData(){
		return TestUtil.getData(this.getClass().getSimpleName(),xls);
	}


}
