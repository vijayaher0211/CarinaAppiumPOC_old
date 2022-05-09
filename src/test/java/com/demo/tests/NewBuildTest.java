package com.demo.tests;

import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

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

public class NewBuildTest extends AbstractTest {
    
	private static final Logger LOGGER = Logger.getLogger(DriverHelper.class);
	
    @MethodOwner(owner = "Test")
    @Test(dataProvider = "DataProvider", description = "Personal Loan - Early Salary")
    @XlsDataSourceParameters(path = "xls/demo.xlsx", sheet = "DemoSheet", dsArgs = "LoanAmount,Tenure,NetIncome,DateOfBirth,PinCode,MobileNumberLinkedWithAadhaar,"
    		+ "FatherName,MotherName,Gender,MaritalStatus,HighestEducation,InstituteName,CompanyName,Designation,OfficeArea,OfficeCity,OfficePinCode,"
    		+ "ExperienceInYears,ExperienceInMonths,PANNumber,BuildingName,StreetName,Landmark,City,State,ResidentialPinCode,ResidentialType", testRailColumn = "a")
    public void personalLoanEarlySalary(String loanAmount, String tenure,String netIncome, String dob,String pinCode, String linkedStatus, String fatherName, 
    		String motherName, String gender, String maritalStatus, String highestEducation, String instituteName, String companyName, String designation, 
    		String officeArea, String officeCity, String  officePinCode, String expYears, String expMonths, String panNumber, String buildingName,
    		String streetName,String landmark, String city, String state, String residentialPinCode, String residentialType) throws InterruptedException {
    	
    		LOGGER.info("Test Case Started");
	    	HomeScreenBasePage homeScreen = initPage(getDriver(), HomeScreenBasePage.class);
	    	LOGGER.info("Home Screen Started...");
//	    	Assert.assertEquals(homeScreen.getText(), "Borrow");
	    	homeScreen.selectPersonalLoan();
	    	LOGGER.info("Home Screen Finished...");
	    	
	    	PersonalLoanBasePage personalLoan = initPage(getDriver(), PersonalLoanBasePage.class);
	    	LOGGER.info("Personal Loan Screen Started...");
//	    	Assert.assertEquals(personalLoan.getText(), "Personal Loan");
	    	personalLoan.enterLoanDetails(loanAmount,tenure,netIncome);
	    	personalLoan.enterPersonalDetails(dob,pinCode,linkedStatus);
	    	personalLoan.handleConfirmationPopup();
	    	LOGGER.info("Personal Loan Screen Finished...");
	    	
	    	
	    	/*LinkSocialProfileBasePage linkSocialProfile = initPage(getDriver(), LinkSocialProfileBasePage.class);
	    	LOGGER.info("Link Social Profile Screen Started...");
	    	Assert.assertEquals(linkSocialProfile.getText(), "Know What We Share");
	    	linkSocialProfile.clickOnProceed();
	    	linkSocialProfile.selectGoogleAccount();
	    	LOGGER.info("Link Social Profile Screen Finished...");
	    	
	    	LoanApplicationForm1BasePage loanApplication1 = initPage(getDriver(), LoanApplicationForm1BasePage.class);
	    	LOGGER.info("Loan Application Form 1 Screen Started...");
	    	Assert.assertEquals(loanApplication1.getText(), "Share your details - easy&simple");
	    	loanApplication1.enterPersonalProfileDetails(fatherName, motherName, gender, maritalStatus, highestEducation, instituteName);
	    	LOGGER.info("Loan Application Form 1 Screen Finished...");
	    	
	    	LoanApplicationForm2BasePage loanApplication2 = initPage(getDriver(), LoanApplicationForm2BasePage.class);
	    	LOGGER.info("Loan Application Form 2 Screen Started...");
	    	loanApplication2.enterProfessionalProfileDetails(companyName, designation, officeArea, officeCity, officePinCode, expYears, expMonths, panNumber);
	    	LOGGER.info("Loan Application Form 2 Screen Finished...");
	    	
	    	LoanApplicationForm3BasePage loanApplication3 = initPage(getDriver(), LoanApplicationForm3BasePage.class);
	    	LOGGER.info("Loan Application Form 3 Screen Started...");
	    	loanApplication3.enterCurrentResidentialAddress(buildingName,streetName,landmark,city,state,residentialPinCode,residentialType);
	    	LOGGER.info("Loan Application Form 3 Screen Finished...");
	    	
	    	Assert.assertEquals(loanApplication3.getCongratulationsMsg(), "CongratulationsFirst!");
	    	Screenshot.capture(getDriver(), "Personal Loan - Early Salary Test Passed");*/
	    	
    }

}