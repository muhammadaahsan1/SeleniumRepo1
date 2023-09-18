package com.Ahsan1.TestingNG;

import org.testng.annotations.DataProvider;

public class DataSupplier1DArray {
	
	@DataProvider
	public String[] dp1() {

	String[] data = new String[] {
	"Yadagiri",
	"Jhon",
	"Rebecca",
	"Smith"

	};
	return data;
	}

}
