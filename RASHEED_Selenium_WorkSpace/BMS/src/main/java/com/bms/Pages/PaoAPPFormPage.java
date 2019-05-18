package com.bms.Pages;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.bms.testcases.TestBase;
import com.cgg.util.AssertionsUtil;
import com.cgg.util.FunctionUtil;

public class PaoAPPFormPage extends TestBase{
	private WebDriver driver;
	private int distTableRowSizeTotal=0;	
		public PaoAPPFormPage(WebDriver driver){
			this.driver=driver;
			PageFactory.initElements(driver, this);
		
		}
	@FindBy(xpath=".//*[@id='ctl00_ContentPlaceHolder1_txtsubject']")	
	private WebElement NameOfTheIssue;
	@FindBy(xpath=".//*[@id='ctl00_ContentPlaceHolder1_txtSDesc']")	
	private WebElement IssueDescription;
	@FindBy(xpath=".//*[@id='ctl00_ContentPlaceHolder1_ddlPriority']")	
	private WebElement SelectPriority ;
	
	@FindBy(xpath=".//*[@id='ctl00_ContentPlaceHolder1_btnSubmit']")	
	private WebElement Submit ;
	
	public void sendNameOfTheIssue(String sendNameOfTheIssue)
	{
	sendKeysToTextBox(this.NameOfTheIssue, sendNameOfTheIssue);
	}
	public void sendIssueDescription(String sendIssueDescription)
	{
	sendKeysToTextBox(this.IssueDescription, sendIssueDescription);
	}
	public void selectPriority(String selectPriority)
	{
		select_Option_In_DropDown_ByVisibleText(this.SelectPriority, selectPriority);
	}
	public boolean clickOnSubmit()
	{
		clickOnButton(this.Submit);
		return AssertionsUtil.isElementPresent(this.Submit);
	}
	public boolean isPaoSubmissionAlertisPresent()
	{
		try 
		{
			FunctionUtil.acceptAlertIfAvailable();
			return AssertionsUtil.isElementPresent(this.NameOfTheIssue);
		} catch (NoSuchElementException e) 
		{
			return false;
		}

	}
}
