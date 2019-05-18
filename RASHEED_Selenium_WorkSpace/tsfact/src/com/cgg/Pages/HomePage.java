package com.cgg.Pages;

import java.util.List;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.cgg.constants.HomePageConstant;
import com.cgg.testcases.TestBase;
import com.cgg.util.AssertionsUtil;
import com.cgg.util.WaitUtil;


public class HomePage extends TestBase {
	
	private WebDriver driver;
	
	public HomePage(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath=HomePageConstant.REGESTEREDUSERLOGIN)
	private WebElement RegUserLogin;
	
	@FindBy(xpath=".//*[@id='userName']")
	private WebElement UserName;
	
	@FindBy(xpath=".//*[@id='password']")
	private WebElement PassWord;
	
	
	@FindBy(xpath="//input[@id='login']")
	private WebElement Login_Button;
	
	@FindBy(xpath="//input[@id='login']")
	private List<WebElement> Login_Buttn;
	
	@FindBy(xpath=HomePageConstant.NEWUSERREGISTRATION)
	private WebElement NewUSerRegistration;
	
	
	public boolean isHomePageOpened(){
		try {
			 AssertionsUtil.isElementPresent(this.RegUserLogin);
		} catch (NoSuchElementException e) {
			return false;
		}
		return true;
	}
	
	
	
	public EntreprenuerLoggedinPage Entreprenuerlogin(String uname, String pwd){
		WaitUtil.waitForElementClickable(RegUserLogin);
		
		RegUserLogin.click();
		APP_LOGS.info("clicked on Register Log in");
		this.UserName.sendKeys(uname);
		APP_LOGS.info("entreprenuer user name entered");
		this.PassWord.sendKeys(pwd);
		APP_LOGS.info("entreprenuer password entered");
		this.Login_Button.click();
		APP_LOGS.info("clicked on entreprenuer Log in button and navigated to log in page");
		return PageFactory.initElements(driver, EntreprenuerLoggedinPage.class);	
	}
	public OfficerLoggedinPage officerlogin(String uname, String pwd){

		RegUserLogin.click();
		APP_LOGS.info("clicked on Register Log in");
		this.UserName.sendKeys(uname);
		APP_LOGS.info("user name entered");
		this.PassWord.sendKeys(pwd);
		APP_LOGS.info("password entered");
		this.Login_Button.click();
		APP_LOGS.info("clicked on officer Log in button");
		return PageFactory.initElements(driver, OfficerLoggedinPage.class);	
	}
	
	public void clickOnNewUserregistration(){
		WaitUtil.waitForElementClickable(NewUSerRegistration);
this.NewUSerRegistration.click();
			
	}
	

	

}


