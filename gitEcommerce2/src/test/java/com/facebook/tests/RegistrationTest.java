package com.facebook.tests;

import org.testng.annotations.Test;

import com.facebook.genericPage.CommonMethods;
import com.facebook.pages.Register;

public class RegistrationTest extends CommonMethods{

	
	public RegistrationTest() throws Exception {
		super();
		// TODO Auto-generated constructor stub
	}

	@Test
	public void Registration() throws Exception {
		Register rt = new Register();
		rt.RegisterLink();
		logger.info("clicked on registration link ");

		rt.Gender();
		logger.info("gender selected");

		rt.FirstName();
		logger.info("entered first name");

		rt.LastName();
		logger.info("entered last name");

		rt.Email();
		logger.info("entered email");

		rt.Password();
		logger.info("entered password");

		rt.ConfirmPassword();
		logger.info("entered password again to confirm");

		
		
	}

}
