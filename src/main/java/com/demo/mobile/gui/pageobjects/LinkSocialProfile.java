package com.demo.mobile.gui.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import com.demo.mobile.gui.page.LinkSocialProfileBasePage;
import com.qaprosoft.carina.core.foundation.utils.android.AndroidUtils;
import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType.Type;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;

import io.appium.java_client.MobileBy;

@DeviceType(pageType=Type.ANDROID_PHONE, parentClass = LinkSocialProfileBasePage.class)
public class LinkSocialProfile extends LinkSocialProfileBasePage{

	public LinkSocialProfile(WebDriver driver) {
		super(driver);
	}
	
	@FindBy (id="com.realmepay.payments:id/toolbar_title") public ExtendedWebElement knowWhatWeSharePageTitle;
	@FindBy (id="com.realmepay.payments:id/text_proceed") public ExtendedWebElement proceedBtn;
	@FindBy (xpath="//android.view.View[contains(@text,'Basic Details')]") public ExtendedWebElement basicDetailsTxt;
	@FindBy (xpath="//android.view.View[contains(@text,'EarlySalary')]") public ExtendedWebElement earlySalaryTxt;
	@FindBy (id="com.realmepay.payments:id/btn_google") public ExtendedWebElement googleIcon;
	@FindBy (id="com.realmepay.payments:id/btn_linkedin") public ExtendedWebElement linkdinIcon;
	@FindBy (id="com.realmepay.payments:id/btn_fb") public ExtendedWebElement facebookIcon;
	@FindBy (xpath="//android.widget.TextView[@text='Connect any one of your social profiles to go ahead.']") public ExtendedWebElement connectAnyOneTxt;
	@FindBy (xpath = "//android.support.v7.widget.RecyclerView//android.widget.TextView[@resource-id='com.google.android.gms:id/account_display_name']") public ExtendedWebElement selectGoogleAccount;
	@FindBy (id = "com.google.android.gms:id/main_title") public ExtendedWebElement chooseAccountTxt;
	
	public void selectGoogleAccount() {
		connectAnyOneTxt.isVisible();
		googleIcon.isVisible();
		googleIcon.click();
		chooseAccountTxt.isVisible();
		selectGoogleAccount.click();
	}
	
	public String getText() {
		basicDetailsTxt.isVisible();
		return knowWhatWeSharePageTitle.getText();
	}
	
	public void clickOnProceed() {
		
		earlySalaryTxt.isVisible();
		
		driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector()"
                + ".scrollable(true)).scrollIntoView("
                + "new UiSelector().textContains(\"Privacy Policy\"));"));
		
		proceedBtn.isVisible();
		proceedBtn.click();
	}

}
