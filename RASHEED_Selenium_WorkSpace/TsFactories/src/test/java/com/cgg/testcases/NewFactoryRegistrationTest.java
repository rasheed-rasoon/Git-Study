package com.cgg.testcases;

import java.util.Hashtable;

import org.openqa.selenium.support.PageFactory;
import org.testng.SkipException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.cgg.Pages.HomePage;
import com.cgg.Pages.NewRegistrationFormPage;
import com.cgg.testcases.TestBase;
import com.cgg.util.FunctionUtil;
import com.cgg.util.TestUtil;
import com.relevantcodes.extentreports.LogStatus;


public class NewFactoryRegistrationTest extends TestBase {
	
	@Test(dataProvider="getData")
  public void testNewRegistration(Hashtable<String,String>data) throws Exception{
		test=report.startTest("Start testing  New user Registration");
		if(!TestUtil.isExecutable(this.getClass().getSimpleName(), xls)|| data.get("Runmode").equalsIgnoreCase("N"))
			throw new SkipException("Skipping the Test Case Number");
		driver.get("http://test.cgg.gov.in:8083/tsfactories/home.do");
		HomePage home=PageFactory.initElements(driver,HomePage.class);
	    home.clickOnNewUserregistration();
		APP_LOGS.info("clicked on New user registration");
		NewRegistrationFormPage newReg=PageFactory.initElements(driver,NewRegistrationFormPage.class);
		newReg.sendName(data.get("Name"));
	
		newReg.selectDistrict(data. get("District"));
		test.log(LogStatus.INFO, "District name entered");
		newReg.selectMandal(data.get("Mandal"));
		test.log(LogStatus.INFO, "Mandal entered");
		newReg.sendMobileNumber(data.get("MobileNumber"));
		test.log(LogStatus.INFO, "Mobile Number entered ");
		newReg.sendEmailId(data.get("EmailId"));
		test.log(LogStatus.INFO, "EmailId entered");
		newReg.sendLoginId(data.get("LoginId"));
		test.log(LogStatus.INFO, "LoginID entered");
		newReg.sendPassword(data.get("Password"));
		test.log(LogStatus.INFO, "Password entered");
		newReg.sendConfirmPassword(data.get("ConfirmPassword"));
		test.log(LogStatus.INFO, "confirm password entered ");
		newReg.clickOnRegisterButton();
		test.log(LogStatus.INFO, "clicked on register button");
		if(data.get("DataFlag").equalsIgnoreCase("P")&&!FunctionUtil.checkAlert()){
		
//            Assert.assertTrue(FunctionUtil.checkAlert(),"Unable to register ");
//           
//         
//    		APP_LOGS.info("successfully registerd by the entreprenuer");
			reportFail("For valid data, application not creating any new user");
    		
		}else
            if(data.get("DataFlag").equalsIgnoreCase("N")&&FunctionUtil.checkAlert()){                
            	//Assert.assertTrue(newReg.isRegistrationPageOpened(),"Able to register with Invalid data ");
            	
        		//APP_LOGS.info("unable to register due to invalid or some field missing");
            	reportFail("For invalid data, Application creating new user");
            } 
            else
            	reportpass("New user creating succesfully ");

	}
	
  
	@DataProvider
	public Object[][] getData(){
		return TestUtil.getData(this.getClass().getSimpleName(),xls);
	
	
}

}