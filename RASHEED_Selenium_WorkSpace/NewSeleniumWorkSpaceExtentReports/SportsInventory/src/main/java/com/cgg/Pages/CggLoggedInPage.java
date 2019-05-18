package com.cgg.Pages;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cgg.testcases.TestBase;
import com.cgg.util.AssertionsUtil;
import com.cgg.util.WaitUtil;

public class CggLoggedInPage extends TestBase {
	
	private WebDriver driver;
	public CggLoggedInPage(WebDriver driver)
	{
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@id='zi_search_inputfield']")
	private WebElement LoggedInSearchBox;
	
	
	@FindBy(id="DWT29_dropdown")
	private WebElement CggLogout;
	
	
public boolean isCggLoggedInPageOpened(){
		
		try {
			 AssertionsUtil.isElementPresent(this.LoggedInSearchBox);
		} catch(NoSuchElementException e) {
			return false;
		}
		return true;
	}




public CggHomePage clickOnLogOut(String selectLogout)
{
	WaitUtil.waitForElementClickable(this.CggLogout);
select_Option_In_DropDown_ByVisibleText(this.CggLogout, selectLogout);
	
	return PageFactory.initElements(driver,CggHomePage.class);
}

}

