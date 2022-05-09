package com.demo.mobile.gui.page;

import org.openqa.selenium.WebDriver;

import com.qaprosoft.carina.core.gui.AbstractPage;

public abstract class HomeScreenBasePage extends AbstractPage{

	public HomeScreenBasePage(WebDriver driver) {
		super(driver);
	}
	
	public abstract void selectPersonalLoanOption() ;
	public abstract String  getText();
	public abstract void selectPersonalLoan() ;

}
