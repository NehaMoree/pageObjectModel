package com.w2a.pages.crm;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import com.w2a.base.Page;

public class CRMAddAccountsPage extends Page {
	
	
	
	public CRMAccountsPage addAccount() {
		driver.findElement(By.xpath(".//*[@id='createIcon']")).click();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
		driver.findElement(By.className("lyteQuickLink")).findElement(By.xpath("//lyte-menu-item[@data-value='Account']")).click();
		
		return new CRMAccountsPage();
	
	}

}
