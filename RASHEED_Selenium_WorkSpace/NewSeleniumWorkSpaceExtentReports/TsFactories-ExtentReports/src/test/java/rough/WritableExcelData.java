package rough;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WritableExcelData {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileOutputStream fos=new FileOutputStream("F:\\RASHEED_Selenium_WorkSpace\\TsFactories-ExtentReports\\data\\TestCasesdup1200.xlsx");
Object[][] data={{"Rasheed","Ahemd","Dilshad"},{"Naresh","Ganesh"}};
		Workbook w=new XSSFWorkbook();
Sheet s=w.createSheet("Data");
//int rowcount=s.getLastRowNum();
int rowcount=0;
int cellcount=0;
for(Object[] k:data)
{
	Row rw=s.createRow(rowcount++);	
	
	
	for(Object t:k)
	{
System.out.println(t);
Cell cl=rw.createCell(cellcount++);
cl.setCellValue(t.toString());
	}

}
w.write(fos);
w.close();
}
	
}
