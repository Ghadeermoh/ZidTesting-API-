package pagesInfo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class DropDownPage extends BaseClass {
	
	@FindBy (xpath="//h3[contains(text(),'Dropdown List')]")
	WebElement DropdownLabel;
	
	@FindBy (id="dropdown")
	WebElement DropdownBtn;
	
	
	public DropDownPage() {
		PageFactory.initElements( driver,this);
	}
	
	public boolean DrobdownPageLabel() {
		return DropdownLabel.isDisplayed();
		
	}
	
	public void SelectFromBox( String Option) {
		Select sel =new Select(DropdownBtn);
		sel.selectByVisibleText(Option);
		
	}
	

}
