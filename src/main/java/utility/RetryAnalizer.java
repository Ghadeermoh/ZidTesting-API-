package utility;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalizer implements IRetryAnalyzer{
	int count=0;
	int Retrylimit=1;   // number of times test case will be executed when it fails
	public boolean retry(ITestResult result) {
		
		 if (count <Retrylimit ) {
	    	 count++;
	    	 return true ;
	     }
	     else
	    	 
			return false;
		}
		
	}
