package com.cgg.testcases;

import java.util.Hashtable;
import org.openqa.selenium.support.PageFactory;
import org.testng.SkipException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.cgg.Pages.EntreprenuerLoggedinPage;
import com.cgg.Pages.HomePage;
import com.cgg.Pages.TransferOfLicenceSubmitPage;
import com.cgg.Pages.TransferOfLicensePages;
import com.cgg.util.FunctionUtil;
import com.cgg.util.TestUtil;
import com.relevantcodes.extentreports.LogStatus;

public class TransferOfLicenseTest extends TestBase{
  @Test(dataProvider = "getData")
	   	public void TransferOfLicenceFormFilling(Hashtable<String, String> data) throws Exception {
	  test=report.startTest("Testin g login functionality");
	  
		if (!TestUtil.isExecutable(this.getClass().getSimpleName(), xls) || data.get("Runmode").equalsIgnoreCase("N")){
			test.log(LogStatus.SKIP, "Skipping the Test Case Number");
			throw new SkipException("Skipping the Test Case Number");
		}
		driver.get("http://test.cgg.gov.in:8083/tsfactories/home.do");
		test.log(LogStatus.INFO, "navigated to url");
		HomePage home = PageFactory.initElements(driver, HomePage.class);

		//APP_LOGS.info("going to enter user id and paasword");
		EntreprenuerLoggedinPage lp= home.Entreprenuerlogin("rasheed0566", "R@sheed0566");
		TransferOfLicensePages transfer=lp.clickOnTransferOfLicense();
		

		//APP_LOGS.info("going to click on proceed to fill the form ");
		transfer.sendRegistrationNumber(data.get("RegistrationNumber"));
		transfer.clickOnFactoryFullName();
		
		transfer.sendFactoryDoorNo(data.get("FactoryDoorNo"));
		transfer.sendFactoryLocality(data.get("FactoryLocality"));
		transfer.selectTransferFactoryDistrict(data.get("TransferFactoryDistrict"));
		transfer.selectTransferFactoryMandal(data.get("TransferFactoryMandal"));
		transfer.selectTransferFactoryVillage(data.get("TransferFactoryVillage"));
		transfer.sendFactoryPincode(data.get("FactoryPincode"));
		 
		transfer.sendCommunicationAddress(data.get("CommunicationAddress"));
		transfer.clickManager();
		transfer.sendOutgoingManagerOccupier(data.get("NameOfOutgoingManagerOrOccupier"));
		transfer.sendManagerFullName(data.get("ManagerFullName"));
		//transfer.sendManagerMobileNumber(data.get("MobileNumber"));
		transfer.sendManagerEmailId(data.get("ManagerEmailId"));
		transfer.sendManagerDoorno(data.get("ManagerDoorno"));
		transfer.sendManagerLocality(data.get("ManagerLocality"));
		transfer.selectManagerState(data.get("ManagerState"));
		transfer.selectManagerDistrict(data.get("ManagerDistrict"));
		transfer.selectManagerMandal(data.get("ManagerMandal"));
		transfer.selectManagerVillage(data.get("ManagerVillage"));
//		transfer.selectOtherState("OtherState");
//		transfer.sendOtherStatePostalAddress(data.get("OtherStatePostalAddress"));
		transfer.sendManagerPincode(data.get("ManagerPincode"));
		transfer.dateAppointmentOfManager();
		TransferOfLicenceSubmitPage transferSubmit=transfer.clickPreviewAndContinue();
		transferSubmit.clickOnDeclarationTransferOfLicence();
		transferSubmit.clickOnSubmitTransferOfLicence();
		FunctionUtil.acceptAlertIfAvailable();
		if(data.get("DataFlag").equalsIgnoreCase("P")&& !transferSubmit.isTransferOfLicencesuccesfulPageOpened()){
			reportFail("not Able to submit the Transfer of licence form with valid data");
			//			Assert.assertEquals(transferSubmit.getcheckboxtext(), "I hereby declare that the above information is true to the best of my knowledge and belief.");
//			System.err.println(transferSubmit.getcheckboxtext());
//			APP_LOGS.info(transferSubmit.getcheckboxtext());
////			transferSubmit.clickOnDeclarationTransferOfLicence();
////			transferSubmit.clickOnSubmitTransferOfLicence();
//			Assert.assertTrue(transferSubmit.isTransferOfLicencesuccesfulPageOpened(), "Not navigated to Payment page");
		}
			else
			if(data.get("DataFlag").equalsIgnoreCase("N")&&transferSubmit.isTransferOfLicencesuccesfulPageOpened()){
				//FunctionUtil.acceptAlertIfAvailable();
//				Assert.assertTrue(transfer.isTransferOfLicenceFormPageOpened(),"Navigating Payment Page"); 
//				Assert.assertEquals(transferSubmit.getcheckboxtext(),"");
				reportFail(" Able to submit the Transfer of licence form with Invalid data");
			}
			else
				reportpass("Succesfully submit the Transfer Of Licence Form");
}
	@DataProvider
	public Object[][] getData() {
		return TestUtil.getData(this.getClass().getSimpleName(), xls);
	}
}