package com.demo.mobile.gui.pageobjects;

import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import com.demo.mobile.gui.page.TestBasePage;
import com.qaprosoft.carina.core.foundation.AbstractTest;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;

public class Test extends TestBasePage{
	
	public Test(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(id="com.hdfcfund.investor.uat:id/tv_title") ExtendedWebElement newFolioCreationTxt;
	@FindBy(id="com.hdfcfund.investor.uat:id/radioButtonSelf") ExtendedWebElement selfRadioBtn;
	@FindBy(id="com.hdfcfund.investor.uat:id/radioButtonMinor") ExtendedWebElement minorRadioBtn;
	@FindBy(id="com.hdfcfund.investor.uat:id/radioButtonAnyOne") ExtendedWebElement anyoneOrSurvivorRadioBtn;
	@FindBy(id="com.hdfcfund.investor.uat:id/radioButtonSingle") ExtendedWebElement singleRadioBtn;
	@FindBy(id="com.hdfcfund.investor.uat:id/tv_label_proceed") ExtendedWebElement newFolioCreationProceedBtn;
	
	@FindBy(id="com.hdfcfund.investor.uat:id/tv_label_income_details") ExtendedWebElement incomeDetailsTxt;
	@FindBy(id="com.hdfcfund.investor.uat:id/et_annual_income") ExtendedWebElement grossAnnualIncomeDropdown;
	@FindBy(id="com.hdfcfund.investor.uat:id/et_net_worth") ExtendedWebElement netWorthEntryField;
	@FindBy(id="com.hdfcfund.investor.uat:id/rd_pe") ExtendedWebElement investorIsPolticallyExposedPersonRadioBtn;
	@FindBy(id="com.hdfcfund.investor.uat:id/rd_none") ExtendedWebElement notApplicableRadioBtn;
	@FindBy(id="com.hdfcfund.investor.uat:id/rd_related_to_pe") ExtendedWebElement investorIsRelatedToPolticallyExposedPersonRadioBtn;
	@FindBy(id="com.hdfcfund.investor.uat:id/tv_label_previous") ExtendedWebElement previousBtn;
	@FindBy(id="com.hdfcfund.investor.uat:id/tv_label_next") ExtendedWebElement nextBtn;
	
	@FindBy(id="com.hdfcfund.investor.uat:id/tv_label_fatca") ExtendedWebElement fatcaTxt;
	@FindBy(id="com.hdfcfund.investor.uat:id/et_city_of_birth") ExtendedWebElement cityOfBirthEntryField;
	@FindBy(id="com.hdfcfund.investor.uat:id/et_address_type") ExtendedWebElement addressTypeDropdown;
	
	@FindBy(id="com.hdfcfund.investor.uat:id/tv_label_tax_info") ExtendedWebElement payingTaxInCountryTxt;
	@FindBy(id="com.hdfcfund.investor.uat:id/rd_re_no") ExtendedWebElement noNotPayingBtn;
	@FindBy(id="com.hdfcfund.investor.uat:id/rd_re_yes") ExtendedWebElement yesAddTaxResidencyBtn;
	
	@FindBy(id="com.hdfcfund.investor.uat:id/tv_label_nominee") ExtendedWebElement doYouWishToAddNomineeTxt;
	@FindBy(id="com.hdfcfund.investor.uat:id/rd_nominee_yes") ExtendedWebElement yesAddNomineeBtn;
	@FindBy(id="com.hdfcfund.investor.uat:id/rd_nominee_no") ExtendedWebElement noAddLaterBtn;
	
	@FindBy(id="com.hdfcfund.investor.uat:id/tv_title") ExtendedWebElement addNomineeTxt;
	@FindBy(id="com.hdfcfund.investor.uat:id/et_nominee_name") ExtendedWebElement nomineeNameEntryField;
	@FindBy(id="com.hdfcfund.investor.uat:id/et_proportion") ExtendedWebElement proportionEntryField;
	@FindBy(id="com.hdfcfund.investor.uat:id/et_dob") ExtendedWebElement dobEntryField;
	@FindBy(id="com.hdfcfund.investor.uat:id/et_relationship") ExtendedWebElement relationshipWithApplicant;
	@FindBy(id="com.hdfcfund.investor.uat:id/et_guardian_name") ExtendedWebElement guardianNameEntryField;
	@FindBy(id="com.hdfcfund.investor.uat:id/et_address1") ExtendedWebElement addressLine1EntrField;
	@FindBy(id="com.hdfcfund.investor.uat:id/et_address2") ExtendedWebElement addressLine2EntrField;
	@FindBy(id="com.hdfcfund.investor.uat:id/et_country") ExtendedWebElement countryDropdown;
	@FindBy(id="com.hdfcfund.investor.uat:id/et_state") ExtendedWebElement stateEntryField;
	@FindBy(id="com.hdfcfund.investor.uat:id/et_city") ExtendedWebElement cityEntryField;
	@FindBy(id="com.hdfcfund.investor.uat:id/et_zip") ExtendedWebElement postalCodeEntryField;
	@FindBy(id="com.hdfcfund.investor.uat:id/tv_label_next") ExtendedWebElement doneBtn;
	
	@FindBy(id="com.hdfcfund.investor.uat:id/et_ifsc") ExtendedWebElement ifscCodeEntryField;
	@FindBy(id="com.hdfcfund.investor.uat:id/tv_search") ExtendedWebElement searchBtn;
	@FindBy(id="com.hdfcfund.investor.uat:id/cv_scheme_details") ExtendedWebElement selectBankDetails;
	@FindBy(id="com.hdfcfund.investor.uat:id/et_account_number") ExtendedWebElement accountNumberEntryField;
	@FindBy(id="com.hdfcfund.investor.uat:id/et_verify_account_number") ExtendedWebElement verifyAccountNumberEntryField;
	@FindBy(id="com.hdfcfund.investor.uat:id/iv_upload") ExtendedWebElement uploadChequeLeaf;
	@FindBy(xpath="//android.widget.TextView[@text='Gallery']") ExtendedWebElement galaryBtn;
	@FindBy(id="android:id/button1") ExtendedWebElement okBtn;
	@FindBy(id="com.android.packageinstaller:id/permission_allow_button") ExtendedWebElement allowBtn;
	@FindBy(xpath="(//android.support.v7.widget.RecyclerView//android.widget.LinearLayout)[1]") ExtendedWebElement selectImage;
	@FindBy(xpath="//android.widget.TextView[@text='Review']") ExtendedWebElement reviewBtn;
	@FindBy(xpath="//android.widget.TextView[@text='Submit']") ExtendedWebElement submitBtn;
	
	@FindBy(id="com.hdfcfund.investor.uat:id/tv_message") ExtendedWebElement addBankDetailsMsg;
	@FindBy(id="com.hdfcfund.investor.uat:id/btn_ok") ExtendedWebElement addBankDetailsOkBtn;
	
	
	
	public void newFolioCreation(String folioCreation, String selectModeOfHolding) {
		
		if(folioCreation.equalsIgnoreCase("self")) {
			selfRadioBtn.click();
		}else {
			minorRadioBtn.click();
		}
		
		if(selectModeOfHolding.equalsIgnoreCase("single")) {
			singleRadioBtn.click();
		}else {
			anyoneOrSurvivorRadioBtn.click();
		}
		
		newFolioCreationProceedBtn.click();	
	}
	
	public void incomeDetails(String grossAnnualIncome, String politicallyExposedStatus) {
		
		incomeDetailsTxt.isVisible();
		grossAnnualIncomeDropdown.click();
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {}
		
		driver.findElement(By.xpath("//android.widget.CheckedTextView[@text='"+grossAnnualIncome+"']")).click();
		
		//swipe code
		//pls put swipr code
		
		
		if(politicallyExposedStatus.equalsIgnoreCase("not applicable")) {
			notApplicableRadioBtn.click();
		}else if (politicallyExposedStatus.contains("related")) {
			investorIsRelatedToPolticallyExposedPersonRadioBtn.click();
		}else {
			investorIsPolticallyExposedPersonRadioBtn.click();
		}
		
		nextBtn.click();
		
	}
	
	public void fatcaInformation(String cityOfBirth, String addressType) {
		
		fatcaTxt.isVisible();
		cityOfBirthEntryField.type(cityOfBirth);
		addressTypeDropdown.click();
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {}
		
		driver.findElement(By.xpath("//android.widget.CheckedTextView[@text='"+addressType+"']")).click();
		
		nextBtn.click();
	
	}
	
	public void payingTax(String payingTaxInOtherCountry) {
		
		payingTaxInCountryTxt.isVisible();
		
		if(payingTaxInOtherCountry.equalsIgnoreCase("no")) {
			noNotPayingBtn.click();
		}else {
			yesAddTaxResidencyBtn.click();
		}
		
		nextBtn.click();
	}
	
	public void addNominee(String addNominee, String nomineeName, String proportion,String dob, String relationWithApplicant, 
			String addressLine1, String addressLine2, String country, String state,String city, String postalEntryCode,String guardianName) {
		
		doYouWishToAddNomineeTxt.isVisible();
		if(addNominee.equals("yes")) {
			yesAddNomineeBtn.click();
			addNomineeTxt.isVisible();
			nomineeNameEntryField.type(nomineeName);	
			proportionEntryField.type(proportion);
			dobEntryField.type(dob);
			
			relationshipWithApplicant.click();
			
			guardianNameEntryField.type(guardianName);
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {}
			driver.findElement(By.xpath("//android.widget.CheckedTextView[@text='"+ relationWithApplicant +"']")).click();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {}
			
			//put swipe code 
			
			addressLine1EntrField.type(addressLine1);
			addressLine2EntrField.type(addressLine2);
			countryDropdown.click();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {}
			driver.findElement(By.xpath("//android.widget.CheckedTextView[@text='"+ country +"']")).click();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {}
			
			stateEntryField.type(state);
			cityEntryField.type(city);
			postalCodeEntryField.type(postalEntryCode);
			doneBtn.click();
			
		}else {
			noAddLaterBtn.click();
		}
		nextBtn.click();
	}
	
	public void enterBankDetails(String ifscNumber, String accountNumber) {
		
		try {
			addBankDetailsMsg.isVisible();
			addBankDetailsOkBtn.click();
		}catch(NoSuchElementException e) {
			e.printStackTrace();
		}
		
		ifscCodeEntryField.click();
		ifscCodeEntryField.type(ifscNumber);
		searchBtn.click();
		selectBankDetails.click();
		
		//swipe code
		
		accountNumberEntryField.type(accountNumber);
		verifyAccountNumberEntryField.type(accountNumber);
		
		uploadChequeLeaf.click();
		
		galaryBtn.click();
		
		try {
			okBtn.isVisible();
			okBtn.click();
			allowBtn.click();
		}catch(NoSuchElementException e){
			e.printStackTrace();
		}
		
		selectImage.click();
		
		reviewBtn.isVisible();
		reviewBtn.click();
		
		submitBtn.isVisible();
		submitBtn.click();
	
	}
	
	
	
}