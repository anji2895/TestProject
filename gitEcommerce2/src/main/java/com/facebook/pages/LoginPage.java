package com.facebook.pages;

import com.facebook.genericPage.CommonMethods;

public class LoginPage extends CommonMethods {

	
	public LoginPage() throws Exception {
		super();
		
	}

	public void clickEmailorPhone() {
		click("EmailOrPhone");

	}
	public void enterEmail() {
		enterData("EmailOrPhone","email");

	}
	
	public void clickPassword() {
		click("Password");
	}
	public void enterPassword() {
		enterData("Password","password");

	}
	public void clickLoginButton() {
		click("LoginButton");

	}
	
	
}
