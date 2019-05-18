package rough;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadAndWriteExcelData {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		FileInputStream fis = new FileInputStream(
				"F:\\RASHEED_Selenium_WorkSpace\\TsFactories-ExtentReports\\data\\TestCases.xlsx"); // location to read data
		FileOutputStream fos=new FileOutputStream("F:\\RASHEED_Selenium_WorkSpace\\TsFactories-ExtentReports\\data\\TestCasesdup12323.xlsx");//Target location to Write data
		Workbook w=new XSSFWorkbook(); //create  reference variable for workbook to read  the data
		Sheet sh=w.createSheet("Test Cases"); //create ref variable for sheet for creating sheet
		Workbook wb = new XSSFWorkbook(fis);//create  reference variable for workbook to Write  the data
		Sheet s = wb.getSheet("Test Cases"); //create ref variable for sheet for creating sheet 
		for (int i = 0; i <= s.getLastRowNum(); i++) {

			Row r = s.getRow(i); // for every iteration it will get the row
			
			Row rw=sh.createRow(i);// for every iteration it will create the row
			for(int j=0;j<r.getLastCellNum();j++){
			Cell c = r.getCell(j);// for every iteration it will read the  cell value
			
			Cell cell=rw.createCell(j);// for every iteration it will create a  cell to write the cell
			cell.setCellValue(c.getStringCellValue());
		
			System.out.println(c.getStringCellValue());
			}
		}	w.write(fos); //AFter set the cell values for all the respective rows we must declare this otherwise it won't write any data
		wb.close();
	}
	

}
