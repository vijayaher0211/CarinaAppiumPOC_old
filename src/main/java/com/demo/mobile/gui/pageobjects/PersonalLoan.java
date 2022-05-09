package com.demo.mobile.gui.pageobjects;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.demo.mobile.generalFunctions.GeneralFunctions;
import com.demo.mobile.gui.page.PersonalLoanBasePage;
import com.qaprosoft.carina.core.foundation.utils.android.AndroidUtils;
import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType.Type;
import com.qaprosoft.carina.core.foundation.utils.mobile.MobileUtils.Direction;
import com.qaprosoft.carina.core.foundation.webdriver.DriverHelper;
import com.qaprosoft.carina.core.foundation.webdriver.Screenshot;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

@DeviceType(pageType=Type.ANDROID_PHONE, parentClass = PersonalLoanBasePage.class)
public class PersonalLoan extends PersonalLoanBasePage{

	private static final Logger LOGGER = Logger.getLogger(DriverHelper.class);

	public PersonalLoan(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(id="com.realmepay.payments:id/text_routing_header") ExtendedWebElement personalLoanTxt;
	@FindBy(xpath="//android.widget.TextView[@text='Salaried']") ExtendedWebElement salariedTab;
	@FindBy(id="com.realmepay.payments:id/loan_amount_et") ExtendedWebElement loanAmountEntryField;
	@FindBy(id="com.realmepay.payments:id/tenure_et") ExtendedWebElement tenureMonthsEntryField;
	@FindBy(id="com.realmepay.payments:id/income_et") ExtendedWebElement monthlyIncomeEntryField;
	@FindBy(id="com.realmepay.payments:id/tv_dob") ExtendedWebElement birthDateEntryField;
	@FindBy(id="com.realmepay.payments:id/edt_city") ExtendedWebElement pinCodeEntryField;
	@FindBy(id="com.realmepay.payments:id/rbtn_adharmobile_linked_yes") ExtendedWebElement yesRadioBtn;
	@FindBy(id="com.realmepay.payments:id/rbtn_adharmobile_linked_no") ExtendedWebElement noRadioBtn;
	@FindBy(id="com.realmepay.payments:id/chkbox_routing_consent") ExtendedWebElement checkBox;
	@FindBy(id="com.realmepay.payments:id/text_proceed_to_apply") ExtendedWebElement nextBtn;
	@FindBy(id="com.realmepay.payments:id/text_yes") ExtendedWebElement confirmBtn;
	@FindBy(id="com.realmepay.payments:id/text_popup_confirm_title") ExtendedWebElement confirmationMsg;
	@FindBy(id="android:id/date_picker_header_year") ExtendedWebElement selectYear;
	@FindBy(id="android:id/button1") ExtendedWebElement calenderOkBtn;
	
//	@FindBy(xpath="//android.widget.Toast[@text='Please enter valid pincode']") ExtendedWebElement toastMsg;
	
	
	public String getText() {
		return personalLoanTxt.getText();
	}
	
	public void enterLoanDetails(String loanAmount, String tenure, String netIncome) {
		salariedTab.click();
		loanAmountEntryField.type(loanAmount);
		tenureMonthsEntryField.type(tenure);
		monthlyIncomeEntryField.type(netIncome);
	}
	
	public void enterPersonalDetails(String dob, String pinCode, String linkedStatus) {
				
		LOGGER.info(java.time.LocalTime.now() +"   Calender Start Time");
		birthDateEntryField.click();
		selectYear.click();
		GeneralFunctions.selectBirthDate(dob);
		calenderOkBtn.click();
		LOGGER.info(java.time.LocalTime.now() + "   Calender End Time");
		
		driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector()"
                + ".scrollable(true)).scrollIntoView("
                + "new UiSelector().text(\"Next\"));"));
		
		pinCodeEntryField.type(pinCode);
		
		if(linkedStatus.equalsIgnoreCase("Yes")) {
			yesRadioBtn.click();
		}else {
			noRadioBtn.click();
		}

		checkBox.click();
		nextBtn.click();
		
	}
	
	public String invalidPincode(String dob, String pinCode, String linkedStatus){
		
		LOGGER.info(java.time.LocalTime.now() +"   Calender Start Time");
		birthDateEntryField.click();
		selectYear.click();
		GeneralFunctions.selectBirthDate(dob);
		calenderOkBtn.click();
		LOGGER.info(java.time.LocalTime.now() + "   Calender End Time");
		
		driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector()"
                + ".scrollable(true)).scrollIntoView("
                + "new UiSelector().text(\"Next\"));"));
		
		pinCodeEntryField.type(pinCode);
		
		if(linkedStatus.equalsIgnoreCase("Yes")) {
			yesRadioBtn.click();
		}else {
			noRadioBtn.click();
		}

		checkBox.click();
		nextBtn.click();
		
		WebDriver drv = getDriver();
	    if (drv instanceof EventFiringWebDriver) {
	        drv = ((EventFiringWebDriver) drv).getWrappedDriver();
	    }
	    AndroidDriver<MobileElement> driver = (AndroidDriver<MobileElement>) drv;
		String toastMsg = driver.findElement(By.xpath("//android.widget.Toast[@text='Please enter valid pincode']")).getText();
//		String toastMsg = driver.findElement(By.xpath("//android.widget.Toast[1]")).getText();
		
		System.out.println(toastMsg);
		
		return toastMsg;
	}
	
	public void handleConfirmationPopup() {
		confirmationMsg.isVisible();
		confirmBtn.click();
	}
	
}
