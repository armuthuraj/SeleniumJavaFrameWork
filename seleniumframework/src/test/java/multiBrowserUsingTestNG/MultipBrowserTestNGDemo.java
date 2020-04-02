package multiBrowserUsingTestNG;


import org.testng.annotations.Test;

import configuration.PropertiesFiles;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MultipBrowserTestNGDemo {
	WebDriver driver = null;
	
@Parameters("browser")
	@BeforeTest

	public void setUpTest(String browser)
	{
	System.out.println("Thread is "+Thread.currentThread().getId());
		System.out.println("Browser name is : "+browser);
		if (browser.equalsIgnoreCase("chrome")){
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		}
		else if (browser.equalsIgnoreCase("firefox")){
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			}
		else if (browser.equalsIgnoreCase("safari")){
			
			driver = new SafariDriver();
			}
	}
	@Test
	public  void googleSearch() throws InterruptedException {

		driver.get("https://google.com/");
		Thread.sleep(3000);
		


	}
	@AfterTest
	public void tearDownTest() {
		driver.close();
		driver.quit();
		System.out.println("Test Completed successfully");
	}
} 