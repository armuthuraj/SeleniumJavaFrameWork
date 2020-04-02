package Test;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNGDemo2 {
	WebDriver driver = null;

	@BeforeTest

	public void setUpTest()
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}
	@Test
	public  void googleSearch2() {

		driver.get("https://google.com/");
		driver.findElement(By.name("q")).sendKeys("Charter Communication");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);


	}
	@Test
	public  void googleSearch3() {

		driver.get("https://google.com/");
		driver.findElement(By.name("q")).sendKeys("Charter Communication");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);


	}
	@AfterTest
	public void tearDownTest() {
		driver.close();
		driver.quit();
		System.out.println("Test Completed");
	}
}
/*What is TestNG

TestNG is a testing framework for the Java programming language created by Cédric Beust and inspired by JUnit and NUnit. 

Makes test creation, execution and reporting efficient

Uses annotations like

@BeforeTest, @AfterTest, 
@BeforeSuite, @AfterSuite
@BeforeMethod, @AfterMethos
@BeforeClass, @AfterClass

NG = Next Generation

Step 1 : Add TestNG plugin in Eclipse

Step 2 : Add TestNG libraries

Step 3 : Validate

Advantages of TestNG

Makes test creation, execution and reporting efficient
Helps in Grouping of tests
Helps in Prioritizing of tests
Parallel execution
Reporting

REFERENCES
https://testng.org/doc/index.html
https://github.com/cbeust/testng-eclipse/
https://en.wikipedia.org/wiki/TestNG
https://mvnrepository.com/
*/
/*test-output - folder you have seen in project because of testNG runs*/
/*expand test-output, click on index.html, will provide the html report for the latest run*/

/***********************************************************************************************************************************/
/*What is testng.xml
The configuration file in TestNG

Used to provide test execution settings
e.g.
include tests, class, packages etc
exclude tests, class, package etc
set test dependency
set test priorities
pass parameters to test methods
run in parallel*/

//Create TestNG test then right click on the class name , then select TestNG, Then select "convert to TestNG"
//we can email the report Using emailable-report.html (WHich is available under test-output folder)
/*If we are adding more classs in testng.xml then it will run in sequence if you want to run it 
in parallel then you have to udate the parallel type as class and update the thread count based on the system limits*/