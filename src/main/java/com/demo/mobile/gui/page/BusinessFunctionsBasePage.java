package com.demo.mobile.gui.page;

import org.openqa.selenium.WebDriver;
import com.qaprosoft.carina.core.gui.AbstractPage;

public abstract class BusinessFunctionsBasePage extends AbstractPage{
	public BusinessFunctionsBasePage(WebDriver driver) {
        super(driver);
        // TODO Auto-generated constructor stub
    }
	public abstract void selectPlusSign();
	public abstract void selectMenuOption(String menuOption);
	public abstract void folioSelection(String sFolioNo);
	public abstract void schemeSelection(String schemeVal,String sDividentOption);
	public abstract void clickOnProceed() ;
	
	public abstract void SelectRedumptionType(String sRedumtionType,String sValue);
	public abstract void ClickOnNext() ;
	public abstract void SelectBank(String sBankName);
	public abstract void ClickOnReview();
	public abstract String[] VpsRedemptionSummary(String sRedumtionType) ;
	public abstract String valSuccessMsgRedemption() ;
	public abstract void agreeTnC();
	
}
