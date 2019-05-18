package rough;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadAndWriteExcelForEach {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		FileInputStream fis = new FileInputStream(
				"F:\\RASHEED_Selenium_WorkSpace\\TsFactories-ExtentReports\\data\\TestCases.xlsx");
		FileOutputStream fos=new FileOutputStream("F:\\RASHEED_Selenium_WorkSpace\\TsFactories-ExtentReports\\data\\TestCasesdup123.xlsx");
		Workbook w=new XSSFWorkbook();
		Sheet sh=w.createSheet("Test Cases");
		
		
		
		
		
		
		Workbook wb = new XSSFWorkbook(fis);
		Sheet s = wb.getSheet("Test Cases");
		for (int i :s) {

			Row r = s.getRow(i);
			
			Row rw=sh.createRow(i);
			for(int j=0;j<r.getLastCellNum();j++){
			Cell c = r.getCell(j);
			
			Cell cell=rw.createCell(j);
			cell.setCellValue(c.getStringCellValue());
		
			System.out.println(c.getStringCellValue());
			}
		}	w.write(fos);
		wb.close();
	}
	

}

