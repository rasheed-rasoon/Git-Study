package com.ghmc.lr.pages;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.ghmc.lr.constants.GHMCEmpLoginPageConstants;
import com.ghmc.lr.testcases.TestBase;
import com.ghmc.lr.util.AssertionsUtil;
import com.ghmc.lr.util.FunctionUtil;
import com.ghmc.lr.util.WaitUtil;
import com.relevantcodes.extentreports.LogStatus;

public class GHMCEmpLoginPage extends TestBase{
	
	
	private WebDriver driver;
	public GHMCEmpLoginPage(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	
	}
	
	@FindBy(id=GHMCEmpLoginPageConstants.MOBILENUMBER)
	private WebElement SendMobileNumber;
	
	@FindBy(id=GHMCEmpLoginPageConstants.PASSWORD)
	private WebElement SendPassword;
	
	@FindBy(id=GHMCEmpLoginPageConstants.LOGINBUTTON)
	private WebElement ClickLoginButton;
	
	@FindBy(id=GHMCEmpLoginPageConstants.GHMCEMPLOGINLINK)
private WebElement clickOnGhmcEmpLogin;
	
	@FindBy(id=GHMCEmpLoginPageConstants.GHMCCITIZENLOGINID)
private WebElement GhmcCitigenId;
	
	 public GhmcEMpLoggedInPage ghmcEmpLogin(String mobilenumber, String Password)
	 {
			
			this.SendMobileNumber.sendKeys(mobilenumber);
			test.log(LogStatus.INFO,"Mobile number entered");
			this.SendPassword.sendKeys(Password);
			test.log(LogStatus.INFO,"Password entered");
			 this.ClickLoginButton.click();
			 test.log(LogStatus.INFO,"clicked on login button");
			 FunctionUtil.acceptAlertIfAvailable();
			 Assert.assertEquals(true,isghmcEmpLoginPageOpened());
			return PageFactory.initElements(driver, GhmcEMpLoggedInPage.class);	
		}
	 public boolean isghmcEmpLoginPageOpened()
	 {
		 try {
				return AssertionsUtil.isElementPresent(this.SendMobileNumber);
			} catch (NoSuchElementException e) {
				return false;
			}
	 }
	 
	 

}
