package com.demo.mobile.generalFunctions;

import static com.qaprosoft.carina.core.foundation.utils.mobile.MobileUtils.getDriver;

import java.io.File;
import java.io.IOException;
import java.util.Calendar;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.qaprosoft.carina.core.foundation.AbstractTest;
import com.qaprosoft.carina.core.foundation.utils.android.AndroidUtils;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class GeneralFunctions {
	
//	public static WebDriver driver = getDriver();
	
	//Function to select Date of Birth - Calender Automation
	public static void selectBirthDate(String dob) {
		
		String[] arrOfStr = dob.split("-", 3);
		
		String date = arrOfStr[0];
		String month = arrOfStr[1];
		String year = arrOfStr[2];
		
		selectYear(year);
		selectMonth(month);
		selectDate(date);
	
	}
	
	//Function to select Year
	public static void selectYear(String year) {
		
		WebDriver drv = getDriver();
	    if (drv instanceof EventFiringWebDriver) {
	        drv = ((EventFiringWebDriver) drv).getWrappedDriver();
	    }
	    AndroidDriver<MobileElement> driver = (AndroidDriver<MobileElement>) drv;
//		String toastMsg = driver.findElement(By.xpath("//android.widget.Toast[@text='Please enter valid pincode']")).getText();
		
		for(int i = 0; i<30; i++) {
			
			boolean flag = false;
			
			try {
				flag = driver.findElement(By.xpath("//android.widget.TextView[@text='"+ year +"']")).isDisplayed();
			}catch(Exception e) {
//				System.out.println("Year not visible perform swipe operation");
			}
			
			if(flag) {
				driver.findElement(By.xpath("//android.widget.TextView[@text='"+ year +"']")).click();
				break;
			}else {
				
				Dimension dimension = driver.manage().window().getSize();
				int height = dimension.getHeight();
				int width = dimension.getWidth();
				
				int startx = width/2;
				int endx = width/2;
				int starty = height/2 - 300;
				int endy = height/2 + 300;
				
				AndroidUtils.swipe(startx, starty, endx, endy, 2000);
			}
		}
	}
	
	//Function to select Month
	public static void selectMonth(String month) {
		
		WebDriver drv = getDriver();
	    if (drv instanceof EventFiringWebDriver) {
	        drv = ((EventFiringWebDriver) drv).getWrappedDriver();
	    }
	    AndroidDriver<MobileElement> driver = (AndroidDriver<MobileElement>) drv;
		
		int given_month = Integer.parseInt(month);
		Calendar c = Calendar.getInstance();
	    int now_month = c.get(Calendar.MONTH) + 1;
	    
	    if(now_month>given_month){
	        int diff=now_month-given_month;
	        for(int j=0;j<diff;j++){
	            driver.findElement(By.id("android:id/prev")).click();
	        }
	    }else{
	        int diff=given_month-now_month;
	        for(int j=0;j<diff;j++){
	            driver.findElement(By.id("android:id/next")).click();
	        }
	    }
	}
	
	//Function to select Date
	public static void selectDate(String date) {
		
		WebDriver drv = getDriver();
	    if (drv instanceof EventFiringWebDriver) {
	        drv = ((EventFiringWebDriver) drv).getWrappedDriver();
	    }
	    AndroidDriver<MobileElement> driver = (AndroidDriver<MobileElement>) drv;
		
		driver.findElement(MobileBy.AndroidUIAutomator(
				"new UiScrollable(new UiSelector().resourceId(\"android:id/month_view\")).scrollIntoView("
	                       + "new UiSelector().text(\""+date+"\"));")).click();
		
	}
	
}
