package com.naukri.Tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.naukri.Base.Baseclass;
import com.naukri.Pages.Company_Details;
import com.naukri.Pages.Naukri_Datacollection_page;
import com.naukri.Utilities.Dataproviderdata;

public class Company_Details_Test extends Baseclass{
	
	Naukri_Datacollection_page naukri_datacollection_page;
	Company_Details company_details;

	public Company_Details_Test() throws Exception {
		super();
	}
	
	@BeforeMethod
	public void setup() throws Exception {
		initilization();
		naukri_datacollection_page=new Naukri_Datacollection_page();
		company_details=new Company_Details();
	}
	@DataProvider
	public Object[][] getdata() throws Exception {
		Object[][] data=Dataproviderdata.getexceldata();
		return data;
	}
	
	@Test(dataProvider="getdata")
	public void cdetails(String Technologies,String Location) throws Exception {
		company_details.company_details(Technologies,Location);
	}
	
	@AfterMethod
	public void teardown() {
	driver.quit();
	}

}
