package com.ghmc.lr.pages;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.ghmc.lr.constants.UpdateApplicantDDDetailsConstants;
import com.ghmc.lr.testcases.TestBase;
import com.ghmc.lr.util.AssertionsUtil;
import com.ghmc.lr.util.FunctionUtil;
import com.ghmc.lr.util.WaitUtil;
import com.relevantcodes.extentreports.LogStatus;

public class UpdateApplicantDDDetailsPage extends TestBase {
	private WebDriver driver;
		{
		this.driver=driver;
		PageFactory.initElements(driver,this);
		}
		@FindBy(xpath=UpdateApplicantDDDetailsConstants.SENDAPPLICATIONNO)
		private WebElement SendApplicationNumber;
		
		@FindBy(xpath=UpdateApplicantDDDetailsConstants.SENDRECEIPTNO)
		private WebElement SendReceiptNumber;
		
		@FindBy(xpath=UpdateApplicantDDDetailsConstants.SENDDDNO)
		private WebElement SendDDNumber;
		
		@FindBy(xpath=UpdateApplicantDDDetailsConstants.SELCECTDDDATE)
		private WebElement SelectDDDate;
		
		@FindBy(xpath=UpdateApplicantDDDetailsConstants.SENDDDAMOUNT)
		private WebElement SendAmount;
		
		@FindBy(xpath=UpdateApplicantDDDetailsConstants.SENDREMARKS)
		private WebElement SendRemarks;
		
		
		@FindBy(xpath=UpdateApplicantDDDetailsConstants.CLICKONUPDTE)
		private WebElement ClickOnUpdate;
		
		
		
		public void updateApplicantDDDetails(String ddNumber,String amount,String sendRemarks)
		{
		sendKeysToTextBox(this.SendDDNumber, ddNumber);
		test.log(LogStatus.INFO,"Dd number entered");
		sendKeysToTextBox(this.SendAmount, amount);
		test.log(LogStatus.INFO,"Amount entered");
		WaitUtil.waitForElementClickable(this.SendRemarks);
		sendKeysToTextBox(this.SendRemarks, sendRemarks);
		test.log(LogStatus.INFO,"Remarks entered");
		this.ClickOnUpdate.click();
		test.log(LogStatus.INFO,"Clicked on the update button and waiting for an alert");
	
		FunctionUtil.acceptAlertIfAvailable();
		
		}
//		
//		public void CancelDDDetails()
//		{
//			
//			
//		}
//		
		
		public boolean isupdateApplicantDDDetailsOpened()
		{
			try {
				return AssertionsUtil.isElementPresent(this.ClickOnUpdate);
			} catch (NoSuchElementException e) {
				return false;
			}
			
			
		}

}
