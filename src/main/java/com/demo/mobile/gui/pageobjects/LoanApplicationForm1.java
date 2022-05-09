package com.demo.mobile.gui.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.demo.mobile.gui.page.LoanApplicationForm1BasePage;
import com.qaprosoft.carina.core.foundation.utils.android.AndroidUtils;
import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType.Type;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;

import io.appium.java_client.MobileBy;

@DeviceType(pageType=Type.ANDROID_PHONE, parentClass=LoanApplicationForm1BasePage.class)
public class LoanApplicationForm1 extends LoanApplicationForm1BasePage{

	public LoanApplicationForm1(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(id = "com.android.packageinstaller:id/permission_message") public ExtendedWebElement permissionMsg;
	@FindBy(id = "com.android.packageinstaller:id/permission_allow_button")	public ExtendedWebElement allowBtn;
	@FindBy(xpath = "//android.widget.TextView[@text='Share your details - easy&simple']") public ExtendedWebElement shareYourDetailsTxt;
	@FindBy(id = "com.realmepay.payments:id/edt_father_name") public ExtendedWebElement fatherNameEntryField;
	@FindBy(id = "com.realmepay.payments:id/edt_mother_name") public ExtendedWebElement motherNameEntryField;
	@FindBy(id = "com.realmepay.payments:id/ll_male") public ExtendedWebElement maleRadioBtn;
	@FindBy(id = "com.realmepay.payments:id/ll_female") public ExtendedWebElement femaleRadioBtn;
	@FindBy(id = "com.realmepay.payments:id/spiner_marital_status") public ExtendedWebElement selectMaritalStatusDropdown;
	@FindBy(id = "com.realmepay.payments:id/spiner_high_edu") public ExtendedWebElement highestEducationDropdown;
	@FindBy(id = "com.realmepay.payments:id/edt_institute_name") public ExtendedWebElement instituteNameEntryField;
	@FindBy(id = "com.realmepay.payments:id/card_next_1") public ExtendedWebElement personalProfileProceedBtn;
	
	public String getText() {
		
		try {
//			permissionMsg.isVisible(10);
			allowBtn.clickIfPresent(10);
		}catch(Exception e) {
			System.out.println("Permission Msg not Appeared");
		}
		shareYourDetailsTxt.isVisible();
		return shareYourDetailsTxt.getText();
	}
	
	public void enterPersonalProfileDetails(String fatherName, String motherName, String gender, String maritalStatus, String highestEducation, String instituteName) {
		
		fatherNameEntryField.isVisible();
		fatherNameEntryField.type(fatherName);
		motherNameEntryField.type(motherName);
		
		if(gender.equalsIgnoreCase("female")) {
			femaleRadioBtn.click();
		}else {
			maleRadioBtn.click();	
		}
		
		//swipe Code
		
		driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector()"
                + ".scrollable(true)).scrollIntoView("
                + "new UiSelector().text(\"Proceed\"));"));
		
		selectMaritalStatusDropdown.click();
		new WebDriverWait(driver, 5).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.TextView[@text='"+ maritalStatus +"']"))).isDisplayed();
		driver.findElement(By.xpath("//android.widget.TextView[@text='"+ maritalStatus +"']")).click();
		
		highestEducationDropdown.click();
		new WebDriverWait(driver, 5).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.TextView[@text='"+ highestEducation +"']"))).isDisplayed();
		driver.findElement(By.xpath("//android.widget.TextView[@text='"+ highestEducation +"']")).click();
		
		instituteNameEntryField.type(instituteName);
		personalProfileProceedBtn.isVisible();
		personalProfileProceedBtn.click();
		
	}

}
