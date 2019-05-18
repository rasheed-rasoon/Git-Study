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
import com.ghmc.lr.util.FunctionUtil;
import com.ghmc.lr.util.TestUtil;

public class LrDdUpdateDDDetailsPageTest extends TestBase {

	@Test(dataProvider ="getData",enabled=true)
	public void lrUpdateDDDetails(Hashtable<String, String> data) throws Exception {
		if (!TestUtil.isExecutable(this.getClass().getSimpleName(), xls) ||data.get("Runmode").equalsIgnoreCase("N"))
			throw new SkipException("Skipping the Test Case Number");
		test=report.startTest("");
		driver.get("http://inctest.apcgg.gov.in/GhmcLogin.aspx");
		GHMCEmpLoginPage homePage=PageFactory.initElements(this.driver,GHMCEmpLoginPage .class);
		GhmcEMpLoggedInPage ghmcLoggedInPage=homePage.ghmcEmpLogin("9989930333","123");



		//Lr home page
		LRHomePage lrHome=	ghmcLoggedInPage.clickOnLayOutRegularalizationLink();	

		lrHome.mouseHoverOnTransactionsTab();
		UpdateOrCancelDDDetailsPage updateOrCancelCheckBox=lrHome.clickUpdateDDDetails();
		updateOrCancelCheckBox.selectUpdateCheckBox();
		UpdateApplicantDDDetailsPage updateAppDDDetails=updateOrCancelCheckBox.getDataToUpdate("3000002676", "10122015113512");
		updateAppDDDetails.updateApplicantDDDetails(data.get("DDNumber"),data.get("Amount"),data.get("Remarks"));	

		if (data.get("DataFlag").equalsIgnoreCase("P")&& !FunctionUtil.alertText().equals("Your Details Updated Successfully.")) {
			reportFail("No able to update DDdetaila with valid data ");

		}else if(data.get("DataFlag").equalsIgnoreCase("N")&& FunctionUtil.alertText().equals("Your Details Updated Successfully.")) {
			reportFail(" Able to update Dddetails with invalid data ");
		}
		else{


			reportpass("update dd details working fine +");
		}

	}

	@DataProvider
	public Object[][] getData() {

		return TestUtil.getData(this.getClass().getSimpleName(), xls);
	}

}
