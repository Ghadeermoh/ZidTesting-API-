package pagesInfo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BaseClass{
	
	@FindBy (xpath="//a[contains(text(),'Dropdown')]")
	WebElement DrobdownBtn;
	@FindBy (xpath="//a[contains(text(),'Broken Images')]")
	WebElement BrokenImg;
	
	@FindBy (xpath="//a[contains(text(),'File Upload')]")
	WebElement UploadFile;
	
	public HomePage(){
		PageFactory.initElements(driver, this);
	}
	public String HomeTitle() {
		return driver.getTitle();
	}
	public DropDownPage OpenDropdownPage() {
		DrobdownBtn.click();
		return new DropDownPage();
	}
	
	public  BrokenImgPage OpenBrokenImgPage() {
		BrokenImg.click();
		return new BrokenImgPage();
	}
	public  UploadFile OpenUploadFilePage() {
		UploadFile.click();
		return new UploadFile();
	}
	
	

}
