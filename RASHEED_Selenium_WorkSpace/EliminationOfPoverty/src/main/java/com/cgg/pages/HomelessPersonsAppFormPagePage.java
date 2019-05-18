package com.cgg.pages;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cgg.constants.HomelessPersonsConstants;
import com.cgg.util.AssertionsUtil;
import com.cgg.util.FunctionUtil;
import com.cgg.util.WaitUtil;





	public class HomelessPersonsAppFormPagePage extends TestBase{
		private WebDriver driver;

		public HomelessPersonsAppFormPagePage(WebDriver driver) {
			this.driver = driver;
			PageFactory.initElements(driver, this);
		}

		
		@FindBy(linkText="Logout")
		private WebElement LogoutButton;
		
		
         public boolean isHomelessPersonsAppFormPagePage(){
			try {
				 AssertionsUtil.isElementPresent(this.NameOfTheHomeless);
			} catch(NoSuchElementException e) {
				return false;
			}
			return true;
		}
		
		
		@FindBy(xpath = HomelessPersonsConstants.NAMEOFTHEHOMELESS)
		private WebElement NameOfTheHomeless;
		
		public void sendNameOfTheHomeless(String nameOfTheHomeless) {
			this.NameOfTheHomeless.sendKeys(nameOfTheHomeless);
		}
		
//		@FindBy(xpath="html/body/center/table/tbody/tr/td/table/tbody/tr[2]/td/table/tbody/tr[2]/td/div/div/div/div[3]/div/a[10]/div/div/div")
//		private WebElement ClickOnShelterForUrbanHomelessTab;
//		
//		public void click
		@FindBy(xpath = HomelessPersonsConstants.GENDERMALE)
		private WebElement GenderMale;
		
		public void radioGenderMale() {
			this.GenderMale.click();
		}
		
		@FindBy(xpath = HomelessPersonsConstants.GENDERFEMALE)
		private WebElement GenderFemale;
		
		public void radioGenderFemale(String genderFemale) {
			this.GenderFemale.sendKeys(genderFemale);
		}
		
		@FindBy(xpath = HomelessPersonsConstants.AGE)
		private WebElement Age;
		
		public void sendAge(String age) {
			this.Age.sendKeys(age);
		}
		
		@FindBy(xpath = HomelessPersonsConstants.EDUCATIONALQUALIFICATION)
		private WebElement EducationalQualification;
		
		public void selectEducationalQualification(String educationalQualification) {
			WaitUtil.waitForElementVisible(this.EducationalQualification);
			this.EducationalQualification.sendKeys(educationalQualification);
			FunctionUtil.acceptAlertIfAvailable();
			//FunctionUtil.select_Option_In_DropDown_ByVisibleText(this.EducationalQualification, educationalQualification);
		}
		
		@FindBy(xpath = HomelessPersonsConstants.EDUCATIONALQUALIFICATIONANYOTHERS)
		private WebElement EducationalQualificationAnyOthers;
		
		public void sendEducationalQualificationAnyOthers(String educationalQualificationAnyOthers) {
			this.EducationalQualificationAnyOthers.sendKeys(educationalQualificationAnyOthers);
		}
		
		@FindBy(xpath = HomelessPersonsConstants.MARRIEDSTATUS)
		private WebElement MarriedStatus;
		
		public void selectMarriedStatus(String marriedStatus) {
			this.MarriedStatus.sendKeys(marriedStatus);
			FunctionUtil.acceptAlertIfAvailable();
			//FunctionUtil.select_Option_In_DropDown_ByVisibleText(this.MarriedStatus, marriedStatus);
		}
		
		@FindBy(xpath = HomelessPersonsConstants.NAMEOFTHEFATHER)
		private WebElement SendNameOfTheFather;
		
		public void sendNameOfTheFather(String nameoftheFather) {
			this.SendNameOfTheFather.sendKeys(nameoftheFather);
			//FunctionUtil.select_Option_In_DropDown_ByVisibleText(this.SendNameOfTheFather, nameoftheFather);
		}
		@FindBy(xpath = HomelessPersonsConstants.CASTE)
		private WebElement Caste;
		
		public void selectCaste(String caste) {
			this.Caste.sendKeys(caste);
			FunctionUtil.acceptAlertIfAvailable();
			//FunctionUtil.select_Option_In_DropDown_ByVisibleText(this.Caste, caste);
		}
		
		@FindBy(xpath = HomelessPersonsConstants.OCCUPATION)
		private WebElement Occupation;
		
		public void selectOccupation(String occupation) {
			this.Occupation.sendKeys(occupation);
			FunctionUtil.acceptAlertIfAvailable();
			//FunctionUtil.select_Option_In_DropDown_ByVisibleText(this.Occupation, occupation);
		}
		
		@FindBy(xpath = HomelessPersonsConstants.OCCUPATIONOTHERS)
		private WebElement OccupationOthers;
		
		public void sendOccupationOthers(String occupationOthers) {
			this.OccupationOthers.sendKeys(occupationOthers);
		}
		
		@FindBy(xpath = HomelessPersonsConstants.LOCATIONOFPRESENTSTAY)
		private WebElement LocationOfPresentStay;
		
		public void selectLocationOfPresentStay(String locationOfPresentStay) {
			this.LocationOfPresentStay.sendKeys(locationOfPresentStay);
			FunctionUtil.acceptAlertIfAvailable();
			//FunctionUtil.select_Option_In_DropDown_ByVisibleText(this.LocationOfPresentStay, locationOfPresentStay);
		}
		
		@FindBy(xpath = HomelessPersonsConstants.PLACEOFOCCUPATION)
		private WebElement PlaceOfOccupation;
		
		public void selectPlaceOfOccupation(String placeOfOccupation) {
			this.PlaceOfOccupation.sendKeys(placeOfOccupation);
			FunctionUtil.acceptAlertIfAvailable();
			//FunctionUtil.select_Option_In_DropDown_ByVisibleText(this.PlaceOfOccupation, placeOfOccupation);
		}
		
		@FindBy(xpath = HomelessPersonsConstants.DISABILITYIFANYNO)
		private WebElement DisabilityIfAnyNo;
		
		public void radioDisabilityIfAnyNo(String disabilityIfAnyNo) {
			this.DisabilityIfAnyNo.sendKeys(disabilityIfAnyNo);
		}
		
		@FindBy(xpath = HomelessPersonsConstants.DISABILITYIFANYYES)
		private WebElement DisabilityIfAnyYes;
		
		public void radioDisabilityIfAnyYes() {
			WaitUtil.waitForElementVisible(this.DisabilityIfAnyYes);
			this.DisabilityIfAnyYes.click();
		}
		
		@FindBy(xpath = HomelessPersonsConstants.DISABILITYIFANYDROPDOWN)
		private WebElement DisabilityIfAnyDropdown;
		
		public void selectDisabilityIfAnyDropdown(String disabilityIfAnyDropdown) {
			WaitUtil.waitForElementVisible(this.DisabilityIfAnyDropdown);
			this.DisabilityIfAnyDropdown.sendKeys(disabilityIfAnyDropdown);
			FunctionUtil.acceptAlertIfAvailable();
			//FunctionUtil.select_Option_In_DropDown_ByVisibleText(this.DisabilityIfAnyDropdown, disabilityIfAnyDropdown);
		}
		
		@FindBy(xpath = HomelessPersonsConstants.HEALTHSTATUS)
		private WebElement HealthStatus;
		
		public void selectHealthStatus(String healthStatus) {
			this.HealthStatus.sendKeys(healthStatus);
			FunctionUtil.acceptAlertIfAvailable();
			//FunctionUtil.select_Option_In_DropDown_ByVisibleText(this.HealthStatus, healthStatus);
		}
		
		@FindBy(xpath = HomelessPersonsConstants.REASONSFORHOMELESSNESS)
		private WebElement ReasonsForHomelessness;
		
		public void selectReasonsForHomelessness(String reasonsForHomelessness) {
			this.ReasonsForHomelessness.sendKeys(reasonsForHomelessness);
			FunctionUtil.acceptAlertIfAvailable();
			//FunctionUtil.select_Option_In_DropDown_ByVisibleText(this.ReasonsForHomelessness, reasonsForHomelessness);
		}
		
		@FindBy(xpath = HomelessPersonsConstants.PERIODOFHOMELESS)
		private WebElement PeriodOfHomeless;
		
		public void selectPeriodOfHomeless(String periodOfHomeless) {
			this.PeriodOfHomeless.sendKeys(periodOfHomeless);
			FunctionUtil.acceptAlertIfAvailable();
			//FunctionUtil.select_Option_In_DropDown_ByVisibleText(this.PeriodOfHomeless, periodOfHomeless);
		}
		
		@FindBy(xpath = HomelessPersonsConstants.STAY)
		private WebElement Stay;
		
		public void selectStay(String stay) {
			WaitUtil.waitForElementVisible(this.Stay);
			this.Stay.sendKeys(stay);
			FunctionUtil.acceptAlertIfAvailable();
			//FunctionUtil.select_Option_In_DropDown_ByVisibleText(this.Stay, stay);
		}
		
		@FindBy(xpath = HomelessPersonsConstants.IDENTITYPROOF)
		private WebElement IdentityProof;
		
		public void selectIdentityProof(String identityProof) {
			this.IdentityProof.sendKeys(identityProof);
			FunctionUtil.acceptAlertIfAvailable();
			//FunctionUtil.select_Option_In_DropDown_ByVisibleText(this.IdentityProof, identityProof);
		}
		
		@FindBy(xpath = HomelessPersonsConstants.PHOTOUPLOAD)
		private WebElement PhotoUpload;
		
		public void browsePhotoUpload(String photoUpload) {
			this.PhotoUpload.sendKeys(photoUpload);
			FunctionUtil.acceptAlertIfAvailable();
		}
		
		@FindBy(xpath = HomelessPersonsConstants.IDPROOFNO)
		private WebElement IdProofNo;
		
		public void sendIdProofNo(String idProofNo) {
			this.IdProofNo.sendKeys(idProofNo);
		}
		
		@FindBy(xpath = HomelessPersonsConstants.REMARKS)
		private WebElement Remarks;
		
		public void sendRemarks(String remarks) {
			WaitUtil.waitForElementVisible(this.Remarks);
			this.Remarks.click();
			this.Remarks.sendKeys(remarks);
		}
		@FindBy(xpath = HomelessPersonsConstants.CLICKSUBMIT)
		private WebElement CLickOnubmit;
		
		public HomeLessRecordsPage clickOnSubmit() {
			this.CLickOnubmit.click();
			FunctionUtil.acceptAlertIfAvailable();
			return PageFactory.initElements(driver, HomeLessRecordsPage.class);
		}
}

