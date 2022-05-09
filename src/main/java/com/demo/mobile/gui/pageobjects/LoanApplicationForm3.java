package com.demo.mobile.gui.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.demo.mobile.gui.page.LoanApplicationForm3BasePage;
import com.qaprosoft.carina.core.foundation.utils.android.AndroidUtils;
import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType.Type;
import com.qaprosoft.carina.core.foundation.webdriver.Screenshot;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;

import io.appium.java_client.MobileBy;

@DeviceType(pageType=Type.ANDROID_PHONE, parentClass=LoanApplicationForm3BasePage.class)
public class LoanApplicationForm3 extends LoanApplicationForm3BasePage{

	public LoanApplicationForm3(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(id = "com.realmepay.payments:id/edt_door_no") public ExtendedWebElement buildingNameEntryField;
	@FindBy(id = "com.realmepay.payments:id/edt_street_name") public ExtendedWebElement streetNameEntryField;
	@FindBy(id = "com.realmepay.payments:id/edt_landmark") public ExtendedWebElement landmarkEntryField;
	@FindBy(id = "com.realmepay.payments:id/edt_city") public ExtendedWebElement cityEntryField;
	@FindBy(id = "com.realmepay.payments:id/edt_state") public ExtendedWebElement stateEntryField;
	@FindBy(id = "com.realmepay.payments:id/edt_pincode") public ExtendedWebElement residentialPincodeEntryField;
	@FindBy(id = "com.realmepay.payments:id/spiner_residential_type") public ExtendedWebElement residentialTypeEntryField;
	@FindBy(id = "com.realmepay.payments:id/chkbox_es_consent") public ExtendedWebElement checkBox;
	@FindBy(id = "com.realmepay.payments:id/text_consent_es") public ExtendedWebElement confirmAuthenticity;
	@FindBy(id = "com.realmepay.payments:id/card_next_3") public ExtendedWebElement currentAddressProceedBtn;
	@FindBy(id="com.realmepay.payments:id/tv_title") public ExtendedWebElement congratulationsMsg;
	@FindBy(id="com.realmepay.payments:id/tv_proceed_appl") public ExtendedWebElement proceedWithApplicationBtn;
	@FindBy(id="com.realmepay.payments:id/iv_icon") public ExtendedWebElement congratulationsIcon;
	
	public void enterCurrentResidentialAddress(String buildingName,String streetName,String landmark,String city,String state,String residentialPinCode,String residentialType) {
		
		buildingNameEntryField.isVisible(60);
		buildingNameEntryField.type(buildingName);
		streetNameEntryField.type(streetName);
		landmarkEntryField.type(landmark);
		cityEntryField.type(city);
		stateEntryField.type(state);
		
		//swipe code
		driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector()"
                + ".scrollable(true)).scrollIntoView("
                + "new UiSelector().text(\"Proceed\"));"));
		
		residentialPincodeEntryField.isVisible();
		residentialPincodeEntryField.type(residentialPinCode);
		residentialTypeEntryField.click();
		new WebDriverWait(driver, 5).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.TextView[@text='"+ residentialType +"']"))).isDisplayed();
		driver.findElement(By.xpath("//android.widget.TextView[@text='"+ residentialType +"']")).click();
		confirmAuthenticity.isVisible();
		checkBox.click();
		currentAddressProceedBtn.click();
		
	}
	
	public String getCongratulationsMsg() {
			proceedWithApplicationBtn.isVisible();
			congratulationsIcon.isVisible();
			congratulationsMsg.isVisible();
			String SuccessMsg = congratulationsMsg.getText().replaceAll("\\s", "");
			return SuccessMsg;
	}
	
	public void proceedWithApplication() {
		proceedWithApplicationBtn.click();
	}

}
