package com.bms.rough;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.bms.testcases.TestBase;
import com.cgg.util.FunctionUtil;





	public class HomelessPersonsPages extends TestBase{
		private WebDriver driver;

		public HomelessPersonsPages(WebDriver driver) {
			this.driver = driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(xpath = HomelessPersonsConstants.NAMEOFTHEHOMELESS)
		private WebElement NameOfTheHomeless;
		
		public void sendNameOfTheHomeless(String nameOfTheHomeless) {
			this.NameOfTheHomeless.sendKeys(nameOfTheHomeless);
		}
		
		@FindBy(xpath = HomelessPersonsConstants.GENDERMALE)
		private WebElement GenderMale;
		
		public void radioGenderMale(String genderMale) {
			this.GenderMale.sendKeys(genderMale);
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
			FunctionUtil.select_Option_In_DropDown_ByVisibleText(this.EducationalQualification, educationalQualification);
		}
		
		@FindBy(xpath = HomelessPersonsConstants.EDUCATIONALQUALIFICATIONANYOTHERS)
		private WebElement EducationalQualificationAnyOthers;
		
		public void sendEducationalQualificationAnyOthers(String educationalQualificationAnyOthers) {
			this.EducationalQualificationAnyOthers.sendKeys(educationalQualificationAnyOthers);
		}
		
		@FindBy(xpath = HomelessPersonsConstants.MARRIEDSTATUS)
		private WebElement MarriedStatus;
		
		public void selectMarriedStatus(String marriedStatus) {
			FunctionUtil.select_Option_In_DropDown_ByVisibleText(this.MarriedStatus, marriedStatus);
		}
		
		@FindBy(xpath = HomelessPersonsConstants.CASTE)
		private WebElement Caste;
		
		public void selectCaste(String caste) {
			FunctionUtil.select_Option_In_DropDown_ByVisibleText(this.Caste, caste);
		}
		
		@FindBy(xpath = HomelessPersonsConstants.OCCUPATION)
		private WebElement Occupation;
		
		public void selectOccupation(String occupation) {
			FunctionUtil.select_Option_In_DropDown_ByVisibleText(this.Occupation, occupation);
		}
		
		@FindBy(xpath = HomelessPersonsConstants.OCCUPATIONOTHERS)
		private WebElement OccupationOthers;
		
		public void sendOccupationOthers(String occupationOthers) {
			this.OccupationOthers.sendKeys(occupationOthers);
		}
		
		@FindBy(xpath = HomelessPersonsConstants.LOCATIONOFPRESENTSTAY)
		private WebElement LocationOfPresentStay;
		
		public void selectLocationOfPresentStay(String locationOfPresentStay) {
			FunctionUtil.select_Option_In_DropDown_ByVisibleText(this.LocationOfPresentStay, locationOfPresentStay);
		}
		
		@FindBy(xpath = HomelessPersonsConstants.PLACEOFOCCUPATION)
		private WebElement PlaceOfOccupation;
		
		public void selectPlaceOfOccupation(String placeOfOccupation) {
			FunctionUtil.select_Option_In_DropDown_ByVisibleText(this.PlaceOfOccupation, placeOfOccupation);
		}
		
		@FindBy(xpath = HomelessPersonsConstants.DISABILITYIFANYNO)
		private WebElement DisabilityIfAnyNo;
		
		public void radioDisabilityIfAnyNo(String disabilityIfAnyNo) {
			this.DisabilityIfAnyNo.sendKeys(disabilityIfAnyNo);
		}
		
		@FindBy(xpath = HomelessPersonsConstants.DISABILITYIFANYYES)
		private WebElement DisabilityIfAnyYes;
		
		public void radioDisabilityIfAnyYes(String disabilityIfAnyYes) {
			this.DisabilityIfAnyYes.sendKeys(disabilityIfAnyYes);
		}
		
		@FindBy(xpath = HomelessPersonsConstants.DISABILITYIFANYDROPDOWN)
		private WebElement DisabilityIfAnyDropdown;
		
		public void selectDisabilityIfAnyDropdown(String disabilityIfAnyDropdown) {
			FunctionUtil.select_Option_In_DropDown_ByVisibleText(this.DisabilityIfAnyDropdown, disabilityIfAnyDropdown);
		}
		
		@FindBy(xpath = HomelessPersonsConstants.HEALTHSTATUS)
		private WebElement HealthStatus;
		
		public void selectHealthStatus(String healthStatus) {
			FunctionUtil.select_Option_In_DropDown_ByVisibleText(this.HealthStatus, healthStatus);
		}
		
		@FindBy(xpath = HomelessPersonsConstants.REASONSFORHOMELESSNESS)
		private WebElement ReasonsForHomelessness;
		
		public void selectReasonsForHomelessness(String reasonsForHomelessness) {
			FunctionUtil.select_Option_In_DropDown_ByVisibleText(this.ReasonsForHomelessness, reasonsForHomelessness);
		}
		
		@FindBy(xpath = HomelessPersonsConstants.PERIODOFHOMELESS)
		private WebElement PeriodOfHomeless;
		
		public void selectPeriodOfHomeless(String periodOfHomeless) {
			FunctionUtil.select_Option_In_DropDown_ByVisibleText(this.PeriodOfHomeless, periodOfHomeless);
		}
		
		@FindBy(xpath = HomelessPersonsConstants.STAY)
		private WebElement Stay;
		
		public void selectStay(String stay) {
			FunctionUtil.select_Option_In_DropDown_ByVisibleText(this.Stay, stay);
		}
		
		@FindBy(xpath = HomelessPersonsConstants.IDENTITYPROOF)
		private WebElement IdentityProof;
		
		public void selectIdentityProof(String identityProof) {
			FunctionUtil.select_Option_In_DropDown_ByVisibleText(this.IdentityProof, identityProof);
		}
		
		@FindBy(xpath = HomelessPersonsConstants.PHOTOUPLOAD)
		private WebElement PhotoUpload;
		
		public void browsePhotoUpload(String photoUpload) {
			this.PhotoUpload.sendKeys(photoUpload);
		}
		
		@FindBy(xpath = HomelessPersonsConstants.IDPROOFNO)
		private WebElement IdProofNo;
		
		public void sendIdProofNo(String idProofNo) {
			this.IdProofNo.sendKeys(idProofNo);
		}
		
		@FindBy(xpath = HomelessPersonsConstants.REMARKS)
		private WebElement Remarks;
		
		public void sendRemarks(String remarks) {
			this.Remarks.sendKeys(remarks);
		}

}

