import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class reports {
	 ExtentSparkReporter extentSparkReporter;
	   ExtentReports extentReports;

	   
	   
	   public void  settup()
	   {
		   extentSparkReporter = new ExtentSparkReporter("C://Users//Admin//eclipse-workspace//RestAsuredTest//extentReport.html");
		   extentSparkReporter.config().setDocumentTitle("Amruta's Report");
		   extentSparkReporter.config().setTheme(Theme.DARK);
		   
		   extentReports = new ExtentReports();
		   
		   extentReports.attachReporter(extentSparkReporter);
		   	   
		
	   }
	   
	   public void flush() {
	        // Flush the reports to the file
	        extentReports.flush();
	    }

	    public ExtentReports getExtentReports() {
	        return extentReports;
	    }
}
