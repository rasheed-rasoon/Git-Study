package com.ghmc.lr.testcases;

import java.util.Hashtable;

import org.openqa.selenium.support.PageFactory;
import org.testng.SkipException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.ghmc.lr.pages.GHMCEmpLoginPage;
import com.ghmc.lr.pages.GhmcEMpLoggedInPage;
import com.ghmc.lr.pages.LRHomePage;
import com.ghmc.lr.pages.UpdateOrCancelDDDetailsPage;
import com.ghmc.lr.util.FunctionUtil;
import com.ghmc.lr.util.TestUtil;

public class LrDdCancelTest extends TestBase{
	@Test(dataProvider = "getData",enabled=true)
	public void lrUpdateDDDetails(Hashtable<String, String> data) throws Exception {
		if (!TestUtil.isExecutable(this.getClass().getSimpleName(), xls) || data.get("Runmode").equalsIgnoreCase("N"))
			throw new SkipException("Skipping the Test Case Number");
		test=report.startTest("LR cancel DD details");
		driver.get("http://inctest.apcgg.gov.in/GhmcLogin.aspx");
		GHMCEmpLoginPage homePage=PageFactory.initElements(driver,GHMCEmpLoginPage .class);
		GhmcEMpLoggedInPage ghmcLoggedInPage=homePage.ghmcEmpLogin("9989930333","123");
		LRHomePage lrHome=	ghmcLoggedInPage.clickOnLayOutRegularalizationLink();	
		lrHome.mouseHoverOnTransactionsTab();
	    UpdateOrCancelDDDetailsPage updateOrCancelCheckBox=lrHome.clickUpdateDDDetails();
	    updateOrCancelCheckBox.cancelDDdetails(data.get("AppNumber"), data.get("ReceiptNumber"),data.get("Remarks"));


	        
	    if (data.get("DataFlag").equalsIgnoreCase("P")&& !FunctionUtil.alertText().equals("Your Application has been Cancelled Successfully.")) {
			reportFail("Not able to cancel dd details with valid input ");

		}else if(data.get("DataFlag").equalsIgnoreCase("N")&& FunctionUtil.alertText().equals("Your Application has been Cancelled Successfully.")) {
			reportFail(" Able to cancel dd details with invalid  input ");
		}
		else{
			
			
			reportpass("cancel dd details functionality working fine");
		}
		}
	@DataProvider
	public Object[][] getData() {

		return TestUtil.getData(this.getClass().getSimpleName(), xls);
	}
	
}
