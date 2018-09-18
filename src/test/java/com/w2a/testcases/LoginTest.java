package com.w2a.testcases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.w2a.base.Page;
import com.w2a.pages.HomePage;
import com.w2a.pages.LoginPage;
import com.w2a.pages.ZohoAppPage;
import com.w2a.pages.crm.CRMAddAccountsPage;
import com.w2a.pages.crm.CRMHomePage;
import com.w2a.utilities.Utilities;


public class LoginTest extends Page{
	
	
	
	@Test(dataProviderClass=Utilities.class, dataProvider="dp")
	public void loginTest(String username,String password) {
		HomePage home = new HomePage();  //HomePage class from com.w2a.pages
		LoginPage login = home.goToLogin();

		ZohoAppPage zp = login.doLogin(username,password);
		CRMHomePage crm = zp.gotoCRM();
		
		Page.menu.gotoAccounts();
		
		CRMAddAccountsPage add = new CRMAddAccountsPage();
		add.addAccount();
	}

}
