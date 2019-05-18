package rough;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class JavScriptExecutorExamples {
	private static WebDriver driver;
	
	public static void JavaScriptExecutorex1() throws Exception
	{
	driver = new FirefoxDriver();
driver.get("mail.cgg.gov.in");
driver.manage().window().maximize();
Thread.sleep(5000);
JavascriptExecutor js = (JavascriptExecutor) driver;
js.executeScript("history.go(0)");  // refresh
js.executeScript("document.getElementById('username').value='rasheedahmed.sk'");  
js.executeScript("document.getElementById('password').value='Sep@1628'");// enter text in the field passowrd

driver.findElement(By.xpath("html/body/div[1]/div[1]/div[1]/form/table/tbody/tr[3]/td[2]/input[2]")).click();
//js.executeScript("document.getElementById('btnRefresh').click()"); // captcha refresh
		
//String sText = js.executeScript("return document.documentElement.innerText;").toString();
//System.out.println("Inner etxt is "+sText);

// String title= js.executeScript("return Document.title;").toString();
// System.out.println(title);
// 
//Vertical scroll - down by 500  pixels
js.executeScript("window.scrollBy(0,500)");


	}

	
	public static void main(String[] args) throws Exception {

		JavScriptExecutorExamples.JavaScriptExecutorex1();
	}

}
