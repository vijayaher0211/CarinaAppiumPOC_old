package com.demo.mobile.gui.page;

import org.openqa.selenium.WebDriver;

import com.qaprosoft.carina.core.gui.AbstractPage;

public abstract class LinkSocialProfileBasePage extends AbstractPage{

	public LinkSocialProfileBasePage(WebDriver driver) {
		super(driver);
	}
	
	public abstract void clickOnProceed() ;
	
	public abstract void selectGoogleAccount() ;
	public abstract String getText() ;

}
