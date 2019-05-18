package com.cgg.Pages;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cgg.constants.LoggedInPageConstants;
import com.cgg.testcases.TestBase;
import com.cgg.util.AssertionsUtil;
import com.cgg.util.WaitUtil;

public class LoggedInPage extends TestBase{
private WebDriver driver;
	
	public LoggedInPage(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(linkText=LoggedInPageConstants.STOCKREQUESTBYGI)
	private WebElement StockRequestByGI;
	
	
	@FindBy(id=LoggedInPageConstants.SPORTSCOMPLEX)
	private WebElement SportsComplex;
	
	
	@FindBy(id=LoggedInPageConstants.CATEGORY)
	private WebElement Category;
	
	@FindBy(id=LoggedInPageConstants.SUBCATEGORY)
	private WebElement SubCategory;
	
	@FindBy(id=LoggedInPageConstants.ITEM)
	private WebElement Item;
	
	@FindBy(id=LoggedInPageConstants.ITEMCODE)
	private WebElement ItemCode;
	@FindBy(id=LoggedInPageConstants.QUANTITY)
	private WebElement Quantity;
	
	@FindBy(id=LoggedInPageConstants.ADDDETAILS)
			
	private WebElement AddDetaila;
	
	@FindBy(id=LoggedInPageConstants.REQUESTSTOCK)
	
	private WebElement RequestStock;
	
	@FindBy(xpath=LoggedInPageConstants.OFFICERNAME)
	private WebElement OfficerName;
	
	@FindBy(xpath=LoggedInPageConstants.LOGOUT)
	private WebElement LogOut;
	
	
public boolean isLoggedInPageOpened(){
		
		try {
			 AssertionsUtil.isElementPresent(this.StockRequestByGI);
		} catch(NoSuchElementException e) {
			return false;
		}
		return true;
	}


public boolean isStockAdded(){
	
	try {
		 AssertionsUtil.isElementPresent(this.RequestStock);
	} catch(NoSuchElementException e) {
		return false;
	}
	return true;
}


public LoggedInPage StrockRequest(String selectSportsComplex,String selectCategory,String selectSubCategory,String selectItem,String sendtItemCode,String SendQuantity){
	//WaitUtil.waitForElementClickable();\
	clickOnButton(this.StockRequestByGI);
	select_Option_In_DropDown_ByVisibleText(this.SportsComplex, selectSportsComplex);
	WaitUtil.waitForElementClickable(this.Category);
	select_Option_In_DropDown_ByVisibleText(this.Category,selectCategory);
	WaitUtil.waitForElementClickable(this.SubCategory);
	select_Option_In_DropDown_ByVisibleText(this.SubCategory, selectSubCategory);
	WaitUtil.waitForElementClickable(this.Item);
	select_Option_In_DropDown_ByVisibleText(this.Item, selectItem);
	sendKeysToTextBox(this.ItemCode,sendtItemCode);
	sendKeysToTextBox(this.Quantity,SendQuantity);
	clickOnButton(this.AddDetaila);
	return PageFactory.initElements(driver, LoggedInPage.class);	
}

public void logOut()
{
	
clickOnButton(this.OfficerName);
clickOnButton(this.LogOut);
}

	
}
