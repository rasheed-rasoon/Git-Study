package com.cgg.Rough;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.cgg.constants.Constant;
import com.cgg.util.TestUtil;
import com.cgg.util.Xls_Reader;



public class GetRunmode {

	public static void main(String [] args){

		//System.out.println(System.getProperty("user.dir"));
		Xls_Reader xls = new Xls_Reader(Constant.XLS_FILE_PATH);

		// Test Cases data start from row number #2
		// Keep "Test Cases" in Constants class later!
		// Keep the "Y" in Constants class


		for(int rowNum=2; rowNum<=xls.getRowCount("Test Cases"); rowNum++){
			if(xls.getCellData("Test Cases", "Runmode", rowNum).equalsIgnoreCase("Y"))
				System.out.println(xls.getCellData("Test Cases", "TCID", rowNum) +" -- "+xls.getCellData("Test Cases", "Runmode", rowNum));


			// Print Test Cases with Runmode "Y"



		}

	}
}