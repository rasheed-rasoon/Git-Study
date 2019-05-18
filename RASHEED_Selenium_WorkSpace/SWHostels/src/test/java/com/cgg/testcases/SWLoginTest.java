package com.cgg.testcases;

import java.util.Hashtable;

import org.openqa.selenium.support.PageFactory;
import org.testng.SkipException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


import com.cgg.pages.SWHomePage;
import com.cgg.pages.SWLoggedInPage;
import com.cgg.util.TestUtil;
import com.relevantcodes.extentreports.LogStatus;

public class SWLoginTest extends TestBase {
	@Test(dataProvider="getData")
	public void testLogin(Hashtable <String,String>data){
		test=report.startTest("Testing login functionality");
		

		if(!TestUtil.isExecutable(this.getClass().getSimpleName(), xls)|| data.get("Runmode").equalsIgnoreCase("N"))
			throw new SkipException("Skipping the Test Case Number");

		driver.get("http://testing.cgg.gov.in/tsswhostels");
		test.log(LogStatus.INFO,"navigated to url");

	SWHomePage home=PageFactory.initElements(driver,SWHomePage.class);
	
SWLoggedInPage loggedIn=home.swLogin(data.get("LoginId"),data.get("Password"));

		
		
		test.log(LogStatus.INFO, "Testing Loging Functionality");
		
		if(data.get("DataFlag").equalsIgnoreCase("P") && home.isHomePageOpened()){
			reportFail("unable to logged for valid data");
		}
		else 
			
			if(data.get("DataFlag").equalsIgnoreCase("N") && loggedIn.isSWLoggedInPageOpened()){
			reportFail("Navaigated to Logged in page with invalid data");
		}
			else{
				reportpass("Login Functionallity Working Fine");
			}
			}
		
			
			
			
			
			

	
		@DataProvider
		public Object[][] getData(){
			return TestUtil.getData(this.getClass().getSimpleName(),xls);
		}


}
