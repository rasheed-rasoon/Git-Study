package com.cgg.testcases;

import java.util.Hashtable;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.cgg.Pages.HomePage;
import com.cgg.Pages.NewRegistrationFormPage;
import com.cgg.testcases.TestBase;
import com.cgg.util.AssertionsUtil;
import com.cgg.util.FunctionUtil;
import com.cgg.util.TestUtil;


public class NewFactoryRegistrationTest extends TestBase {
	
	@Test(dataProvider="getData")
  public void testNewRegistration(Hashtable<String,String>data) throws Exception{
		
		if(!TestUtil.isExecutable(this.getClass().getSimpleName(), xls)|| data.get("Runmode").equalsIgnoreCase("N"))
			throw new SkipException("Skipping the Test Case Number");
		
		driver.get("http://test.cgg.gov.in:8083/tsfactories/home.do");
		
		HomePage home=PageFactory.initElements(driver,HomePage.class);
		APP_LOGS.info("going to  click on Registration Button");
		home.clickOnNewUserregistration();
	
		NewRegistrationFormPage newReg=PageFactory.initElements(driver,NewRegistrationFormPage.class);
		newReg.sendName(data.get("Name"));
		newReg.selectDistrict(data.get("District"));
		newReg.selectMandal(data.get("Mandal"));
		newReg.sendMobileNumber(data.get("MobileNumber"));
		newReg.sendEmailId(data.get("EmailId"));
		newReg.sendLoginId(data.get("LoginId"));
		newReg.sendPassword(data.get("Password"));
		newReg.sendConfirmPassword(data.get("ConfirmPassword"));
		newReg.clickOnRegisterButton();
		if(data.get("DataFlag").equalsIgnoreCase("P")){
		
            Assert.assertTrue(FunctionUtil.checkAlert(),"Unable to register ");
           
         
    		APP_LOGS.info("successfully registerd by the entreprenuer");
    		
		}else
            if(data.get("DataFlag").equalsIgnoreCase("N")){                
            	Assert.assertTrue(newReg.isRegistrationPageOpened(),"Able to register with Invalid data ");
            	
        		APP_LOGS.info("unable to register due to invalid or some field missing");
            } 

	}
	
  
	@DataProvider
	public Object[][] getData(){
		return TestUtil.getData(this.getClass().getSimpleName(),xls);
	
	
}

}