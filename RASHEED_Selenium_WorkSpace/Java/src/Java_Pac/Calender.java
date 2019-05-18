package Java_Pac;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Calender {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		int day, month, year;
		   
	     String futrDate = "td_"+2015+"_"+06+"_"+24; //this is the 'id' format in the calendar popup in html code, ex- id=td_2015_6_24
	   
	     WebDriver driver = new FirefoxDriver();
	     driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	     driver.get("http://www.yatra.com/");
	     driver.manage().window().maximize( );
	     Thread.sleep(3000);
	   
	     driver.findElement(By.id("BE_flight_depart_date")).click();
	     String monthYear="";
	     //this loop will execute untill your required month and year will not appear in the calendar
	     //here you can also pass the input from your and by making code as common
	     while(!(monthYear.equals("June 2015"))){
	         driver.findElement(By.xpath("//a[@class='js_btnNext sprite nextBtn']")).click(); //this will click on next button for month
	         monthYear = driver.findElement(By.xpath("//span[@class='js_monthTitle']")).getText(); // this is to get the month and year from calendar pop up
	     }
	   
	     driver.findElement(By.xpath("//td[@id='"+futrDate+"']")).click(); //this will select the date
	}

}
