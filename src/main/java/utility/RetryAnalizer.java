package utility;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalizer implements IRetryAnalyzer{
	   int count=0;
	   // number of times test case will be executed when it fails
	public boolean retry(ITestResult result) {
		
		 if (count <UtilClass.Retrylimit ) {
	    	 count++;
	    	 return true ;
	     }
	     else
	    	 
			return false;
		}
		
	}
