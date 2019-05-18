package rough;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ReadExcelDataProvider {

public WebDriver driver;
public WebDriverWait wait;
String appurl="http://facebook.com";
public String expected=null;
public String actual=null;

@BeforeClass
public void testsetup()
{
driver=new FirefoxDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
wait=new WebDriverWait(driver,5);
driver.get(appurl);
}

@Test(dataProvider="getExcelData")
public void validlogin(String username,String password)
{
//driver.findElement(By.xpath(".//*[@id='email']")).sendKeys(username);
//driver.findElement(By.xpath(".//*[@id='pass']")).sendKeys(password);
//driver.findElement(By.xpath("//*[@id=’pass’]")).sendKeys(Keys.ENTER);


//
//wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=’login_form’]/div[2]")));
//
//actual=driver.findElement(By.xpath("//*[@id=’login_form’]/div[2]/div[1]")).getText();
//
//expected="Please re-enter your password";
//Assert.assertEquals(actual, expected);
}

@DataProvider
public  Object[][] getExcelData() {
Object[][] data = null;
try {
// Open the Excel file
	File excel1 = new File("F:\\TestCases.xlsx");
	FileInputStream fis = new FileInputStream(excel1);
	// Access the required test data sheet
	Workbook wb = new XSSFWorkbook(fis);
	Sheet sheet = wb.getSheet("Test Data2");
	// Loop through all rows in the sheet
	// Start at row 1 as row 0 is our header row
	System.out.println(sheet.getLastRowNum());
	for(int count = 1;count<=sheet.getLastRowNum();count++){
	System.out.println("forlo op");
	Row row = sheet.getRow(count);
	//System.out.println(“Running test case ” + row.getCell(0).toString());
	// Run the test for the current test data row

	data[1][0]= (row.getCell(0).toString());
	data[1][1]=(row.getCell(1).toString());

	}
fis.close();
} catch (IOException e) {
System.out.println("Test data file not found");
}
return data;
}

@Test
public void tearDown() {
driver.quit();
}

}