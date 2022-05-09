package com.demo.tests;

import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.Reporter;

import com.demo.mobile.gui.page.HomeScreenBasePage;
import com.demo.mobile.gui.page.LinkSocialProfileBasePage;
import com.demo.mobile.gui.page.LoanApplicationForm1BasePage;
import com.demo.mobile.gui.page.LoanApplicationForm2BasePage;
import com.demo.mobile.gui.page.LoanApplicationForm3BasePage;
import com.demo.mobile.gui.page.PersonalLoanBasePage;
import com.qaprosoft.carina.core.foundation.AbstractTest;
import com.qaprosoft.carina.core.foundation.dataprovider.annotations.XlsDataSourceParameters;
import com.qaprosoft.carina.core.foundation.utils.ownership.MethodOwner;
import com.qaprosoft.carina.core.foundation.webdriver.DriverHelper;
import com.qaprosoft.carina.core.foundation.webdriver.Screenshot;

public class DemoTest extends AbstractTest {
    
	private static final Logger LOGGER = Logger.getLogger(DriverHelper.class);
	private static Logger Log = Logger.getLogger(DriverHelper.class);
	
    @MethodOwner(owner = "Test")
    @Test(dataProvider = "DataProvider", description = "Personal Loan - Early Salary")
    @XlsDataSourceParameters(path = "xls/demo.xlsx", sheet = "ToastMsg", dsArgs = "LoanAmount,Tenure,NetIncome,DateOfBirth,PinCode,MobileNumberLinkedWithAadhaar,VerificationMsg", testRailColumn = "a")
    public void personalLoanEarlySalary(String loanAmount, String tenure,String netIncome, String dob,String pinCode, String linkedStatus, String verificationMsg) throws InterruptedException {

		Reporter.log("Personal Loan - Early Salary Test Started...");

		HomeScreenBasePage homeScreen = initPage(getDriver(), HomeScreenBasePage.class);
		Reporter.log("Home Screen Started...");
    	Assert.assertEquals(homeScreen.getText(), "Borrow");
    	Reporter.log("Assert - "+homeScreen.getText()+" Verified");
    	Screenshot.capture(getDriver(), "Personal Loan - Early Salary Test Started");
    	homeScreen.selectPersonalLoanOption();
    	Reporter.log("Home Screen Finished...");
    	
    	PersonalLoanBasePage personalLoan = initPage(getDriver(), PersonalLoanBasePage.class);
    	Reporter.log("Personal Loan Screen Started...");
    	Assert.assertEquals(personalLoan.getText(), "Personal Loan");
    	Reporter.log("Assert - "+personalLoan.getText()+" Verified");
    	Reporter.log("Personal Loan Assertion Passed");
    	personalLoan.enterLoanDetails(loanAmount,tenure,netIncome);
    	String toastMsg = personalLoan.invalidPincode(dob, pinCode, linkedStatus);
    	Assert.assertEquals(toastMsg, verificationMsg);
    	Reporter.log("Personal Loan Screen Finished...");
	    	
	    	/*LinkSocialProfileBasePage linkSocialProfile = initPage(getDriver(), LinkSocialProfileBasePage.class);
	    	Reporter.log("Link Social Profile Screen Started...");
	    	Assert.assertEquals(linkSocialProfile.getText(), "Know What We Share");
	    	Reporter.log("Assert - "+linkSocialProfile.getText()+" Verified");
	    	linkSocialProfile.clickOnProceed();
	    	linkSocialProfile.selectGoogleAccount();
	    	Reporter.log("Link Social Profile Screen Finished...");
	    	Reporter.log("Know What We Share Assertion Passed");
	    	
	    	LoanApplicationForm1BasePage loanApplication1 = initPage(getDriver(), LoanApplicationForm1BasePage.class);
	    	Reporter.log("Loan Application Form 1 Screen Started...");
	    	Assert.assertEquals(loanApplication1.getText(), "Share your details - easy&simple");
	    	Reporter.log("Assert - "+loanApplication1.getText()+" Verified");
	    	loanApplication1.enterPersonalProfileDetails(fatherName, motherName, gender, maritalStatus, highestEducation, instituteName);
	    	Reporter.log("Loan Application Form 1 Screen Finished...");
	    	
	    	LoanApplicationForm2BasePage loanApplication2 = initPage(getDriver(), LoanApplicationForm2BasePage.class);
	    	Reporter.log("Loan Application Form 2 Screen Started...");
	    	loanApplication2.enterProfessionalProfileDetails(companyName, designation, officeArea, officeCity, officePinCode, expYears, expMonths, panNumber);
	    	Reporter.log("Loan Application Form 2 Screen Finished...");
	    	
	    	LoanApplicationForm3BasePage loanApplication3 = initPage(getDriver(), LoanApplicationForm3BasePage.class);
	    	Reporter.log("Loan Application Form 3 Screen Started...");
	    	loanApplication3.enterCurrentResidentialAddress(buildingName,streetName,landmark,city,state,residentialPinCode,residentialType);
	    	Reporter.log("Loan Application Form 3 Screen Finished...");
	    	
	    	Assert.assertEquals(loanApplication3.getCongratulationsMsg(), "CongratulationsFirst!");
	    	Reporter.log("Assert - "+loanApplication3.getCongratulationsMsg()+" Verified");    	
	    	Screenshot.capture(getDriver(), "Personal Loan - Early Salary Test Passed");
	    	Reporter.log("Personal Loan - Early Salary Test Finished...");
	    	*/
    }
    
    

}