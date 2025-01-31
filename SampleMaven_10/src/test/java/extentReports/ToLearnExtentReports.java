package extentReports;

import java.time.LocalDateTime;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ToLearnExtentReports {

	@Test
	public void createReport()
	
	{
		String timestamp = LocalDateTime.now().toString().replace(":", "-");
		
		// step :1 create an instance of ExtentSparkReporter
		
		ExtentSparkReporter spark = new ExtentSparkReporter("./HTML_Reports/"+timestamp+".html");
		
		//step :2 Create an instance of ExtentReports
		
		ExtentReports extReport = new  ExtentReports();
		
		//step:3 Attach extent sparker report to ExtentReport
		
		extReport.attachReporter(spark);
		
		//step :4 Create an instance of Extent Test
		
		ExtentTest test = extReport.createTest("createReport");
		 
		//step :5 Call log() to provide status and message
		
	test.log(Status.PASS, "message added into report");
	
	//step :6 call flush()

	extReport.flush();
	
	}
}
