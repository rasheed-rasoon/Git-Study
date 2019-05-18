package Java_Pac;

import java.io.FileOutputStream;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;

public class FileOutPutStream {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		  DateFormat df = new SimpleDateFormat("yyyy_MMM_d2d hh_mm_ss a");
		    Date d = new Date();
		    String time = df.format(d);
		FileOutputStream fos=new FileOutputStream("F:\\RASHEED_Selenium_WorkSpace\\Java\\WritableSheet"+time+".xls");
		WritableWorkbook w=Workbook.createWorkbook(fos);
		WritableSheet ws=w.createSheet("writeData",0);
		Label l=new Label(0, 0, "My name is rasheed");
		ws.addCell(l);
		w.write();
		w.close();
		

	}

}
