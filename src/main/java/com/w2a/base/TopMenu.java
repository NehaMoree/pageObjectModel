package com.w2a.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TopMenu {
	
	/*
	 * We Cannot Extend Page class here
	 * So instead we can use Page.driver.findElement("")
	 * OR
	 */
	WebDriver driver;

	public TopMenu(WebDriver driver) {
		this.driver = driver;
	}
	
	
	public void gotoHome() {
		
	}
	
	public void gotoLeads() {
		driver.findElement(By.linkText("Leads")).click();
	}
	
	public void gotoContacts() {
		
	}
	
	public void gotoAccounts() {
		driver.findElement(By.linkText("Accounts")).click();
	}
	
	public void gotoDeals() {
		
	}
	
	public void gotoActivities() {
		
	}
	public void gotoReports() {
		
	}

}
