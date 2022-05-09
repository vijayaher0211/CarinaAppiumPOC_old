package com.demo.mobile.generalFunctions;
//package MavenProject;

import java.io.File;
import java.io.IOException;


import net.sourceforge.tess4j.ITesseract;
import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;

public class captchaAutomation {

//	private static String src ="";
	
	public static void main(String[] args) throws InterruptedException, TesseractException, IOException {

		
		String path = "C:\\Users\\Lalit Rajopadhye\\Desktop\\Screenshots\\1.png";
		
		
//		FileHandler.copy(src, new File(path));
		
		ITesseract Te = new Tesseract();
				
		Te.setDatapath("D:\\Tess4J\\tessdata");
		
//		Te.setDatapath("C:\\Users\\Lalit Rajopadhye\\Downloads\\CaptchaAutomation\\CaptchaAutomation\\tessdata");
		
		Te.setLanguage("eng");
		
		String img = Te.doOCR(new File(path));
		
		System.out.println(img);
		
	}

}
