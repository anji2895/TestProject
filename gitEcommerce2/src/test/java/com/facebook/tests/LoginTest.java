package com.facebook.tests;

import org.testng.annotations.*;

import com.facebook.genericPage.CommonMethods;
import com.facebook.pages.LoginPage;

public class LoginTest extends CommonMethods {

	public LoginTest() throws Exception {
		super();
	}

	@Test
	public void Login() throws Exception {
		LoginPage lt = new LoginPage();

		lt.enterEmail();
		logger.info("email entered");

		lt.enterPassword();
		logger.info("password entered");

		lt.clickLoginButton();
		logger.info("clicked on login button");
		

	}
	@AfterMethod
	public void close() {
driver.quit();
}
	}


