package pageTests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import junit.framework.Assert;
import pagesInfo.BaseClass;
import pagesInfo.DropDownPage;
import pagesInfo.HomePage;

public class DropdownPageTest extends BaseClass {
	
	public DropDownPage dropdown_page;
	public HomePage home_page;
	
	public DropdownPageTest() {
		super();
	}
	
	@BeforeMethod
	public void Setup() {
		init();
		home_page=new HomePage();
		dropdown_page=home_page.OpenDropdownPage();
	}
	
	@Test
	public void VerifyPageLabel() {
		
		Boolean label=dropdown_page.DrobdownPageLabel();
		Assert.assertTrue(label);
	}
	
	//pass value from xml file 
	@Test (priority =0)
	@Parameters ({"SelectOption"})
	public void SelectOptionDropdownBtn(String SelectOption) {
		dropdown_page.SelectFromBox(SelectOption);
	}
	
	@AfterMethod
	public void quit() {
		driver.quit();
	}

}
