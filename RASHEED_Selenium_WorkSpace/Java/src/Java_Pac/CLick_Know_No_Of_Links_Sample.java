package Java_Pac;

import org.testng.annotations.Test;

import jxl.Sheet;
import jxl.Workbook;

import org.testng.annotations.BeforeTest;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;

public class CLick_Know_No_Of_Links_Sample {
	public WebDriver driver;
	private static String[] links = null;
	  private static int linksCount = 0;
	 public  String link_Text;
	 public int l;  
	    
  @Test
  public void f() throws Exception {
	  DateFormat df = new SimpleDateFormat("yyyy_MMM_d2d hh_mm_ss a");
	    Date d = new Date();
	    String time = df.format(d);
	  
	  FileInputStream fis = new FileInputStream("F:\\RASHEED_Selenium_WorkSpace\\Java\\url_new.xls");  //creating reference variable for File input stream
		Workbook wb = Workbook.getWorkbook(fis);
		Sheet s = wb.getSheet(0);
		//String str1 = "";
		for (int i=0; i<=0; i++) 
		{
	
			try {
				   String new_Folder="F:\\RASHEED_Selenium_WorkSpace\\Java\\Links\\url "+i+" "+time+" Screen shot";
				    
				  File f=new File(new_Folder);  //create a new folder for each url to save the corresponding screen shots for each 
				   f.mkdir(); 
				   
				
				   driver=new FirefoxDriver();	
				   
	 //if(s.getCell(1, i).getContents() != null)
								
	 driver.get(s.getCell(1, i).getContents());
	 Thread.sleep(1000); 
	 System.out.println("now navigating to " +s.getCell(0, i).getContents()+ " url");  // to know the current url status
	 driver.manage().window().maximize();
	 Thread.sleep(3000); 
				
	  List<WebElement> linksize = driver.findElements(By.tagName("a")); 
	  linksCount = linksize.size();                                       //to get number of links for the particulat url
	  System.out.println("Total no of links Available: "+linksCount);       // to get total number of links
	  links= new String[linksCount];
	  System.out.println("List of links Available: ");  
	  for(l=0;l<linksCount;l++)
	  {
		 link_Text=linksize.get(l).getText();  
		System.out.println("Following are the link names");
		System.out.print(l +"link text is"+ link_Text);
		System.out.println();
	  }
	  // print all the links from webpage 
	  for(int j=0;j<linksCount;j++)
	  {
	  links[j] = linksize.get(j).getAttribute("href");
//	  System.out.println(all_links_webpage.get(i).getAttribute("href"));
	  } 
	  // navigate to each Link on the webpage
	  for(int k=9;k<=10;k++)
	  {
		  try{
	  System.out.println("now it's going to click 	on "+ k+"    link ");
	  		
	  driver.navigate().to(links[k]);         //click on the links for that URL                         
	  Thread.sleep(1000);                         //After click on link it will wait for one second
	  File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	  FileUtils.copyFile(src,new File(""+f+"\\link  "+k+" "+time+".png"));  
	   System.out.println(time);
		  }

		  catch(Exception e)
		  {
			  File fl=new File("F:\\RASHEED_Selenium_WorkSpace\\Java\\Link's_NotHaving_content\\url "+i+" "+time+"");  //create a new folder for each url to save the corresponding screen shots for each 
			   fl.mkdir(); 
			System.out.println("href is not working");  
			String TestFile = fl+"\\For url "+i+" link "+k+""+time+".txt"; 
			File FC = new File(TestFile);//Created object of java File class. 
			FC.createNewFile();//Create file.
			FileWriter FW = new FileWriter(TestFile); 
			BufferedWriter BW = new BufferedWriter(FW);
			BW.write("href or link is not working "); //Writing In To File.
			BW.newLine();//To write next string on new line. 
			//BW.write("This Is Second Line."); //Writing In To File. 
			BW.close(); //Reading from file. //Create Object of java FileReader and BufferedReader class. FileReader FR = new FileReader(TestFile); BufferedReader BR = new BufferedReader(FR); String Content = ""; //Loop to read all lines one by one from file and print It. while((Content = BR.readLine())!= null){ System.out.println(Content); - See more at: http://software-testing-tutorials-automation.blogspot.in/2014/05/read-write-text-file-in-java-tutorials.html#sthash.gdZy3cij.dpuf
		  }
	  
	  //Thread.sleep(3000);
//taking screen shot and storing in the respective folder }
	
	  }
		  
	  
			}
	   catch (Exception e) {
		   System.out.println("url is not available");
			//str = "Fail";
		}
			driver.quit();
	  }
  
	  
		
  }
  @BeforeTest
  public void beforeTest() throws InterruptedException {
	  
	  
  }

  @AfterTest
  public void afterTest() {
  }

}
