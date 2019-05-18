package rough;

import org.testng.annotations.Test;



import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class DataProviderUsingExcel {
  @Test(dataProvider = "dp")
  public void f(HashMap<String,String> data) {
	  
	System.out.println(data.get("rasheed"));

	  
  }

  @DataProvider
  public Object[][] dp() throws IOException {
   
    	Object [][] data=new Object[1][1];
  
    	FileInputStream fis=new FileInputStream("F:\\Study\\tastData.xlsx");
    	
      Workbook wb=new XSSFWorkbook(fis);
      Sheet s=wb.getSheetAt(0);
      
      int rowCount=s.getLastRowNum();
      
      for(int i=0;i<=rowCount;i++)
      {
    	  Row r=s.getRow(i);
    	  for(int j=0;j<r.getLastCellNum();j++)
          {
        	  Cell c=r.getCell(j);
        	  data[i][0]=c.getStringCellValue();
        	  data[i][1]=c.getStringCellValue();
        	  System.out.println(c.getStringCellValue());
        	  
          }
    	  
      }
      wb.close();
      return data;
    }
  }

