package rough;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderExcelPOIAPI{
	
	//This test method declares that its data should be supplied by the Data Provider
	// "getdata" is the function name which is passing the data
       // Number of columns should match the number of input parameters
	@Test(dataProvider="getData")
	public void setData(String username, String password)
	{
		System.out.println("you have provided username as::"+username);
		System.out.println("you have provided password as::"+password);
	}

	@DataProvider
	public Object[][] getData()
	{
	//Rows - Number of times your test has to be repeated.
	//Columns - Number of parameters in test data.

		FileInputStream fis = new FileInputStream(
				"F:\\RASHEED_Selenium_WorkSpace\\TsFactories-ExtentReports\\data\\TestCases.xlsx");
		Workbook w=new XSSFWorkbook();
		Sheet s=w.getSheet("Test Cases");
		
	return data;
	}
}