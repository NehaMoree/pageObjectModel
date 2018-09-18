package com.w2a.utilities;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Date;
import com.w2a.base.Page;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.DataProvider;

public class Utilities extends Page {
	

	public static String screenshotPath;
	public void captureScreenshot(String result) throws IOException {
		
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		Date d = new Date();
		FileHandler.copy(src, new File("C:\\Users\\Kittu\\eclipse-workspace\\DataDrivenFramework\\target\\surefire-reports\\html\\"+result+d.toString().replace(":", "_").replace(" ", "_")+"_test.png"));
	}
	
	@DataProvider(name="dp")
	public Object[][] getData() {

		
		String sheetName = "Login";
		int rows = excel.getRowCount(sheetName);
		int cols = excel.getColumnCount(sheetName);
		
		Object[][] data = new Object[rows-1][cols];
		
		for(int rowNum=2; rowNum<=rows; rowNum++) {
			
			for(int colNum=0; colNum<cols; colNum++) 
			{
				data[rowNum-2][colNum] = excel.getCellData(sheetName, colNum, rowNum);
			}
		}
		return data;
		
		
	}
	

}
