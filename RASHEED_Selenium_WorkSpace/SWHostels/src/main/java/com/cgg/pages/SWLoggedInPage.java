package com.cgg.pages;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cgg.constants.SwLoggedInPageConstants;
import com.cgg.util.AssertionsUtil;

public class SWLoggedInPage {
	private WebDriver driver;
	public SWLoggedInPage(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath=SwLoggedInPageConstants.LOGOUT)
	private WebElement LogoutButton;
	
	
	public boolean isSWLoggedInPageOpened()
	{
		try {
			 AssertionsUtil.isElementPresent(this.LogoutButton);
		} catch(NoSuchElementException e) {
			return false;
		}
		return true;
		
	}
}
