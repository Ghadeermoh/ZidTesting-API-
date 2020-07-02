package pagesInfo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import utility.UtilClass;

public class BaseClass {
	public static WebDriver driver;
	public static Properties prop;
	
	public BaseClass(){
		prop=new Properties() ;
			FileInputStream IN;
			try {
				IN = new FileInputStream(UtilClass.config_path); //config data file path
				prop.load(IN);
			}catch (FileNotFoundException e) {
				e.printStackTrace();
			}catch (IOException e) {
				e.printStackTrace();
			}
	}
		
	
	public void init() {
		String browsername=prop.getProperty("browser");
		if (browsername.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", UtilClass.chrome_path);
			driver =new ChromeDriver();
		}
		else if (browsername.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver",UtilClass.firefox_path);  //give location of the driver we already downloaded 
			driver =new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(UtilClass.page_load,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(UtilClass.implicit_wait,TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));
		
	}
	

}
