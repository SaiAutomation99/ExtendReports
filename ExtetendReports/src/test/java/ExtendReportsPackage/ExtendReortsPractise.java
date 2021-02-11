package ExtendReportsPackage;

import java.io.File;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtendReortsPractise {

	public static void main(String[] args) {
		
		
		
		File file=new File("D:\\Study\\ExtentReport\\Extentreport.html");
		
		ExtentHtmlReporter html=new ExtentHtmlReporter(file);
		
		ExtentReports report=new ExtentReports();
		
		report.attachReporter(html);
		
		ExtentTest test=	report.createTest("created");
		test.pass("passed");
		
		
		html.flush();

	}
}
