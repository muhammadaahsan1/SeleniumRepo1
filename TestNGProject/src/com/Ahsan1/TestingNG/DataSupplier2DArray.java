package com.Ahsan1.TestingNG;

import org.testng.annotations.DataProvider;

public class DataSupplier2DArray {
	
	@DataProvider(name = "LoginDataProvider")

	public Object[][] LoginData(){

		   return new Object[][] {

		       { "Zoraiz", "Sub1" },

		       { "Alpha", "Sub2" },

		       { "Bravo", "Sub3" }

		   };

	}

}


