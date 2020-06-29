package pageTests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pagesInfo.BaseClass;
import pagesInfo.BrokenImgPage;
import pagesInfo.HomePage;

public class BrokenImgsTest extends BaseClass {
	public HomePage home_page;
	public BrokenImgPage brokenimg_page;
	public BrokenImgsTest() {
		super();
	}
	
	@BeforeMethod
	public void Setup() {
		init();
		home_page=new HomePage();
		brokenimg_page =home_page.OpenBrokenImgPage();
	}
	
	@Test
	public void CheckImgsBroken() {
		brokenimg_page.CheckImgs();
	}
	
	@AfterMethod
	public void quit() {
		driver.quit();
	}

}
