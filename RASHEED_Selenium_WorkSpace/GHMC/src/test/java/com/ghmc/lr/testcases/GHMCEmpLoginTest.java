package com.ghmc.lr.testcases;

import java.util.Hashtable;

import org.openqa.selenium.support.PageFactory;
import org.testng.SkipException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.ghmc.lr.pages.GHMCEmpLoginPage;
import com.ghmc.lr.pages.GhmcEMpLoggedInPage;
import com.ghmc.lr.pages.LRHomePage;
import com.ghmc.lr.pages.UpdateApplicantDDDetailsPage;
import com.ghmc.lr.pages.UpdateOrCancelDDDetailsPage;
import com.ghmc.lr.util.TestUtil;

public class GHMCEmpLoginTest extends TestBase {	
	@Test(dataProvider = "getData",enabled=false)
	public void ghmcEMployeeLogin(Hashtable<String, String> data) throws Exception {

		if (!TestUtil.isExecutable(this.getClass().getSimpleName(), xls) || data.get("Runmode").equalsIgnoreCase("N"))
			throw new SkipException("Skipping the Test Case Number");
		test=report.startTest("Ghmc employee login functionality");
		driver.get("http://inctest.apcgg.gov.in/GhmcLogin.aspx");
		GHMCEmpLoginPage homePage=PageFactory.initElements(driver,GHMCEmpLoginPage .class);
		GhmcEMpLoggedInPage ghmcLoggedInPage=homePage.ghmcEmpLogin(data.get("MobileNumber"), data.get("Password"));
		
		if (data.get("DataFlag").equalsIgnoreCase("P")&& homePage.isghmcEmpLoginPageOpened()){
			reportFail("Not navigated to Login page with valid data ");

		}else if(data.get("DataFlag").equalsIgnoreCase("N")&& ghmcLoggedInPage.isGhmcEMpLoggedInPageOpened()) {
			reportFail(" navigated to Login page with Invalid data ");
		}
		else{
			reportpass("Ghmc login functionality working fine");
		}
		
		ghmcLoggedInPage.clickOnLogout();
		
		if (data.get("DataFlag").equalsIgnoreCase("P")&& homePage.isghmcEmpLoginPageOpened()){
			reportFail("Logout functionality not working");

		}else if(data.get("DataFlag").equalsIgnoreCase("N")&& ghmcLoggedInPage.isGhmcEMpLoggedInPageOpened()) {
			reportFail("Logout functionality not working");
		}
		else{
	
			reportpass("Logout functionality working ");
		}
		
	}
	@Test(dataProvider = "getData",enabled=false)
	public void lrUpdateDDDetails(Hashtable<String, String> data) throws Exception {

		test=report.startTest("Update Dd details  functionality");
		driver.get("http://inctest.apcgg.gov.in/GhmcLogin.aspx");
		GHMCEmpLoginPage homePage=PageFactory.initElements(driver,GHMCEmpLoginPage .class);
		GhmcEMpLoggedInPage ghmcLoggedInPage=homePage.ghmcEmpLogin("9989930333","123");
	    //ghmcLoggedInPage.mouseHoverOnTransactionsTab();
		LRHomePage lrHome=	ghmcLoggedInPage.clickOnLayOutRegularalizationLink();	
		lrHome.mouseHoverOnTransactionsTab();
		UpdateOrCancelDDDetailsPage updateOrCancelCheckBox=lrHome.clickUpdateDDDetails();
		updateOrCancelCheckBox.selectUpdateCheckBox();
		UpdateApplicantDDDetailsPage updateAppDDDetails=updateOrCancelCheckBox.getDataToUpdate("3000002777", "10122015033854");
		updateAppDDDetails.updateApplicantDDDetails(data.get("DDNumber"),data.get("Amount"),data.get("Remarks"));


	
				}
	@Test(enabled=true)
	public void lrUpdateDDDetails() throws Exception {
		test=report.startTest("LR cancel DD details");
		driver.get("http://inctest.apcgg.gov.in/GhmcLogin.aspx");
		GHMCEmpLoginPage homePage=PageFactory.initElements(driver,GHMCEmpLoginPage .class);
		GhmcEMpLoggedInPage ghmcLoggedInPage=homePage.ghmcEmpLogin("9989930333","123");
		LRHomePage lrHome=	ghmcLoggedInPage.clickOnLayOutRegularalizationLink();	
		lrHome.mouseHoverOnTransactionsTab();
	    UpdateOrCancelDDDetailsPage updateOrCancelCheckBox=lrHome.clickUpdateDDDetails();
	    updateOrCancelCheckBox.cancelDDdetails("123456", "12345", "updated");
	     
		}
	
	
	@DataProvider
	public Object[][] getData() {

		return TestUtil.getData(this.getClass().getSimpleName(), xls);
	}
}
