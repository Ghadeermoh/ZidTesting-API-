package pageTests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import junit.framework.Assert;
import pagesInfo.BaseClass;
import pagesInfo.DropDownPage;
import pagesInfo.HomePage;

public class HomePageTest extends BaseClass{
	
	public HomePage home_page;
	public DropDownPage dropdown_page;
	
	public HomePageTest() {
		super();
	}
	
	@BeforeMethod 
	public void Setup() {
		init();
		home_page=new HomePage();
		
	}
	
	@Test 
	public void TestHome() {
		String HomeTitle= home_page.HomeTitle();
		System.out.println(HomeTitle);
		Assert.assertEquals(" Internet",HomeTitle);
	}
	
//	@Test 
//	public void TestDrobdownLink() {
//		home_page=new HomePage();
//		dropdown_page=home_page.OpenDropdownPage();	
//	}
	
	@AfterMethod
	public void quit() {
		driver.quit();
	}

}
