package com.demo.mobile.gui.objectrepository;

import static com.qaprosoft.carina.core.foundation.utils.mobile.MobileUtils.getDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;

import io.appium.java_client.AppiumDriver;

public class PageElements {
	
//	WebDriver driver = getDriver();
	
	public WebDriver getDriverSafe() {
        WebDriver driver = getDriver();
        if (driver instanceof EventFiringWebDriver) {
            driver = ((EventFiringWebDriver) driver).getWrappedDriver();
        }
        return driver;
    }
	
	public PageElements() {
		AppiumDriver<?> driver = (AppiumDriver<?>) getDriverSafe();
		PageFactory.initElements(driver, this);
//		this.driver = driver;
	}
	
	//Home Screen Objects
	
	@FindBy(xpath="//android.widget.TextView[@text='Within 24 Hrs']")
	public ExtendedWebElement PersonalLoanBtn;
	
	@FindBy(id = "com.realmepay.payments:id/title_TV_loans")
	public ExtendedWebElement BorrowTxt;
	
	
	/*@FindBy(id = "com.realmepay.payments:id/ic_close") public ExtendedWebElement CloseBtn;
	@FindBy(id = "com.realmepay.payments:id/ivWelcomeClose") public ExtendedWebElement WelcomeCloseBtn;
	@FindBy(id = "com.realmepay.payments:id/tv_upi") public ExtendedWebElement RegisterUpiBtn;
	@FindBy(id = "com.realmepay.payments:id/registerUser") public ExtendedWebElement RegisterBtn;
	@FindBy(id = "com.realmepay.payments:id/et_PhoneNo") public ExtendedWebElement YourPhoneNumberEntryField;
	@FindBy(id = "com.realmepay.payments:id/iv_mobile_submit") public ExtendedWebElement SubmitBtn;
	@FindBy(id = "com.realmepay.payments:id/ed_pop_otp") public ExtendedWebElement OtpEntryField;*/
	
}
