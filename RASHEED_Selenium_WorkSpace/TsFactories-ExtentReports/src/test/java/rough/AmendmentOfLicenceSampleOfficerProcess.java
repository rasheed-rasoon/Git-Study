package rough;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.cgg.Pages.AmendmentAndLicenceWebTableProcessPage;
import com.cgg.Pages.AmendmentOfLicenceDistrictWebTablePage;
import com.cgg.Pages.AmendmentOfLicenceReplyToQueryPage;
import com.cgg.Pages.AmendmentOfLicenceStatusPage;
import com.cgg.Pages.EntreprenuerLoggedinPage;
import com.cgg.Pages.HomePage;
import com.cgg.Pages.OfficerLoggedinPage;
import com.cgg.testcases.TestBase;
import com.cgg.util.FunctionUtil;

public class AmendmentOfLicenceSampleOfficerProcess  extends TestBase{
	@Test(priority = 0, description = "get applicaton number to perform officer activities ", enabled = false)
	public void getTheAppToProcessGrantOfLicence() {
//		// Log in and get the application number
//		driver.get("http://test.cgg.gov.in:8083/tsfactories/home.do");
//		HomePage ehome = PageFactory.initElements(driver, HomePage.class);
//		EntreprenuerLoggedinPage entp = ehome.Entreprenuerlogin("rasheed0566", "R@sheed0566");
	FunctionUtil.getRegistrationNumberUsingDB();
		Assert.assertNotEquals("FAM201700767", null);
	}
	

	@Test(priority = 1, description = "officer put the status as Query", enabled = true)
	public void putTheStatusAsQuery() {
		driver.get("http://test.cgg.gov.in:8083/tsfactories/home.do");
		HomePage ohome = PageFactory.initElements(driver, HomePage.class);
		OfficerLoggedinPage off2 = ohome.officerlogin("DOF", "guest");
		AmendmentOfLicenceDistrictWebTablePage amenDistrict = off2.clickOnAmendmentLicenceView();
		WebElement table=driver.findElement(By.xpath(".//*[@id='detailsTable']"));
		List<WebElement> r=table.findElements(By.tagName("tr"));
		for(int i=0;i<r.size();i++){
			List<WebElement> c=r.get(i).findElements(By.tagName("td"));
			for(int j=0;j<c.size();j++){
				String str=c.get(j).getText();
				if(str.equalsIgnoreCase("Total"))
				{
			
				driver.findElement(By.xpath(".//*[@id='detailsTable']/tbody/tr["+i+"]/td["+j+1+"]/a")).click();
				}
				
			}
		}
		AmendmentAndLicenceWebTableProcessPage amendProcess = amenDistrict.ClickOnPrescrutinyPendingTotal();
		//amendProcess.sendApplicationNumber("FAM201700767");
		AmendmentOfLicenceStatusPage amendStatus = amendProcess.ClickOnProcess();
		amendStatus.selectStatus("Query");
		amendStatus.sendOfficerRemarks("Query");
		amendStatus.clickOnUpdateButton();
		Assert.assertEquals(amendProcess.getConfirmationMessageForQuery(), "Data updated successfully...");
		APP_LOGS.info("Put the status as query done");

	}

	@Test(priority = 2, enabled = true)
	public void ReplyToQueryByTheEntreprenuer() {
		driver.get("http://test.cgg.gov.in:8083/tsfactories/home.do");
		HomePage ehome = PageFactory.initElements(driver, HomePage.class);
		EntreprenuerLoggedinPage entp = ehome.Entreprenuerlogin("rasheed0566", "R@sheed0566");

		AmendmentOfLicenceReplyToQueryPage amenReplyQuery = entp.amendmentReplyToQuery("FAM201700767");

		amenReplyQuery.fillReplyToQuerForm("excel", "Excel");
		Assert.assertEquals(amenReplyQuery.getConfirmationMessageForReplyToQuery(),"YOU HAVE SUCCESSFULLY RESPONDED TO QUERY");
		APP_LOGS.info("Reply to query done");
	}

	@Test(priority = 3, enabled = true)
	public void putTheStatusAsScrutinyCompleted() {
		driver.get("http://test.cgg.gov.in:8083/tsfactories/home.do");
		HomePage ohome = PageFactory.initElements(driver, HomePage.class);
		OfficerLoggedinPage off2 = ohome.officerlogin("DOF", "guest");
		AmendmentOfLicenceDistrictWebTablePage amenDistrict = off2.clickOnAmendmentLicenceView();
		AmendmentAndLicenceWebTableProcessPage amendProcess = amenDistrict.ClickOnPrescrutinyPendingTotal();
		amendProcess.sendApplicationNumber("FAM201700767");// EntreprenuerLoggedinPage.appNumber
		AmendmentOfLicenceStatusPage amendStatus = amendProcess.ClickOnProcess();
		amendStatus.selectStatus("Scrutiny Completed");
		amendStatus.sendOfficerRemarks("Scrutiny Completed");
		amendStatus.clickOnUpdateButton();
		Assert.assertEquals(amendProcess.getConfirmationMessageForScrutiny(), "Data updated successfully...");
		APP_LOGS.info("Put the status as Scrutiny completed done");
	}

	@Test(priority = 4, enabled = true)
	public void putTheStatusAsRejected() {
		driver.get("http://test.cgg.gov.in:8083/tsfactories/home.do");
		HomePage ohome = PageFactory.initElements(driver, HomePage.class);
		OfficerLoggedinPage off2 = ohome.officerlogin("DOF", "guest");
		AmendmentOfLicenceDistrictWebTablePage amenDistrict = off2.clickOnAmendmentLicenceView();
		AmendmentAndLicenceWebTableProcessPage amendProcess = amenDistrict.ClickApprovalUnderProcessTotal();
		amendProcess.sendApplicationNumber("FAM201700767");// EntreprenuerLoggedinPage.appNumber
		AmendmentOfLicenceStatusPage amendStatus = amendProcess.ClickOnProcess();
		amendStatus.selectStatus("Rejected");
		amendStatus.sendOfficerRemarks("Rejected");
		amendStatus.clickOnUpdateButton();
		Assert.assertEquals(amendProcess.getConfirmationMessageForReject(), "Data updated successfully...");
		APP_LOGS.info("Put the status as Rejected done");
	}
}
