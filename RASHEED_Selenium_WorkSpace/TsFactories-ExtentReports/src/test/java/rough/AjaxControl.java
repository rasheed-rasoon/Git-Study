package rough;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AjaxControl {
	
	public static WebDriver driver;
	
	

	
	
	public static void main(String args[]) throws Exception
	{
		
//		String str="Thanks for submitting the grievance. Your complaint ID: (19051877782). You will hear from us soon!";
//		String[] tok = str.split(" ( ", 2);
//		// TODO: check that tok.length==2 (if it isn't, the input string was malformed)
//		String a = tok[0];
//		String b = tok[1];
//		System.out.println(a);
//		System.out.println(b);
		String string = "Thanks for submitting the grievance. Your complaint ID: (19051877782). You will hear from us soon!";
		String[] parts = string.split("\\(");
		String part1 = parts[0]; // Apple
		String part2 = parts[1];// 18);

		String[] num=part2.split("\\)");
		
		System.out.println(num[0]);
		 
		 
//		 driver = new FirefoxDriver();
//		driver.get("http://testghmc.cgg.gov.in/IGRS/citizen.aspx");
//		driver.manage().window().maximize();
//		
//		driver.findElement(By.id("txtLocality")).sendKeys("h");
//		Thread.sleep(5000);
//		String str = driver.findElement(By.id("completionListElem")).getText();
//		System.out.println(str);

		
	}
	

}
