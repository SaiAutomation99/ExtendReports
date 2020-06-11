package ExtendReportsPackage;

import java.io.File;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;


public class ExtendReportLearning {
	
	public ExtentTest test;
	
	@Test
	public void extendReport() {
	
	File f=new File("D:\\Study\\ExtentReport\\Extentreport.html");
	
	
	ExtentHtmlReporter html=new ExtentHtmlReporter(f); 
	
	ExtentReports report=new ExtentReports();
	report.attachReporter(html);
	
	
	 test=report.createTest("google test", "verifying google");
	
	System.out.println("google invoked");
	
	 test.log(Status.INFO, "google invoked");
	 test.pass("passed");
	 
	 report.flush();	
	}
	

}
