package com.cgg.pages;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cgg.constants.SWHomeConstants;
import com.cgg.testcases.TestBase;
import com.cgg.util.AssertionsUtil;

public class SWHomePage extends TestBase{
	
	private WebDriver driver;
	
		public SWHomePage(WebDriver driver){
			this.driver=driver;
			PageFactory.initElements(driver, this);
		
		}
		
		@FindBy(name=SWHomeConstants.USERNAME)
		private WebElement EnterUserName;
		
		@FindBy(name=SWHomeConstants.PASSWORD)
		private WebElement EnterPassword;
		
		@FindBy(xpath=SWHomeConstants.GO)
		private WebElement ClickOnGO;
		
		public SWLoggedInPage swLogin(String uname,String Password){
			sendKeysToTextBox(this.EnterUserName,uname);
			sendKeysToTextBox(this.EnterPassword, Password);
			clickOnButton(this.ClickOnGO);
			return PageFactory.initElements(driver,SWLoggedInPage.class);
			
		}
		public boolean isHomePageOpened()
		{
			
			try {
				 AssertionsUtil.isElementPresent(this.EnterUserName);
			} catch(NoSuchElementException e) {
				return false;
			}
			return true;
		}


}
