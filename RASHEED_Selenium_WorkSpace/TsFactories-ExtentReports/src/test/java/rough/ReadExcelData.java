package rough;

import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelData {
	public static String data[][]=null;
	public static void main(String args[]) throws Exception
	{
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
		System.out.println(data[1][0]= (row.getCell(0).toString()));
		System.out.println(data[1][1]= (row.getCell(1).toString()));
		//data[1][1]=(row.getCell(1).toString());

		}
	fis.close();
	
}
}

