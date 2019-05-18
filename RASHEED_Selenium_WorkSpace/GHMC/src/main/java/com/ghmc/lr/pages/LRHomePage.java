package com.ghmc.lr.pages;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ghmc.lr.constants.LrHomePageConstants;
import com.ghmc.lr.testcases.TestBase;
import com.ghmc.lr.util.AssertionsUtil;
import com.ghmc.lr.util.FunctionUtil;
import com.ghmc.lr.util.WaitUtil;
import com.relevantcodes.extentreports.LogStatus;

public class LRHomePage extends TestBase {
	private WebDriver driver;
	public LRHomePage(WebDriver driver)
	{
	this.driver=driver;
	PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath=LrHomePageConstants.TRANSACTIONTAB)
	private WebElement TransactionsTab;
	
	@FindBy(xpath=LrHomePageConstants.UPDATEDDDETAILSLINK)
	private WebElement ClickOnUpdateDDDetails;
	
	@FindBy(xpath=LrHomePageConstants.UPDATEAPPLICANTPERSONALDETAILSLINK)
	private WebElement CLickOnUpdateApplicantDetails;
	
	public void mouseHoverOnTransactionsTab()
	{
		WaitUtil.waitForElementClickable(this.TransactionsTab);
		test.log(LogStatus.INFO,"Going to mouse hover on Transactions Tab");
		FunctionUtil.moveMouseToElement(this.TransactionsTab);
		
	}
	public UpdateOrCancelDDDetailsPage clickUpdateDDDetails()
	{

		this.ClickOnUpdateDDDetails.click();
		test.log(LogStatus.INFO,"Clicked on the link update Dd details link");
		return PageFactory.initElements(driver,UpdateOrCancelDDDetailsPage.class);
	}
	public UpdateApplicantPersonalDetailsPage clickOnUpdateAppPersonalDetails()
	{
		this.CLickOnUpdateApplicantDetails.click();
		test.log(LogStatus.INFO,"click on Update Applicant details link ");
		return PageFactory.initElements(driver,UpdateApplicantPersonalDetailsPage.class);
	}

	
	public boolean isLRHomePageOpened()
	{
		try {
			return AssertionsUtil.isElementPresent(this.TransactionsTab);
		} catch (NoSuchElementException e) {
			return false;
		}

	}

}
