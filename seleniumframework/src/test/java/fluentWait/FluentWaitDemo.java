package fluentWait;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.annotations.Test;

import com.google.common.base.Function;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FluentWaitDemo {
	@SuppressWarnings("deprecation")
	@Test
	public void test() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://google.com/");
		driver.findElement(By.name("q")).sendKeys("Charter Communication");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		//driver.findElement(By.linkText("Charter Communications Inc. - The New York Times")).click();
		
		// Waiting 30 seconds for an element to be present on the page, checking
		   // for its presence once every 5 seconds.
		   Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(30, TimeUnit.SECONDS)
			       .pollingEvery(5, TimeUnit.SECONDS)
			       .ignoring(NoSuchElementException.class);
		      

		   WebElement element = wait.until(new Function<WebDriver, WebElement>() {
		     public WebElement apply(WebDriver driver) {
		    	 WebElement elementLink = driver.findElement(By.linkText("Charter Communications Inc. - The New York Times"));
		    	 if (elementLink.isDisplayed()) {
		    		 System.out.println("Element is displayed");
		    	 }
		       return elementLink;
		     }
		   });
		driver.close();
		driver.quit();
		
	}

}
/*
What is fluent wait

Fluent Wait - a class in Selenium api

When you want to:
apply wait to specific element
set max wait time period
set polling frequency
set to ignore specific exceptions

Syntax :
 
  Wait wait = new FluentWait(driver)
    .withTimeout(30, SECONDS)
    .pollingEvery(5, SECONDS)
    .ignoring(NoSuchElementException.class);

Why we use waits
The elements load time on a web page can vary

Not all the elements are loaded at the same time

In applications developed using Ajax, Javascript etc, objects on web page may load at different time

To handle this, we need to use waits in Selenium

With the help of waits, we can enable the script to wait for sometime before throwing No Such Element exception*/