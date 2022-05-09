package com.demo.mobile.gui.page;

import org.openqa.selenium.WebDriver;

import com.qaprosoft.carina.core.gui.AbstractPage;

public abstract class LoanApplicationForm2BasePage extends AbstractPage{

	public LoanApplicationForm2BasePage(WebDriver driver) {
		super(driver);
	}
	
	public abstract void enterProfessionalProfileDetails(String companyName, String designation, String officeArea, String officeCity, String  officePinCode, String expYears, String expMonths, String panNumber );

}
