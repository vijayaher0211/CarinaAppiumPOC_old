package com.demo.mobile.gui.page;

import org.openqa.selenium.WebDriver;

import com.qaprosoft.carina.core.gui.AbstractPage;

public abstract class PersonalLoanBasePage extends AbstractPage {

	public PersonalLoanBasePage(WebDriver driver) {
		super(driver);
	}
	

	public abstract void enterLoanDetails(String loanAmount, String tenure, String netIncome) ;
	public abstract void enterPersonalDetails(String dob,String pinCode, String linkedStatus);
	public abstract String getText() ;
	public abstract void handleConfirmationPopup() ;
	
	public abstract String invalidPincode(String dob, String pinCode, String linkedStatus) ;
}
