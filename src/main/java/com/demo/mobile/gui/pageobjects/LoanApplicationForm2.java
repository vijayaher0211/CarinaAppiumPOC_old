package com.demo.mobile.gui.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.demo.mobile.gui.page.HomeScreenBasePage;
import com.demo.mobile.gui.page.LoanApplicationForm2BasePage;
import com.qaprosoft.carina.core.foundation.utils.android.AndroidUtils;
import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType.Type;
import com.qaprosoft.carina.core.foundation.webdriver.Screenshot;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;

import io.appium.java_client.MobileBy;

@DeviceType(pageType=Type.ANDROID_PHONE, parentClass=LoanApplicationForm2BasePage.class)
public class LoanApplicationForm2 extends LoanApplicationForm2BasePage{

	public LoanApplicationForm2(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(id = "com.realmepay.payments:id/edt_company_name") public ExtendedWebElement companyNameEntryField;
	@FindBy(id = "com.realmepay.payments:id/edt_designation") public ExtendedWebElement designationEntryField;
	@FindBy(id = "com.realmepay.payments:id/edt_office_area") public ExtendedWebElement officeAreaEntryField;
	@FindBy(id = "com.realmepay.payments:id/edt_office_city") public ExtendedWebElement officeCityEntryField;
	@FindBy(id = "com.realmepay.payments:id/edt_office_pincode") public ExtendedWebElement officePincodeEntryField;
	@FindBy(id = "com.realmepay.payments:id/spinner_experience_yr") public ExtendedWebElement totalExperienceInYearsDropdown;
	@FindBy(id = "com.realmepay.payments:id/spinner_experience_month") public ExtendedWebElement totalExperienceInMonthsDropdown;
	@FindBy(id = "com.realmepay.payments:id/edt_pan_no") public ExtendedWebElement panNumberEntryField;
	@FindBy(id = "com.realmepay.payments:id/card_next_2") public ExtendedWebElement professionalProfileProceedBtn;
	@FindBy(id="com.realmepay.payments:id/text_popup_title") public ExtendedWebElement confirmSalaryPanTxt;
	@FindBy(id="com.realmepay.payments:id/text_no")	public ExtendedWebElement noBtn;
	@FindBy(id="com.realmepay.payments:id/text_yes") public ExtendedWebElement yesBtn;
	
	@FindBy(id="com.realmepay.payments:id/edt_monthly_salary") public ExtendedWebElement monthlySalary;
	
	
	public void enterProfessionalProfileDetails(String companyName, String designation, String officeArea, String officeCity, String  officePinCode, String expYears, String expMonths, String panNumber ) {
		
		companyNameEntryField.isVisible();
		companyNameEntryField.type(companyName);
		designationEntryField.type(designation);
		officeAreaEntryField.type(officeArea);
		officeCityEntryField.type(officeCity);
		officePincodeEntryField.type(officePinCode);
		
		//Swipe Code
		driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector()"
                + ".scrollable(true)).scrollIntoView("
                + "new UiSelector().text(\"Proceed\"));"));
		
		totalExperienceInYearsDropdown.click();
		String years = expYears+" years"; 
		new WebDriverWait(driver, 5).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.TextView[@text='"+years+"']"))).isDisplayed();
		driver.findElement(By.xpath("//android.widget.TextView[@text='"+years+"']")).click();
		
		totalExperienceInMonthsDropdown.click();
		String months = expMonths + " months";
		new WebDriverWait(driver, 5).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.TextView[@text='"+months+"']"))).isDisplayed();
		driver.findElement(By.xpath("//android.widget.TextView[@text='"+months+"']")).click();
		
		panNumberEntryField.isVisible();
		panNumberEntryField.type(panNumber);
		professionalProfileProceedBtn.click();
		
		confirmSalaryPanTxt.isVisible();
		yesBtn.click();
		
	}
	

}
