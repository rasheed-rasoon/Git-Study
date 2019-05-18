package com.cgg.Pages;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cgg.constants.CGGHomePageConstants;
import com.cgg.testcases.TestBase;
import com.cgg.util.AssertionsUtil;
import com.cgg.util.FunctionUtil;
import com.cgg.util.WaitUtil;

public class CggHomePage extends TestBase {
	private WebDriver driver;
	
	public CggHomePage(WebDriver driver){
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id=CGGHomePageConstants.USENAME)
	private WebElement UserName;
	
	@FindBy(id=CGGHomePageConstants.PASSWORD)
	private WebElement Password;
	@FindBy(xpath=CGGHomePageConstants.LOGINBUTTON)
	private WebElement LoginButton;
	
	public boolean isCggHomePageOpened(){
		
		try {
			 AssertionsUtil.isElementPresent(this.LoginButton);
		} catch(NoSuchElementException e) {
			return false;
		}
		return true;
	}
	
	
	public CggLoggedInPage cggLogin(String uname, String pwd) throws Exception{
		//WaitUtil.waitForElementClickable(this.LoginButton);
		sendKeysToTextBox(UserName, uname);
		APP_LOGS.info(" user name entered");
		sendKeysToTextBox(this.Password,pwd);
		APP_LOGS.info("passowrd entered");
		FunctionUtil.safeJavaScriptClick(this.LoginButton);
		//clickOnButton(this.LoginButton);
		
	
		return PageFactory.initElements(driver, CggLoggedInPage.class);	
	}
	
	
}
