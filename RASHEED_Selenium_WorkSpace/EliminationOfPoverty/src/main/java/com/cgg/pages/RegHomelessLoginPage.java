package com.cgg.pages;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cgg.constants.HomelessPersonsConstants;
import com.cgg.util.AssertionsUtil;

public class RegHomelessLoginPage {
	private WebDriver driver;

	public RegHomelessLoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(name = HomelessPersonsConstants.UNAME)
	private WebElement UserLogin;
	@FindBy(name=HomelessPersonsConstants.PASSWORD)
	private WebElement Password;
	
	@FindBy(name=HomelessPersonsConstants.LOGINBUTTON)
	private WebElement LoginButton;
	public HomeLessRecordsPage HomeLessLogin(String username,String pwd)
	{
		this.UserLogin.sendKeys(username);
		this.Password.sendKeys(pwd);
		this.LoginButton.click();
		return PageFactory.initElements(driver, HomeLessRecordsPage.class);
	}
	
	
	
	

	
	
	public boolean isEliminatonPovertyHomePageOpened(){
		
		try {
			 AssertionsUtil.isElementPresent(this.LoginButton);
		} catch(NoSuchElementException e) {
			return false;
		}
		return true;
	}
}
