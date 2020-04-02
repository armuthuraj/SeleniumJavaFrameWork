package Test;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
//CMD + SHIFT + O for importing required class in to this program
public class ExtentReportTestNGDemo {
	ExtentReports extent;
	ExtentHtmlReporter htmlReporter;
	WebDriver driver;
	@BeforeSuite

	public void setUp() {
		// start reporters
		htmlReporter = new ExtentHtmlReporter("extentReportTestNG.html");

		// create ExtentReports and attach reporter(s)
		extent = new ExtentReports();
		extent.attachReporter(htmlReporter);
		driver=new ChromeDriver();

	}
	@Test
	public void test() throws IOException {
		driver.get("https://google.com");
		
		// creates a toggle for the given test, adds all log events under it    
		ExtentTest test = extent.createTest("MyFirstTest", "Sample description");
		test.pass("Google launched");
		// log(Status, details)
        test.log(Status.INFO, "This step shows usage of log(status, details)");

        // info(details)
        test.info("This step shows usage of info(details)");
        
        // log with snapshot
        test.fail("details", MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build());
        
        // test with snapshot
        test.addScreenCaptureFromPath("screenshot.png");

	}
	@Test
	public void test1() throws IOException {
		// creates a toggle for the given test, adds all log events under it    
		ExtentTest test = extent.createTest("MyFirstTest", "Sample description");
		
		// log(Status, details)
        test.log(Status.INFO, "This step shows usage of log(status, details)");

        // info(details)
        test.info("This step shows usage of info(details)");
        
        // log with snapshot
        test.pass("details", MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build());
        
        // test with snapshot
        test.addScreenCaptureFromPath("screenshot.png");

	}
	@AfterSuite
	public void tearDown() {
		driver.close();
		extent.flush(); //This is very important, without this statement, this will not write report

	}

}
//BeforeSUite & AfterSuite will only once in case if we have many test to run e.g test, test1, test2, test3, etc
