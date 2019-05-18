package com.cgg.Pages;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cgg.constants.AmendmentOfLicenceReplyTOQueryPageConstatns;
import com.cgg.constants.GHMCTeamLoginConstants;
import com.cgg.testcases.TestBase;
import com.cgg.util.AssertionsUtil;

public class GHMCTEAMLoginPage extends TestBase{
	
	private WebDriver driver;

	public GHMCTEAMLoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(id=GHMCTeamLoginConstants.USERNAME)
	private WebElement enterUserName;
	
	@FindBy(id=GHMCTeamLoginConstants.PASSWORD)
	private WebElement enterPassword;
	
	@FindBy(xpath=GHMCTeamLoginConstants.LOGOUT)
	private WebElement logOut;
	
	public boolean isGHMCTEAMLoggedinPageOpened() {
		try {
			APP_LOGS.info("going to check whether Reply to query page opened or not  ");
			return AssertionsUtil.isElementPresent(this.logOut);
		} catch (NoSuchElementException e) {
			return false;
		}

	}
	
	
	
	
	

}
