package com.facebook.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PageFactoryLoginPage {


	 @FindBy(xpath="//input[@id='email'] ")
	 WebElement enterEmail;
	 
	 
	 @FindBy(xpath="//input[@id='pass']") 
	 WebElement enterPassword;
	 
	 public void enterEmail(String email) {
		 enterEmail.sendKeys("email@gmail.com");
	 }

	 public void enterPassword() {
		 enterPassword.sendKeys("Pass@123");
	 

}}
