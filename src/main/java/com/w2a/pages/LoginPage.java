package com.w2a.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.w2a.base.Page;
import com.w2a.utilities.Utilities;

public class LoginPage extends Page{

	public ZohoAppPage doLogin(String username, String password) {
		
		type("username",username);	
		type("password",password);
		
		click("login_btn");

		
		return new ZohoAppPage();
		
	}
	
}
