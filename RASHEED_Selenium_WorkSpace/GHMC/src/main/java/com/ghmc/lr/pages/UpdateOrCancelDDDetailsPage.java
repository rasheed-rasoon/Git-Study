package com.ghmc.lr.pages;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.ghmc.lr.constants.UpdateOrCancelDDDetailsPageConstants;
import com.ghmc.lr.testcases.TestBase;
import com.ghmc.lr.util.AssertionsUtil;
import com.ghmc.lr.util.FunctionUtil;
import com.ghmc.lr.util.WaitUtil;
import com.relevantcodes.extentreports.LogStatus;

public class UpdateOrCancelDDDetailsPage extends TestBase {
	private WebDriver driver;
	public UpdateOrCancelDDDetailsPage(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath=UpdateOrCancelDDDetailsPageConstants.SELECTUPDATECHECKBOX)
	private WebElement SelectUpdateCheckBox;
	@FindBy(id=UpdateOrCancelDDDetailsPageConstants.SELECTCANCELCHECKBOX)
	private WebElement SelectCancelCheckBox;
	@FindBy(xpath=UpdateOrCancelDDDetailsPageConstants.SENDAPPLICATIONNUMBER)
	private WebElement SendApplicationNumber;
	
	@FindBy(id=UpdateOrCancelDDDetailsPageConstants.SENDRECEIPTNUMBER)
	private WebElement SendReceiptNumber;
	
	@FindBy(xpath=UpdateOrCancelDDDetailsPageConstants.CLICKONGETDATA)
	private WebElement ClickOnGetData;
	
	@FindBy(xpath=UpdateOrCancelDDDetailsPageConstants.SENDAPPNUMBERTOCANCELDDDETAILS)
	private WebElement SendApplicationNumbertToCancelDDDetails;
	
	@FindBy(xpath=UpdateOrCancelDDDetailsPageConstants.SENDRECEIPTNUMBERTOCANCELDETAILS)
	private WebElement SendReceiptNumberToCacnelDDDetails;
	
	@FindBy(xpath=UpdateOrCancelDDDetailsPageConstants.SENDREMARKSTOCANCELDDDETAILS)
	private WebElement SendRemerksToCancelData;
	
	@FindBy(xpath=UpdateOrCancelDDDetailsPageConstants.CLICKCANCELDATA)
	private WebElement ClickCancelData;
	
	public void selectUpdateCheckBox()
	{
		WaitUtil.waitForElementClickable(this.SelectUpdateCheckBox);
		clickOnButton(this.SelectUpdateCheckBox);
		test.log(LogStatus.INFO,"Selected the check box as update");
		WaitUtil.waitForElementVisible(this.SendApplicationNumber);
	}
	public void cancelDDdetails(String AppNumber,String ReceiptNum,String Remarks)
	{
		WaitUtil.waitForElementClickable(this.SelectUpdateCheckBox);
		clickOnButton(this.SelectCancelCheckBox);
		test.log(LogStatus.INFO,"Selected the check box as Cancel");
		
		sendKeysToTextBox(this.SendApplicationNumbertToCancelDDDetails, AppNumber);
		test.log(LogStatus.INFO,"Application numbber entered");
		
		sendKeysToTextBox(this.SendReceiptNumber, ReceiptNum);
		test.log(LogStatus.INFO,"Receipt number entered");
		
		sendKeysToTextBox(this.SendRemerksToCancelData, Remarks);
		test.log(LogStatus.INFO,"Remarks entered");
		WaitUtil.waitForElementClickable(this.ClickCancelData);
		this.ClickCancelData.click();
	   //clickOnButton(this.ClickCancelData);
		test.log(LogStatus.INFO,"click on the button cancel and waiting for alert ");
	test.log(LogStatus.INFO,"alert text is "+FunctionUtil.alertText());
		FunctionUtil.acceptAlertIfAvailable();
	
	}
	

	
	public UpdateApplicantDDDetailsPage getDataToUpdate(String appNum,String recptNum)
	{
		//WaitUtil.waitForElementClickable(this.SendApplicationNumber);
		sendKeysToTextBox(this.SendApplicationNumber, appNum);	
		test.log(LogStatus.INFO,"Application number entered");
		sendKeysToTextBox(this.SendReceiptNumber, recptNum);
		test.log(LogStatus.INFO,"Receipt number entered");
		WaitUtil.waitForElementClickable(this.ClickOnGetData);
		this.ClickOnGetData.click();
		test.log(LogStatus.INFO,"clicked on GET DATA");
		Assert.assertEquals(true, isUpdateOrCancelDDDetailsPage());
		return PageFactory.initElements(driver,UpdateApplicantDDDetailsPage.class);
	}
	
	public boolean isUpdateOrCancelDDDetailsPage()
	{
		try {
			return AssertionsUtil.isElementPresent(this.SelectUpdateCheckBox);
		} catch (NoSuchElementException e) {
			return false;
		}	
		
		
	}
}
