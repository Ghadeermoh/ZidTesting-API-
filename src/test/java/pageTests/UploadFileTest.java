package pageTests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pagesInfo.BaseClass;
import pagesInfo.BrokenImgPage;
import pagesInfo.HomePage;
import pagesInfo.UploadFile;

public class UploadFileTest extends BaseClass {
	public HomePage home_page;
	public UploadFile uploadfile; 
	public UploadFileTest() {
		super();
	}
	
	@BeforeMethod
	public void Setup() {
		init();
		home_page=new HomePage();
		uploadfile =home_page.OpenUploadFilePage();
	}
	
	@Test
	public void uploadFile() {
		uploadfile.checkUploadFile();
	}

}
