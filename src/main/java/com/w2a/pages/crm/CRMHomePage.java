package com.w2a.pages.crm;

import org.openqa.selenium.By;
import org.testng.Assert;

import com.w2a.base.Page;


public class CRMHomePage extends Page{

	
	
	public void verifyTextCRMHome() {
		String heading = "Welcome bracegraceyou";
		String actual_heading = driver.findElement(By.xpath(".//*[@id='show-uName']")).getText();
		
		Assert.assertEquals(heading, actual_heading);
	}
	

	
	
}
