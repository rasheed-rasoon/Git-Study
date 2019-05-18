package com.cgg.Pages;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.UnexpectedAlertBehaviour;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.cgg.constants.HomePageConstant;
import com.cgg.testcases.TestBase;
import com.cgg.util.AssertionsUtil;
import com.cgg.util.FunctionUtil;


public class HomePage extends TestBase {
	
	private WebDriver driver;
	
	public HomePage(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(id=HomePageConstant.USERNAME)
	private WebElement UserName;
	
	@FindBy(id=HomePageConstant.PASSWORD)
	private WebElement PassWord;
	
	@FindBy(xpath=HomePageConstant.LOGINBUTTON)
	private WebElement LoginButton;
	

	public boolean isHomePageOpened(){
		
		try {
			 AssertionsUtil.isElementPresent(this.LoginButton);
		} catch(NoSuchElementException e) {
			return false;
		}
		return true;
	}
	
	
	
	public LoggedInPage Inventorylogin(String uname, String pwd) throws Exception{
		//WaitUtil.waitForElementClickable();
		sendKeysToTextBox(this.UserName,uname);
		FunctionUtil.acceptAlertIfAvailable();
		APP_LOGS.info(" user name entered");
		sendKeysToTextBox(this.PassWord, pwd);
		APP_LOGS.info(" password entered");
		//clickOnButton(this.LoginButton);
		FunctionUtil.safeJavaScriptClick(this.LoginButton);
		APP_LOGS.info("clicked on  Log in button");
		FunctionUtil.acceptAlertIfAvailable();
		DesiredCapabilities browser = DesiredCapabilities.firefox();
		browser.setCapability(CapabilityType.UNEXPECTED_ALERT_BEHAVIOUR, UnexpectedAlertBehaviour.ACCEPT);
		return PageFactory.initElements(driver, LoggedInPage.class);	
	}
	

			
	}
	

	




