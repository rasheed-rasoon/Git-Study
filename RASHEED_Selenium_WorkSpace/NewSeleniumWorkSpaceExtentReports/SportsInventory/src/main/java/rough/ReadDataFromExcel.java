package rough;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadDataFromExcel {

	public static void main(String[] args) throws IOException {
		FileInputStream fis=new FileInputStream("F:\\Study\\tastData.xlsx");
    	
	      Workbook wb=new XSSFWorkbook(fis);
	      Sheet s=wb.getSheetAt(0);
	      
	      int rowCount=s.getLastRowNum();
	      System.out.println("Row count is  "+rowCount);
	      
	      for(int i=0;i<=rowCount;i++)
	      {
	    	  Row r=s.getRow(i);
	    	  int cellSize=r.getLastCellNum();
	    	  
	    	  System.out.println("cell size is for the row  "+i+" is "+cellSize);
	    	  
	    	  for(int j=1;j<r.getLastCellNum();j++)
	          {
	        	  Cell c=r.getCell(j);
	        	 
	        	  
	        	  System.out.println(" row "+i+" and cell "+j+" data is "+j+ c.getStringCellValue());
	        	  
	          }
	    	  
	      }
	      

	}

}
