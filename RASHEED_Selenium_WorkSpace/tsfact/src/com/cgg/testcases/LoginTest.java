package com.cgg.testcases;
import java.util.Hashtable;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.cgg.Pages.EntreprenuerLoggedinPage;
import com.cgg.Pages.HomePage;
import com.cgg.util.TestUtil;

public class LoginTest extends TestBase{
	
	@Test(dataProvider="getData")
	public void testLogin(Hashtable<String,String>data){	

		if(!TestUtil.isExecutable(this.getClass().getSimpleName(), xls)|| data.get("Runmode").equalsIgnoreCase("N"))
			throw new SkipException("Skipping the Test Case Number");
		
		driver.get("http://test.cgg.gov.in:8083/tsfactories/home.do");

		HomePage home=PageFactory.initElements(driver,HomePage.class);
		//APP_LOGxS.info("going to enter user id and Password");
		EntreprenuerLoggedinPage	lp= home.Entreprenuerlogin(data.get("LoginId"), data.get("Password"));
		
		if(data.get("DataFlag").equalsIgnoreCase("P")){
            Assert.assertTrue(lp.isEntreprenuerLoggedInPageOpened(),"Unable to log in");
           
            //lp.doEntreprenuerLogout();
    		//APP_LOGS.info("click on logout");
    		
		}else
            if(data.get("DataFlag").equalsIgnoreCase("N")){
                Assert.assertTrue(home.isHomePageOpened(),"Able log in with invalid data");    
            } 

	}




	@DataProvider
	public Object[][] getData(){
		return TestUtil.getData(this.getClass().getSimpleName(),xls);
	}



}
