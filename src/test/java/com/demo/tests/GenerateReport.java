package com.demo.tests;

import org.automationtesting.excelreport.Xl;

public class GenerateReport {
	
	public static void main(String[] args) throws Exception
    {
		Xl.generateReport("excel-report.xlsx");
    }

}