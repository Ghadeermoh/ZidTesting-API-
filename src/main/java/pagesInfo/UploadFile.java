package pagesInfo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UploadFile extends BaseClass {
	
	@FindBy (id="file-upload")
	WebElement chooseFile;
	
	@FindBy (id="file-submit")
	WebElement SubmitFile;
	public UploadFile() {
		PageFactory.initElements(driver, this);
	}
	
	public void checkUploadFile() {
		chooseFile.sendKeys("C:\\Users\\ghadeermoh\\Desktop\\studyplan.txt");
		SubmitFile.click();
	}

}
