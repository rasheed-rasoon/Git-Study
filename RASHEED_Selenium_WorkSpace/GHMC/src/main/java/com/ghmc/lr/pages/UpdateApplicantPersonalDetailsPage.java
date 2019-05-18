package com.ghmc.lr.pages;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.ghmc.lr.constants.UpdateApplicantPersonalDetailsConstants;
import com.ghmc.lr.testcases.TestBase;
import com.ghmc.lr.util.AssertionsUtil;
import com.relevantcodes.extentreports.LogStatus;

public class UpdateApplicantPersonalDetailsPage extends TestBase {
	private WebDriver driver;
	
	public UpdateApplicantPersonalDetailsPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath=UpdateApplicantPersonalDetailsConstants.APPLICATIONNUMBER)
	private WebElement ApplicationNumber;
	
	@FindBy(xpath=UpdateApplicantPersonalDetailsConstants.CLICKONSUBMUTBUTTON)
	private WebElement ClickOnSubmit;
	
	public void sendApplicationNumber(String ApplicationNumber)
	{
	sendKeysToTextBox(this.ApplicationNumber,ApplicationNumber);	
	test.log(LogStatus.INFO,"Application number entered");
	}
	
	public void clickOnSubmit()
	{
		clickOnButton(this.ClickOnSubmit);
		test.log(LogStatus.INFO,"clicked on submit");
		Assert.assertEquals(true, isUpdateApplicantPersonalDetailsPageOpened());
	}
	
	
	public boolean isUpdateApplicantPersonalDetailsPageOpened()
	{
		try {
			return AssertionsUtil.isElementPresent(this.ClickOnSubmit);
		} catch (NoSuchElementException e) {
			return false;
		}

}
}
