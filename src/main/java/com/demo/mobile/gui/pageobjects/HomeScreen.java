package com.demo.mobile.gui.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import com.demo.mobile.gui.page.HomeScreenBasePage;
import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType.Type;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;

import io.appium.java_client.MobileBy;

@DeviceType(pageType=Type.ANDROID_PHONE, parentClass=HomeScreenBasePage.class)
public class HomeScreen extends HomeScreenBasePage{
	
	public HomeScreen(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath="(//android.widget.ImageView[contains(@resource-id,'loan_image')])[1]") ExtendedWebElement personalLoanBtn;
	@FindBy(id = "com.realmepay.payments:id/title_TV_loans") ExtendedWebElement borrowTxt;
	@FindBy(xpath="//android.widget.TextView[contains(@text,'GET PERSONAL')]") ExtendedWebElement getPersonalLoan;
	
	public void selectPersonalLoanOption() {
		personalLoanBtn.click();
	}

	public String  getText() {
		borrowTxt.isVisible();
		return borrowTxt.getText();
	}
	
	public void selectPersonalLoan() {
		getPersonalLoan.isVisible();
		getPersonalLoan.click();
	}
	
	
}
