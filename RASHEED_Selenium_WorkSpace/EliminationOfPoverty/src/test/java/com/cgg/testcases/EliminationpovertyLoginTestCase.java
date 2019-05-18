package com.cgg.testcases;

import java.util.Hashtable;
import org.openqa.selenium.support.PageFactory;
import org.testng.SkipException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.cgg.pages.HomelessPersonsAppFormPagePage;
import com.cgg.pages.RegHomelessLoginPage;
import com.cgg.pages.TestBase;
import com.cgg.util.TestUtil;
import com.relevantcodes.extentreports.LogStatus;


public class EliminationpovertyLoginTestCase  extends TestBase{
	
	 @Test(dataProvider="getData")
	public void Login(Hashtable <String,String>data)
	{
		 if(!TestUtil.isExecutable(this.getClass().getSimpleName(),xls)|| data.get("Runmode").equalsIgnoreCase("N"))
				throw new SkipException("Skipping the Test Case Number");
		   test=report.startTest("Testing login functionality");
		    driver.get("http://www.tmepma.cgg.gov.in/login.do");
			test.log(LogStatus.INFO, "Going to test  Loging Functionality");
			RegHomelessLoginPage hm=PageFactory.initElements(driver, RegHomelessLoginPage.class);
			HomelessPersonsAppFormPagePage regLogged=hm.HomeLessLogin(data.get("LoginId"), data.get("Password"));
			if(data.get("DataFlag").equalsIgnoreCase("P") && hm.isEliminatonPovertyHomePageOpened()){
				reportFail("unable to logged for valid data");
				}
				else 
					
					if(data.get("DataFlag").equalsIgnoreCase("N") && regLogged.isHomelessPersonsAppFormPagePage()){
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
