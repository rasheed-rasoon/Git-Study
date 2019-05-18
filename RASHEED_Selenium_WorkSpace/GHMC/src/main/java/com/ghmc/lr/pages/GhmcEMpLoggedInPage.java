package com.ghmc.lr.pages;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import com.ghmc.lr.constants.GhmcEMpLoggedInPageConstants;
import com.ghmc.lr.testcases.TestBase;
import com.ghmc.lr.util.AssertionsUtil;
import com.ghmc.lr.util.WaitUtil;
import com.relevantcodes.extentreports.LogStatus;

public class GhmcEMpLoggedInPage extends TestBase {
	 private WebDriver driver;
	 public GhmcEMpLoggedInPage(WebDriver driver)
	 {
		this.driver=driver;
		PageFactory.initElements(driver,this);
		
	 }
@FindBy(xpath=GhmcEMpLoggedInPageConstants.LAYOUTREGULARALIZATIONLINK)
private WebElement LayOutRegularalizationLink;



@FindBy(id=GhmcEMpLoggedInPageConstants.CLICKONLOGOUT)
private WebElement ClickOnLogout;





public LRHomePage clickOnLayOutRegularalizationLink()
{
	WaitUtil.waitForElementClickable(this.LayOutRegularalizationLink);
this.LayOutRegularalizationLink.click();
test.log(LogStatus.INFO,"Clicked on layout regularalization link");
return PageFactory.initElements(driver,LRHomePage.class);

}

public GHMCEmpLoginPage clickOnLogout()
{
	WaitUtil.waitForElementClickable(this.ClickOnLogout);
this.ClickOnLogout.click();
test.log(LogStatus.INFO, "Clicked on Logout button");

return PageFactory.initElements(driver,GHMCEmpLoginPage.class);	
}

public boolean isGhmcEMpLoggedInPageOpened()
{
	try {
		//test.log(LogStatus.INFO, "Clicked on Logout button");
		return AssertionsUtil.isElementPresent(this.LayOutRegularalizationLink);
	} catch (NoSuchElementException e) {
		return false;
	}

}

}
