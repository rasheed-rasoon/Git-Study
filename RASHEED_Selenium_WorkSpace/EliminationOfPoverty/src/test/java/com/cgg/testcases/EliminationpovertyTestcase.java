package com.cgg.testcases;


import java.util.Hashtable;
import org.openqa.selenium.support.PageFactory;
import org.testng.SkipException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.cgg.pages.HomeLessRecordsPage;
import com.cgg.pages.HomelessPersonsAppFormPagePage;
import com.cgg.pages.RegHomelessLoginPage;
import com.cgg.pages.TestBase;
import com.cgg.util.TestUtil;

public class EliminationpovertyTestcase extends TestBase{
  @Test(dataProvider="getData")
  public void f(Hashtable <String,String>data) {
	  if(!TestUtil.isExecutable(this.getClass().getSimpleName(),xls)|| data.get("Runmode").equalsIgnoreCase("N"))
			throw new SkipException("Skipping the Test Case Number");
	  
	  driver.get("http://www.tmepma.cgg.gov.in/login.do");

		//test.log(LogStatus.INFO, "Going to test  Loging Functionality");
	  
	  RegHomelessLoginPage login=PageFactory.initElements(driver, RegHomelessLoginPage.class);
	  HomeLessRecordsPage record=login.HomeLessLogin("tpro/prp_adilabad", "guest");
	  driver.get("http://www.tmepma.cgg.gov.in/homeLessData.do");
	  HomelessPersonsAppFormPagePage regLogin=record.clickOnAddRecord();
	  regLogin.sendNameOfTheHomeless(data.get("NameOfTheHomeless"));
	  regLogin.radioGenderMale();
	  regLogin.selectEducationalQualification(data.get("Education Qualification"));
	  regLogin.selectLocationOfPresentStay(data.get("LocationofpresentStay"));
	  regLogin.radioDisabilityIfAnyYes();
	  regLogin.selectDisabilityIfAnyDropdown(data.get("DisabilityifAny"));
	  regLogin.selectReasonsForHomelessness(data.get("ReasonsForHomelessness"));
	  regLogin.selectStay(data.get("Stay"));
	  regLogin.selectIdentityProof(data.get("IdentityProof"));
	
	  regLogin.sendRemarks(data.get("Remarks/SpecialAttention"));
	  regLogin.sendNameOfTheFather(data.get("NameOfTheFather"));
	  regLogin.sendAge(data.get("Age"));
	  regLogin.selectMarriedStatus(data.get("MarriedStatus"));
	  regLogin.selectCaste(data.get("Caste"));
	  regLogin.selectOccupation(data.get("Occupation"));


regLogin.selectReasonsForHomelessness(data.get("Reasons for Homelessness"));
regLogin.selectPlaceOfOccupation(data.get("PlaceofOccupation "));
regLogin.selectHealthStatus(data.get("HealthStatus"));
regLogin.selectPeriodOfHomeless(data.get("PeriodOfHomeles"));
regLogin.browsePhotoUpload(data.get(""));
regLogin.sendIdProofNo(data.get("IdProofNo"));
HomeLessRecordsPage hmRecor=regLogin.clickOnSubmit();

if(data.get("DataFlag").equalsIgnoreCase("P") && regLogin.isHomelessPersonsAppFormPagePage()){
	reportFail("unable to submit the Homeless application form with Valid data");
	}
	else 
		
		if(data.get("DataFlag").equalsIgnoreCase("N") && hmRecor.isRecorSuccessMessageDisplayed()){
		reportFail("Able to submit the Homeless application form with Ivalid data");
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
