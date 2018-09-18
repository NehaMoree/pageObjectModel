package com.w2a.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.w2a.base.Page;
import com.w2a.pages.crm.CRMHomePage;

public class ZohoAppPage extends Page{
	

	
	public CRMHomePage gotoCRM() {
		driver.findElement(By.xpath(".//*[@id='zl-myapps']/div[1]/div[2]/div/a/span")).click();
		return new CRMHomePage();
	}
	
	public void gotoCliq() {
	driver.findElement(By.xpath(".//*[@id='zl-myapps']/div[1]/div[1]/div/a/span")).click();
		
	}
	
	public void gotoSalesIQ() {
		driver.findElement(By.xpath(".//*[@id='zl-myapps']/div[1]/div[3]/div/a/span")).click();
		
	}
	
	
}
