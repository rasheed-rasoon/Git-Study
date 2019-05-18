package com.cgg.testcases;

import java.util.Hashtable;
import org.openqa.selenium.support.PageFactory;
import org.testng.SkipException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.cgg.Pages.HomePage;
import com.cgg.Pages.LoggedInPage;
import com.cgg.util.TestUtil;
import com.relevantcodes.extentreports.LogStatus;

public class LoggedInPageTest extends TestBase{
@Test(dataProvider="getData")
	
	public void addStock(Hashtable <String,String>data) throws Exception{
		test=report.startTest("Testing Add stock functionality");
		

		if(!TestUtil.isExecutable(this.getClass().getSimpleName(), xls)|| data.get("Runmode").equalsIgnoreCase("N"))
			throw new SkipException("Skipping the Test Case Number");

		driver.get("testghmc.cgg.gov.in/Sports_Inventory");
		test.log(LogStatus.INFO,"navigated to url");

		HomePage home=PageFactory.initElements(driver,HomePage.class);
		test.log(LogStatus.INFO, "Going to login");
		LoggedInPage	lp= home.Inventorylogin("9866752267","123");

		lp.StrockRequest(data.get("selectSportsComplex"), data.get("selectCategory"), data.get("selectSubCategory"), data.get("selectItem"), data.get("sendtItemCode"), data.get("SendQuantity"));
		if(data.get("DataFlag").equalsIgnoreCase("P") && !lp.isStockAdded()){
			reportFail("unable to add stock with valid data");
		}
		else 
			
			if(data.get("DataFlag").equalsIgnoreCase("N") &&lp.isStockAdded()){
			reportFail("stock added  with invalid data");
		}
			else{
				reportpass("Stock added succesfully");
			}

	}




	@DataProvider
	public Object[][] getData(){
		return TestUtil.getData(this.getClass().getSimpleName(),xls);
	}

	
	
	
	
	
	
	
}
