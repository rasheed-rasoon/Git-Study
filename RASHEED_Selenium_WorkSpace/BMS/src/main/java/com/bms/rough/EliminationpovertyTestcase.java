package com.bms.rough;

import java.util.Hashtable;

import org.testng.SkipException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.bms.testcases.TestBase;
import com.cgg.util.TestUtil;

public class EliminationpovertyTestcase extends TestBase {
  @Test(dataProvider="getData")
  public void f(Hashtable <String,String>data) {
	  if(!TestUtil.isExecutable(this.getClass().getSimpleName(),xls)|| data.get("Runmode").equalsIgnoreCase("N"))
			throw new SkipException("Skipping the Test Case Number");
	  
	  driver.get("http://www.tmepma.cgg.gov.in/home.do");

  }
  
  
  @DataProvider
	public Object[][] getData(){
		return TestUtil.getData(this.getClass().getSimpleName(),xls);
	}
}
