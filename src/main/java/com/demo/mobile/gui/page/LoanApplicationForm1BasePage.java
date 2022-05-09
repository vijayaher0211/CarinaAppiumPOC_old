package com.demo.mobile.gui.page;

import org.openqa.selenium.WebDriver;

import com.qaprosoft.carina.core.gui.AbstractPage;

public abstract class LoanApplicationForm1BasePage extends AbstractPage{

	public LoanApplicationForm1BasePage(WebDriver driver) {
		super(driver);
	}
	
	public abstract void enterPersonalProfileDetails(String fatherName, String middleName, String gender, String maritalStatus, String highestEducation, String instituteName);
	
	public abstract String getText();

}
