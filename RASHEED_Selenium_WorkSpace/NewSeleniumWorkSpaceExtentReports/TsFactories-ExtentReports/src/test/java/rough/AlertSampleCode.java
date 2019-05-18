package rough;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;

public class AlertSampleCode {
	static WebDriver driver;
	
	public static void main(String args[])
	{
	Alert a=driver.switchTo().alert();

	String alertText=a.getText();	
	a.accept();
	}

}
