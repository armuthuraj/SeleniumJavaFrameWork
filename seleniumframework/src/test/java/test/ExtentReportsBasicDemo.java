package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.GoogleSearchPage;

public class ExtentReportsBasicDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  // start reporters
		 ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("extentReports.html"); 
		 // create ExtentReports and attach reporter(s)
	        ExtentReports extent = new ExtentReports();
	        extent.attachReporter(htmlReporter);
	        // creates a toggle for the given test, adds all log events under it    
	        ExtentTest test = extent.createTest("Google Search Test", "this is for entering search keyword and hit enter");
	        WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
			// log(Status, details)
	        test.log(Status.INFO, "Starting Test Cases");
	        
			driver.get("https://google.com/");
			test.pass("Navigated to google.com");
			GoogleSearchPage.textbox_search(driver).sendKeys("Charter");
			test.pass("Search is entered");
			driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
			test.pass("submitted the search keyword");
			driver.close();
			test.info("Test is closed");
			  // calling flush writes everything to the log file
			/* // log with snapshot
        test.fail("details", MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build());
        
        // test with snapshot
        test.addScreenCaptureFromPath("screenshot.png");*/
	        extent.flush();
	}

}
/*
What is Extent Report

HTML Reporting library
ExtentReports is an open-source reporting API for Java and .NET. It creates an interactive HTML report of your test session.
ExtentReports also has a commercial version (Pro)

How to implement ExtentReports in Selenium Java

Step 1 : Add ExentReports libraries in project
You can add jars or maven dependency
Step 2 : Create references of ExtentReport func
Step 3 : Use ExtentReport functions
log, info, pass, fail etc
Step 4 : Run and Validate

REFERENCES
http://extentreports.com/docs/version...*/

//Upon running this program you will see the updated test result in "extendreprots.html" at the project level