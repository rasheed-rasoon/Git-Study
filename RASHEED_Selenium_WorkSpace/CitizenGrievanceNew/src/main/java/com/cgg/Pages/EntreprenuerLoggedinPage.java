package com.cgg.Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.cgg.testcases.TestBase;
import com.cgg.util.AssertionsUtil;
import com.cgg.util.FunctionUtil;
import com.cgg.util.WaitUtil;

public class EntreprenuerLoggedinPage extends TestBase {
	private WebDriver driver;
	public static String appNumber=null;
	public static String PlanhorsPower=null;
	public EntreprenuerLoggedinPage(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	
	}
	
	@FindBy(xpath=".//*[@id='lnk6']")
	private WebElement DoEntreprenuerLogout;
	
	@FindBy(id="lnk1")
	private WebElement Services;
	
	@FindBy(xpath=".//*[@id='lnk15']")
	private WebElement ClickOnTransferOfLIcence;
	
	
	@FindBy(xpath=".//*[@id='collapseOne3']/div/table/tbody/tr/td/a")
	private WebElement ClickOnContinueTransferOfLicence;
	
	@FindBy(xpath="html/body/div[1]/div[2]/center/table")
	private WebElement EntreprenuerPlanOfApprovalWebTable;
	
	@FindBy(xpath="html/body/div[1]/div[2]/center/table/tbody/tr[3]/td/table")
	private WebElement EntreprenuerRegistrationAndGrantOfLicenceWebTable;
	
	@FindBy(xpath="html/body/div[1]/div[2]/center/table/tbody/tr[4]/td/table")
	private WebElement EntreprenuerAmendmentOfLicenceWebTable;
	
	@FindBy(xpath="html/body/div[1]/div[2]/center/table/tbody/tr[5]/td/table")
	private WebElement EntreprenuerTransferOfLicenceWebTable;
	
	public HomePage doEntreprenuerLogout()
	{
		this.DoEntreprenuerLogout.click();
		APP_LOGS.info("clicked on logout button back to home page");
		return PageFactory.initElements(driver, HomePage.class);
		
	}
	
	public boolean isEntreprenuerLoggedInPageOpened(){
		try {
			 AssertionsUtil.isElementPresent(this.DoEntreprenuerLogout);
		} catch (NoSuchElementException e) {
			return false;
		}
		return true;
	}


	
	public RegAndLicenceAppForm clickOnRegGrantOfLicence()
	{
		driver.navigate().to("http://test.cgg.gov.in:8083/tsfactories/newfactoryregistration.do");
		APP_LOGS.info("Navigated to Registration and Grant OF Licence Form Page");
		return PageFactory.initElements(driver,RegAndLicenceAppForm.class);
		
	}
	
	public PlanOfAppappFormPage clickOnPlanOfApproval()
	{
		driver.navigate().to("http://test.cgg.gov.in:8083/tsfactories/newForm1.do");
		
		return PageFactory.initElements(driver,PlanOfAppappFormPage.class);
		
	}
	public AmendmentOfLicenseFormPage clickOnAmendmentOfLicense()
	{
		driver.navigate().to("http://test.cgg.gov.in:8083/tsfactories/Form2.do");
		return PageFactory.initElements(driver,AmendmentOfLicenseFormPage.class);
		
	}
	public TransferOfLicensePages clickOnTransferOfLicense()
	{
//		//WaitUtil.waitForElementClickable(this.Services);
//		WaitUtil.waitForElementVisible(this.Services);
//		FunctionUtil.moveMouseToElement(this.Services);
//		WaitUtil.waitForElementClickable(this.ClickOnTransferOfLIcence);
//		this.ClickOnTransferOfLIcence.click();
		driver.navigate().to("http://test.cgg.gov.in:8083/tsfactories/Form2a.do");
		this.ClickOnContinueTransferOfLicence.click();
		return PageFactory.initElements(driver,TransferOfLicensePages.class);
		
	}
	
	
	public void getApNumPlanOfApprovalEntreprenuerLogin()
	{
		List<WebElement> rows=EntreprenuerPlanOfApprovalWebTable.findElements(By.tagName("tr"));
		outerloop:
			for(int i=0;i<rows.size();i++)
			{
				//APP_LOGS.info("going to "+i+" row ");
				List<WebElement> cells=rows.get(i).findElements(By.tagName("td"));
				for(int j=0;j<cells.size();j++)
				{
					
					//APP_LOGS.info("going to "+j+" cell and validating whether for this application already done payment part and is it under prescrutiny pending  ");
					if(cells.get(j).getText().equals("Payment Done")&&cells.get(j+1).getText().equals("Pre-Scrutiny-Pending"))
					{
						appNumber=cells.get(j-3).getText();
					APP_LOGS.info("The newly updated application number is "+this.appNumber);
					this.doEntreprenuerLogout();
					break outerloop;   
					
					}
					
				}
			}
		
	}
	public void getApNumGrantOfLicenceEntreprenuerLogin()
	{
		List<WebElement> rows=EntreprenuerRegistrationAndGrantOfLicenceWebTable.findElements(By.tagName("tr"));
		outerloop:
			for(int i=0;i<rows.size();i++)
			{
				//APP_LOGS.info("going to "+i+" row ");
				List<WebElement> cells=rows.get(i).findElements(By.tagName("td"));
				for(int j=0;j<cells.size();j++)
				{
					//APP_LOGS.info("going to "+j+" cell and validating whether for this application already done payment part and is it under prescrutiny pending  ");
					if(cells.get(j).getText().equals("Payment Done")&&cells.get(j+1).getText().equals("Pre-Scrutiny-Pending"))
					{
					appNumber=cells.get(j-2).getText();
					APP_LOGS.info("The newly updated application number is "+this.appNumber);
					//AssertionsUtil.verifytext(this.appNumber, null);
					this.doEntreprenuerLogout();
					break outerloop;   
					
					}
				}
			}
		
	}
	public void getAppNumAmendmentOFLicence()
	{
		List<WebElement> rows=EntreprenuerAmendmentOfLicenceWebTable.findElements(By.tagName("tr"));
		outerloop:
			for(int i=0;i<rows.size();i++)
			{
				//APP_LOGS.info("going to "+i+" row ");
				List<WebElement> cells=rows.get(i).findElements(By.tagName("td"));
				for(int j=0;j<cells.size();j++)
				{
					//APP_LOGS.info("going to "+j+" cell and validating whether for this application already done payment part and is it under prescrutiny pending  ");
					if(cells.get(j).getText().equals("Payment Done")&&cells.get(j+1).getText().equals("Pre-Scrutiny-Pending"))
					{
					appNumber=cells.get(j-2).getText();
					APP_LOGS.info("The newly updated application number is "+this.appNumber);
					//AssertionsUtil.verifytext(this.appNumber, null);
					this.doEntreprenuerLogout();
					break outerloop;   
					
					}
				}
			}
		
	}
	public void getApNumTransferOfLicenceEntreprenuerLogin()
	{
		List<WebElement> rows=EntreprenuerTransferOfLicenceWebTable.findElements(By.tagName("tr"));
		outerloop:
			for(int i=0;i<rows.size();i++)
			{
				//APP_LOGS.info("going to "+i+" row ");
				List<WebElement> cells=rows.get(i).findElements(By.tagName("td"));
				for(int j=0;j<cells.size();j++)
				{
					if(cells.get(j).getText().equals("Payment Done")&&cells.get(j+1).getText().equals("Pre-Scrutiny-Pending"))
					{
					appNumber=cells.get(j-2).getText();
					APP_LOGS.info("The newly updated application number is "+this.appNumber);
					//AssertionsUtil.verifytext(this.appNumber, null);
					this.doEntreprenuerLogout();
					break outerloop;   
					
					}
				}
			}
	}
		
	public PlanOfAppReplyToQueryFormPage planOfApprovalclickReplyToQuery(String appnum)
	{
		List<WebElement> rows=EntreprenuerPlanOfApprovalWebTable.findElements(By.tagName("tr"));
		outerloop:
			for(int i=0;i<rows.size();i++)
			{
				List<WebElement> cells=rows.get(i).findElements(By.tagName("td"));
				for(int j=0;j<cells.size();j++)
				{
					if(cells.get(j).getText().equals("Payment Done")&&cells.get(j+1).getText().equals("Awaiting Query Response"))
					{
						driver.findElement(By.cssSelector("button[onclick*='"+appnum+"'][class='btn btn-success']")).click();	
						AssertionsUtil.verifyisAlertPresent();
					//doLogout();
					break outerloop;               
					}
				}
			}
		return PageFactory.initElements(driver,PlanOfAppReplyToQueryFormPage.class);
		
	}
	public RegAndLicenceReplyToQueryPage regAndLicenceclickReplyToQuery(String appnum)
	{
		List<WebElement> rows=EntreprenuerRegistrationAndGrantOfLicenceWebTable.findElements(By.tagName("tr"));
		outerloop:
			for(int i=0;i<rows.size();i++)
			{
				List<WebElement> cells=rows.get(i).findElements(By.tagName("td"));
				for(int j=0;j<cells.size();j++)
				{
					if(cells.get(j).getText().equals("Payment Done")&&cells.get(j+1).getText().equals("Awaiting Query Response"))
					{
						APP_LOGS.info("going to click on Reply to Query");
						driver.findElement(By.cssSelector("button[onclick*='"+appnum+"'][class='btn btn-success']")).click();	
					//doLogout();
					break outerloop;               
					}
					else{
						APP_LOGS.info("no application  number is there to process reply to Query ");
					}
				}
			}
		return PageFactory.initElements(driver,RegAndLicenceReplyToQueryPage.class);
		
	}
	public AmendmentOfLicenceReplyToQueryPage amendmentReplyToQuery(String appnum)
	{List<WebElement> rows=EntreprenuerAmendmentOfLicenceWebTable.findElements(By.tagName("tr"));
	outerloop:
		for(int i=0;i<rows.size();i++)
		{
			List<WebElement> cells=rows.get(i).findElements(By.tagName("td"));
			for(int j=0;j<cells.size();j++)
			{
				if(cells.get(j).getText().equals("Payment Done")&&cells.get(j+1).getText().equals("Awaiting Query Response"))
				{
					APP_LOGS.info("going to click on Reply to Query");
					driver.findElement(By.cssSelector("button[onclick*='"+appnum+"'][class='btn btn-success']")).click();	
				//doLogout();
				break outerloop;               
				}
				else{		
				}
			}
		}
		
		return PageFactory.initElements(driver,AmendmentOfLicenceReplyToQueryPage.class);	
	}
	public TransferOfLicenceReplyToQuerPage TransferOfLicenceclickReplyToQuery(String appnum)
	{
		List<WebElement> rows=EntreprenuerTransferOfLicenceWebTable.findElements(By.tagName("tr"));
		outerloop:
			for(int i=0;i<rows.size();i++)
			{
				List<WebElement> cells=rows.get(i).findElements(By.tagName("td"));
				for(int j=0;j<cells.size();j++)
				{
					if(cells.get(j).getText().equals("Payment Done")&&cells.get(j+1).getText().equals("Awaiting Query Response"))
					{
						APP_LOGS.info("going to click on Reply to Query");
						driver.findElement(By.cssSelector("button[onclick*='"+appnum+"'][class='btn btn-success']")).click();	
					//doLogout();
					break outerloop;               
					}
					else{
						APP_LOGS.info("no application  number is there to process reply to Query ");
					}
				}
			}
		return PageFactory.initElements(driver,TransferOfLicenceReplyToQuerPage.class);
		
	}
}
	
	
	
