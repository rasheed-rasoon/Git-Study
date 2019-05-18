package rough;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CookiesSample {

	public static WebDriver driver;
	
	public static void main(String[] args) {
		
        System.setProperty("webdriver.chrome.driver","F:\\softwares\\Driver\\geckodriver.exe");					
		driver=new ChromeDriver();        
		driver.get("http://demo.guru99.com/test/cookie/selenium_aut.php");
        driver.manage().window().maximize();
       				
        // Input Emailid and Password If you are already Register		
        driver.findElement(By.name("username")).sendKeys("abc123");							
        driver.findElement(By.name("password")).sendKeys("123xyz");							
        driver.findElement(By.name("submit")).click();					
      for(Cookie getCookie1:driver.manage().getCookies())	
      {
    	  System.out.println(getCookie1);
    	  
      }
        
        
        // create file named Cookies to store Login Information		
//        File file = new File("Cookies.data");							
//        try		
//        {	  
//            // Delete old file if exists
//			file.delete();		
//            file.createNewFile();			
//            FileWriter fileWrite = new FileWriter(file);							
//            BufferedWriter Bwrite = new BufferedWriter(fileWrite);							
//            // loop for getting the cookie information 		
//            	
//            // loop for getting the cookie information 		
//            for(Cookie ck : driver.manage().getCookies())							
//            {			
//                Bwrite.write((ck.getName()+";"+ck.getValue()+";"+ck.getDomain()+";"+ck.getPath()+";"+ck.getExpiry()+";"+ck.isSecure()));																									
//                Bwrite.newLine();             
//            }			
//            Bwrite.close();			
//            fileWrite.close();	
//            
//        }
//        catch(Exception ex)					
//        {		
//            ex.printStackTrace();			
//        }		
    }		
	}


