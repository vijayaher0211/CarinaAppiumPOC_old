package com.demo.mobile.gui.page;

import org.openqa.selenium.WebDriver;

import com.qaprosoft.carina.core.gui.AbstractPage;

public abstract class LoanApplicationForm3BasePage extends AbstractPage{

	public LoanApplicationForm3BasePage(WebDriver driver) {
		super(driver);
	}
	
	public abstract void enterCurrentResidentialAddress(String buildingName,String streetName,String landmark,String city,String state,String residentialPinCode,String residentialType) ;
	
	public abstract String getCongratulationsMsg();
	
	public abstract void proceedWithApplication();
}
