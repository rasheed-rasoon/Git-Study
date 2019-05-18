package Selenium;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Creating_Folder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0;i<=5;i++)
		{
		 DateFormat df = new SimpleDateFormat("yyyy_MMM_dd hh_mm_ss a");
		    Date d = new Date();
		    String time = df.format(d);
		    System.out.println(time);
		    File f=new File("F:\\x+"+i+"");
		    f.mkdir(); 
	}
		 
	}

}
