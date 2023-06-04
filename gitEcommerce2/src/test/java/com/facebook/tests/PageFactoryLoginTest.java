package com.facebook.tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.facebook.genericPage.CommonMethods;
import com.facebook.pages.PageFactoryLoginPage;

public class PageFactoryLoginTest extends CommonMethods {
	public PageFactoryLoginTest() throws Exception {
		super();
	}
	
	@Test
public void logintest() {
	PageFactoryLoginPage pg = PageFactory.initElements(driver,PageFactoryLoginPage.class);
	pg.enterEmail(null);
	pg.enterPassword();
}}
