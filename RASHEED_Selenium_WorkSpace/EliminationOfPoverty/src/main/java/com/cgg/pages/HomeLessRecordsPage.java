package com.cgg.pages;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cgg.util.AssertionsUtil;
import com.cgg.util.WaitUtil;

public class HomeLessRecordsPage {
	private WebDriver driver;

	public HomeLessRecordsPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="html/body/center/table/tbody/tr/td/table/tbody/tr[3]/td/form/center/font")
	private WebElement RecordSuccessMessage;
	
	public boolean isRecorSuccessMessageDisplayed()
	{
		try {
			 AssertionsUtil.isElementPresent(this.RecordSuccessMessage);
		} catch(NoSuchElementException e) {
			return false;
		}
		return true;
	}
	
	@FindBy(xpath="html/body/center/table/tbody/tr/td/table/tbody/tr[3]/td/form/table/tbody/tr[2]/td/table/tbody/tr[2]/td/input")
	private WebElement AddRecordButton;
	public HomelessPersonsAppFormPagePage clickOnAddRecord()
	{
		WaitUtil.waitForElementClickable(this.AddRecordButton);
		this.AddRecordButton.click();
		return PageFactory.initElements(driver, HomelessPersonsAppFormPagePage.class);
	}
	
}

