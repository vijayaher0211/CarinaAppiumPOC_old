package com.demo.mobile.generalFunctions;
import java.io.File;
import java.io.IOException;

import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;

public class ImageExtract {
	
	public static String msg;
	
	public static String getToastMsg() {
		System.out.println("Inside getToast Method");
		Tesseract tesseract = new Tesseract();
        try {
    		System.out.println("Inside try block");
            tesseract.setDatapath("D:\\MF_Script\\MF_Script\\TrainingAtlas-master\\Tess4J\\tessdata");
    		System.out.println("Set Test Data");
            String text = tesseract.doOCR(new File("D:\\MF_Script\\MF_Script\\TrainingAtlas-master\\CaptureToastMsg\\1.png"));
    		System.out.println("Do OCR Method");
            System.out.print(text);
            
            if(text.contains("Please enter valid pincode"))
            {
            	msg = "Please enter valid pincode";
            }else {
            	msg = "Invalid message";
            }
        }
        catch (TesseractException e) {
            e.printStackTrace();
        }
		return msg;
    }

    public static void main(String[] args) {
    	String msg = getToastMsg();
    }
 }
   
