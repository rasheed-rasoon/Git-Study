package rough;

import java.text.ParseException;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



/*There are two types of HTML tables published on the web-

Static tables: Data is static i.e. Number of rows and columns are fixed.
Dynamic tables: Data is dynamic i.e. Number of rows and columns are NOT fixed.
Below is an example of a dynamic table of Sales. Based on input date filters, number of rows will get altered. So, it is dynamic in nature.

*/
public class WebTableHandling {
	public static void main(String[] args) throws ParseException {
    	WebDriver wd;
	  System.setProperty("webdriver.chrome.driver","G://chromedriver.exe");
	  wd= new ChromeDriver();
        wd.get("http://demo.guru99.com/test/web-table-element.php");         
        //No.of Columns
        List  col = wd.findElements(By.xpath(".//*[@id=\"leftcontainer\"]/table/thead/tr/th"));
        System.out.println("No of cols are : " +col.size()); 
        //No.of rows 
        List  rows = wd.findElements(By.xpath(".//*[@id='leftcontainer']/table/tbody/tr/td[1]")); 
        System.out.println("No of rows are : " + rows.size());
        wd.close();
    }
}
