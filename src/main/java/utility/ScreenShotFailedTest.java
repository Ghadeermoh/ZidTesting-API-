package utility;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;


import pagesInfo.BaseClass;

public class ScreenShotFailedTest extends BaseClass{
	
	public static void  When_fail() {
		File scrfile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(scrfile, new File("C:\\Users\\ghadeermoh\\eclipse-workspace\\TestAutomationUniveristy\\ScreenShot\\ScreenShot.png"));   //we shold add png
		} catch (IOException e) {
			e.printStackTrace();
		}
	        }


}
