import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class log extends reports implements ITestListener {

	  private ExtentTest extentTest;

	    public void onTestStart(ITestResult result) {

	      //  extentTest.log(Status.INFO, "Test is starting: " + result.getName());
	    }

	    public void onTestSuccess(ITestResult result) {
	        extentTest.log(Status.PASS, "This test has passed: " + result.getName());
	    }

	    public void onTestFailure(ITestResult result) {
	        extentTest.log(Status.FAIL, "This test has failed: " + result.getName());
	    }

	    public void onStart(ITestContext context) {
	    	settup();
	        extentTest = getExtentReports().createTest(context.getName());

	       

	    }

	    public void onFinish(ITestContext context) {
	        System.out.println("Test finished");
	        flush(); // Ensure the report is flushed to the file
	    }
	
}
