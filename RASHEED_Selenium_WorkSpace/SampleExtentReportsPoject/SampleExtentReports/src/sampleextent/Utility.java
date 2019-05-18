package sampleextent;

import org.openqa.selenium.Alert;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;

public class Utility {
	static WebDriver driver;
	public static int IMPLICIT_WAIT_TIMEOUT=30;
	public static void captureScreenshot(){
		//APP_LOGS.info("Accept UnExpected Alert If Available");
		long waitForAlert= System.currentTimeMillis() + IMPLICIT_WAIT_TIMEOUT;
		boolean boolFound = false;
		do
		{
			try
			{
				Alert alert = driver.switchTo().alert();
				if (alert != null)
				{
					String alerttext=alert.getText().trim();
					//APP_LOGS.info(" Alert Is Present:-"+alerttext);
					//createScreenshotUsingRobot(alerttext.trim()+name);
					alert.accept();
					boolFound = true;
				}
			}
			catch (NoAlertPresentException ex) {
			}
		} while ((System.currentTimeMillis() < waitForAlert) && (!boolFound));
	}
}
