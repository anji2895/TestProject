package com.facebook.pages;

import com.facebook.genericPage.CommonMethods;

public class Register extends CommonMethods {

	public Register() throws Exception {
		super();
	}
	
	public void RegisterLink() {
		click("Register");
	}
	public void Gender() {
		selectRadioButton("GenderRadio",1);
	}
	
	public void FirstName() {
		enterData("FirstName","firstname");
	}
	
	public void LastName() {
		enterData("LastName","lastname");
	}
	
	public void Email() {
		enterData("Email","email");
	}
	
	public void Password() {
		enterData("Password","password");
	}
	
	public void ConfirmPassword() {
		enterData("ConfirmPassword","confirmpassword");
	}
	

}
