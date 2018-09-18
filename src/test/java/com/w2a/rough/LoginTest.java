package com.w2a.rough;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.w2a.base.Page;
import com.w2a.pages.HomePage;
import com.w2a.pages.LoginPage;
import com.w2a.pages.ZohoAppPage;
import com.w2a.pages.crm.CRMAddAccountsPage;
import com.w2a.pages.crm.CRMHomePage;

public class LoginTest {
	
	@Test
	public void loginTest() {

		
		HomePage home = new HomePage();  //HomePage class from com.w2a.pages
		LoginPage login = home.goToLogin();

		ZohoAppPage zp = login.doLogin("bracegraceyou@gmail.com", "mesamesa");
		CRMHomePage crm = zp.gotoCRM();
		
		Page.menu.gotoAccounts();
		
		CRMAddAccountsPage add = new CRMAddAccountsPage();
		add.addAccount();
	
		
		
	}

}
