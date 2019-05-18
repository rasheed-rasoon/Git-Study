package rough;

import java.io.FileOutputStream;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Sample {
	public static void main(String args[]) throws Exception
	{
		FileOutputStream outputStream = new FileOutputStream("F:\\RASHEED_Selenium_WorkSpace\\TsFactories-ExtentReports\\data\\poiInput25.xlsx");
		 XSSFWorkbook workbook = new XSSFWorkbook();
	        
		XSSFSheet sheet = workbook.createSheet("Java Books");	
		String[][] bookData = {
                {"Head First Java", "Kathy Serria"},
                {"Effective Java", "Joshua Bloch"},
                {"Clean Code", "Robert martin"},
                {"Thinking in Java", "Bruce Eckel"},
        };
		for(int i=0;i<bookData.length;i++)
		{
		Row row = sheet.createRow(i);
		for(int j=0;j<bookData.length;j++)
		{
		Cell cell = row.createCell(j);
		cell.setCellValue(bookData);
		workbook.write(outputStream);
		}
	}
	}

}                           




