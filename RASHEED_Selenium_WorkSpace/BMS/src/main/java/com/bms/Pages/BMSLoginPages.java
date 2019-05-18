package com.bms.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.bms.constants.BMSLoginConstant;
import com.bms.testcases.TestBase;

public class BMSLoginPages extends TestBase {
	public WebDriver driver;
	public BMSLoginPages(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath=BMSLoginConstant.UNAME)
	private WebElement Uname;
	@FindBy(xpath=BMSLoginConstant.PASSWORD)
	private WebElement Password;
	@FindBy(xpath=BMSLoginConstant.LOGINBUTTON)
	private WebElement LoginButton;
	
	public void Login(String uname,String pwd)
	{
		sendKeysToTextBox(Uname, uname);
		sendKeysToTextBox(Password, pwd);
		clickOnButton(LoginButton);
	}

}
