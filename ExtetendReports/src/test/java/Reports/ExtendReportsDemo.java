package Reports;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Timestamp;  
import java.time.Instant;
import java.util.Scanner;  
public class ExtendReportsDemo {
	
	public ExtentHtmlReporter reporter;
	public ExtentReports reports;
	public ExtentTest test;
	public Scanner sc;
	public  String filepath;
	
	@BeforeClass
	public void extendReportsDemo() throws IOException {
		
		Timestamp instant= Timestamp.from(Instant.now());  
        System.out.println("from() method will return "+instant);  
       String timestamp= instant.toString();
       
       String advance=timestamp.replace(":", "_");
       
       System.out.println(advance);
       
        sc=new Scanner(System.in);
       System.out.println("enter file name");
      String nameenetered= sc.next();
       
       File f=new File("C:\\Users\\Sai\\git\\ExtendReports\\ExtetendReports\\"+nameenetered);
      if(f.mkdir()) {
    	  
    	   filepath=f.getAbsolutePath();
      
		System.out.println(filepath);
       //FileWriter file=new FileWriter("C:\\Users\\Sai\\git\\ExtendReports\\ExtetendReports\\Reports\\automation1.html");
      //File f=new File("C:\\Users\\Sai\\git\\ExtendReports\\ExtetendReports\\Reports\\automation.html");
     //  BufferedWriter writer=new BufferedWriter(new FileWriter(f));
      //if(f.createNewFile()) {
		//ExtentHtmlReporter reporter=new ExtentHtmlReporter(file);

      //FileWriter fstream = new FileWriter("log.txt",true);
    	  
    	  File input=new File(filepath+"\\"+nameenetered+advance+".html");
    	 if( input.createNewFile()) {
    		 System.out.println("created");
    	 }else {
    		 
    		 System.out.println("notcreated");
    	 }


		// reporter=new ExtentHtmlReporter("C:\\Users\\Sai\\git\\ExtendReports\\ExtetendReports\\automation"+nameenetered+".html");
 		 reporter=new ExtentHtmlReporter(input);

		 reports=new ExtentReports();
		reports.attachReporter(reporter);
		
		 test=reports.createTest("extendReportsDemo");
		test.info("login test");
		System.out.println("login");
	//}
      }else {
    	  System.out.println("folder not created");
    	  
    	 String names= f.getAbsolutePath();
    	 System.out.println(names);
    	 
    	 String h="\\";
    	// String a="\";
    	 
    	//String path=names.replaceAll("\",h);  	  
    	  if(f.exists()|| f.isDirectory()) {
    		  File input=new File("C:\\Users\\Sai\\git\\ExtendReports\\ExtetendReports\\"+nameenetered+"\\"+nameenetered+advance+".html");
    	    	 if( input.createNewFile()) {
    	    		 System.out.println("created");
    	    	 }else {
    	    		 
    	    		 System.out.println("notcreated");
    	    	 }


    			// reporter=new ExtentHtmlReporter("C:\\Users\\Sai\\git\\ExtendReports\\ExtetendReports\\automation"+nameenetered+".html");
    	 		 reporter=new ExtentHtmlReporter(input);

    			 reports=new ExtentReports();
    			reports.attachReporter(reporter);
    			
    			 test=reports.createTest("extendReportsDemo");
    			test.info("login test");
    			System.out.println("login");

    		  
    	  }
    	  
      }
	}
	
	@Test
	public void testMethod() {
		
		System.out.println("selenium webdriver");
		//test.addScreenCaptureFromPath("/)
		
		System.out.println("new file folder and path");
		
	//	reports.flush();
		
		reportClosingMethod();

		
	}
	
	@AfterClass
	public void reportClosingMethod() {
		
		try {
		
		reports.flush();
			sc.close();
		
		}catch(Exception e) {
			
			
		}finally {
			//reports.flush();

		}
		
		/*
		 * reports.flush(); sc.close();
		 */

	}

}
