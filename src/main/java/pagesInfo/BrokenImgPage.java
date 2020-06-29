package pagesInfo;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class BrokenImgPage extends BaseClass{
	
	public void CheckImgs() {
		List <WebElement> imgs=driver.findElements(By.tagName("img"));
		List <WebElement> Brokenimgs =new ArrayList<WebElement>();
		for(int i=1;i<imgs.size();i++) {
			if(imgs.get(i).getAttribute("href")==null) {
				Brokenimgs.add(imgs.get(i));
			}
		}
	System.out.println("broken imgs" +"="+Brokenimgs.size() );
	for(int x=1;x<Brokenimgs.size();x++) {
		System.out.println(Brokenimgs.get(x).getText());
	}
		
		
	}

}
