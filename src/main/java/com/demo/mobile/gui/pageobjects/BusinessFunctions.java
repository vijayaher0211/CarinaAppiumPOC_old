package com.demo.mobile.gui.pageobjects;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import static java.time.Duration.ofMillis;

import java.util.NoSuchElementException;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import static io.appium.java_client.touch.WaitOptions.waitOptions;
import static io.appium.java_client.touch.offset.PointOption.point;

import com.demo.mobile.gui.page.BusinessFunctionsBasePage;
import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType.Type;

@DeviceType(pageType=Type.ANDROID_PHONE, parentClass=BusinessFunctionsBasePage.class)
public class BusinessFunctions extends BusinessFunctionsBasePage {
	
	public BusinessFunctions(WebDriver driver) {
        super(driver);    
    }
	
	//common declaration
	@FindBy(id = "com.hdfcfund.investor.uat:id/fab_home")
	private ExtendedWebElement btn_plus;
  
	@FindBy(id = "com.hdfcfund.investor.uat:id/tv_label_purchase")
	private ExtendedWebElement opt_Purchase;
	
	@FindBy(id = "com.hdfcfund.investor.uat:id/tv_label_sip")
	private ExtendedWebElement opt_sip;
	
	@FindBy(id = "com.hdfcfund.investor.uat:id/tv_label_redemption")
	private ExtendedWebElement opt_redumtion;

	@FindBy(id = "com.hdfcfund.investor.uat:id/et_folio_number")
	private ExtendedWebElement dd_selectFolio;
	
//	@FindBy(xpath = "//XCUIElementTypeButton[@name='OK']")
//	private ExtendedWebElement btnOk;
	
//	@FindBy(xpath = "//XCUIElementTypeButton[@name='Done']")
//	private ExtendedWebElement btnDone;
	
	@FindBy(id = "com.hdfcfund.investor.uat:id/tv_label_proceed")
	private ExtendedWebElement btnProceed;
	
	@FindBy(id = "com.hdfcfund.investor.uat:id/rd_amount")
	private ExtendedWebElement rbtnRedAmount;
	
	@FindBy(id = "com.hdfcfund.investor.uat:id/rd_all_units")
	private ExtendedWebElement rbtnAllFreeUnits;
	
	@FindBy(id = "com.hdfcfund.investor.uat:id/rd_no_of_units")
	private ExtendedWebElement rbtnNoOfUnits;
	
	@FindBy(id = "com.hdfcfund.investor.uat:id/et_amount")
	private ExtendedWebElement txtRedAmount;
	
	@FindBy(xpath = "com.hdfcfund.investor.uat:id/et_amount")
	private ExtendedWebElement txtRedUnits;
	
	@FindBy(id = "com.hdfcfund.investor.uat:id/et_bank_name") 
	private ExtendedWebElement dd_SelectBank;

	//with distributor
//	@FindBy(xpath = "//XCUIElementTypeTextField")
//	private ExtendedWebElement txt_BrokerARNno;

	@FindBy(id = "com.hdfcfund.investor.uat:id/et_sub_broker_arn")
	private ExtendedWebElement txt_SubBrokerARNno;

	@FindBy(id = "com.hdfcfund.investor.uat:id/et_sub_broker_code")
	private ExtendedWebElement txt_SubBrokerCode;

	//EUIN
//	@FindBy(xpath = "//XCUIElementTypeButton[@name='EUIN']")
//	private ExtendedWebElement rbtn_EUIN;

	@FindBy(id = "com.hdfcfund.investor.uat:id/et_select_euin_no")
	private ExtendedWebElement dd_EUINno;

//	@FindBy(xpath="//androidx.appcompat.widget.g[contains(text(),'Richa Tripathi-E030803')]")
//	private ExtendedWebElement value_ddEUINno;

	//EUIN declaration
//	@FindBy(xpath = "//XCUIElementTypeButton[@name='Self Declaration']") 
//	private ExtendedWebElement rbtn_EUINDeclaration;
	
//	@FindBy(xpath = "//XCUIElementTypeButton[@name='ic checkboxNormal']") 
//	private ExtendedWebElement chkbx_declaration;
	
//	@FindBy(xpath = "//XCUIElementTypeButton[@name='Proceed']")
//	private ExtendedWebElement btn_Proceed_MakePurchase;

	@FindBy(id = "com.hdfcfund.investor.uat:id/et_scheme_name")
	private ExtendedWebElement dd_schemeName;

//	@FindBy(xpath = "//XCUIElementTypeStaticText[@name='Select Scheme']")
//	private ExtendedWebElement btn_searchScheme;

//	@FindBy(xpath = "//XCUIElementTypeSearchField")
//	private ExtendedWebElement txt_schemeName;

	//if dividend is there

	@FindBy(id = "com.hdfcfund.investor.uat:id/rd_re_invest")
	private ExtendedWebElement rbtn_reInvest;

	@FindBy(xpath = "com.hdfcfund.investor.uat:id/rd_payout")
	private ExtendedWebElement rbtn_payout;

//	@FindBy(xpath = "//XCUIElementTypeTextField[@value='Investment Amount']")
//	private ExtendedWebElement txt_InvestmentAmt;

	@FindBy(id = "com.hdfcfund.investor.uat:id/tv_label_review")
	private ExtendedWebElement btn_review;
   
	@FindBy(xpath = "com.hdfcfund.investor.uat:id/tv_ok")
	private ExtendedWebElement btnOk_ImpMsg;
	
//	@FindBy(xpath = "//XCUIElementTypeButton[@name='Submit']") 
//	private ExtendedWebElement btn_Submit;
	
//	@FindBy(xpath = "//XCUIElementTypeButton[@name='No']") //Aniket
//    private ExtendedWebElement rbtn_InvstrThrDistrNo;   //Aniket
//	
//	@FindBy(xpath = "//XCUIElementTypeButton[@name='No']") //Aniket
//    private ExtendedWebElement txt_ErrorMessageForMinAmt;   //Aniket
	
//	@FindBy(xpath = "//XCUIElementTypeButton[@name='Proceed to Pay']")
//	private ExtendedWebElement btn_proceedToPay;
	
	@FindBy(id = "com.hdfcfund.investor.uat:id/tv_ok")
	private ExtendedWebElement btnAgree;
	
	@FindBy(xpath = "com.hdfcfund.investor.uat:id/tv_label_next")
	private ExtendedWebElement btnNext;
	
	@FindBy(xpath = "com.hdfcfund.investor.uat:id/ll_complete_transaction")
	private ExtendedWebElement btnCompleteTransaction;
	

	///vps
//	@FindBy(xpath = "//XCUIElementTypeTable/XCUIElementTypeCell/XCUIElementTypeStaticText")
//	private ExtendedWebElement vpDistrYesNo;
	
	@FindBy(id = "com.hdfcfund.investor.uat:id/tv_folio_no")
	private ExtendedWebElement vpFolioNo;
	
	@FindBy(id = "com.hdfcfund.investor.uat:id/tv_source_scheme")
	private ExtendedWebElement vpSchemeName;
	
//	@FindBy(xpath = "//XCUIElementTypeStaticText[@name='Investment Amount']/following-sibling::XCUIElementTypeStaticText")
//	private ExtendedWebElement VpAmount;
	
	@FindBy(id = "com.hdfcfund.investor.uat:id/tv_label_success_header")
	private ExtendedWebElement vpSucMsgRed;
	
	//vps for redemption
	@FindBy(id = "com.hdfcfund.investor.uat:id/tv_source_scheme")
	private ExtendedWebElement vpScheme;
	
	@FindBy(id = "com.hdfcfund.investor.uat:id/tv_redeemption_unit_amount")
	private ExtendedWebElement vpRedAmt;
	
	@FindBy(id = "com.hdfcfund.investor.uat:id/tv_label_redeemption_unit_amount")
	private ExtendedWebElement vpRedUnit;
	
	@FindBy(id = "com.hdfcfund.investor.uat:id/tv_bank_name")
	private ExtendedWebElement vpBankName;
	
	@FindBy(id="com.hdfcfund.investor.uat:id/tv_ok")
	private ExtendedWebElement importantImformationOkBtn;
	

	//Click on + sign
	public void selectPlusSign(){
		btn_plus.isElementPresent(1000);
		btn_plus.click();
	}
	
	public void selectMenuOption(String menuOption){
		  try{
		  switch(menuOption) {
		  case "Purchase" : 
			  opt_Purchase.click();
			  break;
		  
		  case "SIP" :
			  opt_sip.click();
			  break;
			 
		  case "Redemption" :
		      opt_redumtion.click();
		      break;
		      	  
		  }
		  }catch(Exception e){
			throw e;
		  }
	}
	
	public void folioSelection(String sFolioNo){
		dd_selectFolio.isPresent(1000);
//		dd_selectFolio.click();
		dd_selectFolio.type(sFolioNo);
//		driver.findElement(By.className("XCUIElementTypePickerWheel")).sendKeys(sFolioNo); 
//	    btnDone.click();
	}
	
	public void schemeSelection(String schemeVal,String sDividentOption){
		dd_schemeName.isPresent();
		dd_schemeName.click();
		
//		txt_schemeName.type(schemeVal);
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {}
		
		driver.findElement(By.xpath("//android.widget.TextView[contains(@text,'"+schemeVal+"')]")).click();
		
//		driver.findElement(By.xpath("//XCUIElementTypeStaticText[@name='"+schemeVal+"']")).click();
		
		if(schemeVal.contains("Dividend")) {
			if(sDividentOption.equalsIgnoreCase("Re-Invest")) {
				rbtn_reInvest.click();
			}
			if(sDividentOption.equalsIgnoreCase("Payout")) {
				rbtn_payout.click();
			}
		}
	    
	}
	
	
	public void clickOnProceed() {
		btnProceed.click();
	}
	
	public void SelectRedumptionType(String sRedumtionType,String sValue){
		rbtnRedAmount.isPresent(1000);
		switch (sRedumtionType) {
		case "Amount":
			rbtnRedAmount.click();
			txtRedAmount.type(sValue);
//			driver.findElement(MobileBy.iOSNsPredicateString("name=='Return' or name='Done'")).click();
			break;
		case "All Free Units":
			rbtnAllFreeUnits.click();
			break;
		case "No. Of Units":
			rbtnNoOfUnits.click();
			txtRedUnits.type(sValue);
//			driver.findElement(MobileBy.iOSNsPredicateString("name=='Return' or name='Done'")).click();
			break;
		}
	}
	
	public void ClickOnNext() {
		btnNext.click();
	}
	public void SelectBank(String sBankName){
		
		try {
			importantImformationOkBtn.clickIfPresent(5);
		}catch(NoSuchElementException e) {
			e.printStackTrace();
		}
		
		dd_SelectBank.isPresent();
//		dd_SelectBank.click();
		dd_SelectBank.type(sBankName);
		
//		driver.findElement(By.className("XCUIElementTypePickerWheel")).sendKeys(sBankName); 
//	    btnDone.click();
	}
	
	public void ClickOnReview() {
		btn_review.click();
        if(btnOk_ImpMsg.isPresent(5000)) {
        	btnOk_ImpMsg.click();
        }
	}
	
	public String[] VpsRedemptionSummary(String sRedumtionType) {
		String[] arrVps = new String[4];
		arrVps[0] = vpFolioNo.getText();
		arrVps[1] = vpScheme.getText();
		switch (sRedumtionType) {
		case "Amount":
			arrVps[2] = vpRedAmt.getText().split("  ")[1];
			break;
		case "All Free Units":
			arrVps[2] = vpRedUnit.getText();
			break;
		case "No. Of Units":
			arrVps[2] = vpRedUnit.getText();
			break;
		}
		arrVps[3] = vpBankName.getText();
		return arrVps;
	}
	
	public void agreeTnC(){
		
		btnCompleteTransaction.click();
//		btn_Submit.click();
		//click on agree button
		btnAgree.click();
	}
	
	public String valSuccessMsgRedemption() {
		vpSucMsgRed.isPresent(5000);
		return vpSucMsgRed.getText();
	}
	
	/*public void distributorFlag(String distFlag, String sEUINno){
		Switch(distFlag){
		 Case "y":
			 txt_BrokerARNno.type(sBrokerARNno);
				//enter sub broker ARN (optional)
				txt_SubBrokerARNno.type(sSubBrokerARNno);
				//enter sub Broker code(optional)
				txt_SubBrokerCode.type(sSubBrokerCode);
				rbtn_EUIN.click();
				dd_EUINno.isElementPresent(1000);
					WebDriver drv = getDriver();
					 if (drv instanceof EventFiringWebDriver) {
						 drv = ((EventFiringWebDriver) drv).getWrappedDriver();
					 }
					   @SuppressWarnings("unchecked")
					   AndroidDriver<MobileElement> driver = (AndroidDriver<MobileElement>) drv;
						Dimension size = driver.manage().window().getSize();
					   int anchor = (int) (size.width * 0.5);
					  int startPoint = (int) (size.height * 0.7);
					  int endPoint = (int) (size.height * 0.3);
					   new TouchAction(driver)
							.press(point(anchor, startPoint))
							.waitAction(waitOptions(ofMillis(1000)))
							.moveTo(point(anchor, endPoint))
							.release().perform();
					dd_EUINno.click();
					dd_EUINno.click();
					//select expected EUIN no
					driver.findElement(By.xpath("//android.widget.CheckedTextView[contains(@text,'"+sEUINno+"')]")).click();;
				}
				if(sEUIN_option.equalsIgnoreCase("EUIN Declaration")) {
					//select radio button as EUIN declaration
					rbtn_EUINDeclaration.click();
					//check the declaration check box
					chkbx_declaration.click();
				}
				btn_Proceed_MakePurchase.click();
			break;
		 Case "n":
               rbtn_InvstrThrDistrNo.click();  
			   btn_Proceed_MakePurchase.click();
			   break;		
		}
	*/


}
