package implicitAndExplicitWait;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ImplicitAndExplicitWaitDemo {
	@Test
	public void seleniumWaits() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//default pooling will happen every 250 ms to see whethr the element is loaded or not
		//with the help of implicit wait we are asking selenium to wait 10 s before it throws no such element found exception
		driver.get("https://google.com/");
		driver.findElement(By.name("q")).sendKeys("Charter Communication");
		
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		//Explicit wait
		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.name("hjk")));
	
		driver.close();
		driver.quit();
	}

}
/*Today we will learn
1 Why we use waits in Selenium
2 What is implicit wait | Implementation
3 What is explicit wait | Implementation

Why we use waits

The elements load time on a web page can vary

Not all the elements are loaded at the same time

In applications developed using Ajax, Javascript etc, objects on web page may load at different time

To handle this, we need to use waits in Selenium

With the help of waits, we can enable the script to wait for sometime before throwing No Such Element exception

What is implicit wait

Is used to define a time (period) until when webdriver should wait before throwing No Such Element exception

Syntax : 
driver.manage().timeouts().implicitlyWait(TimeOut, TimeUnit.SECONDS);

note:
By default it is set to 0
Implicit wait is applicable for the entire session of browser

What is explicit wait

Explicit waits can be set for specific elements

Can be set for a specific condition
E.g. wait until element is clickable

Syntax : 

WebDriverWait wait = new WebDriverWait(driver, 10);

WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.id("abc")));

You can set an implicit wait for entire session and
Explicit wait for certain elements where you think it needs more time or you want to wait until some specific condition is try
*/