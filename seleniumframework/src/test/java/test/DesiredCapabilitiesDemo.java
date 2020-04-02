package Test;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DesiredCapabilitiesDemo {
	public static void main(String[] args) {
		
		
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("ignoreProtectedModeSettings", true);
		WebDriverManager.iedriver().setup();
		@SuppressWarnings("deprecation")
		WebDriver driver = new InternetExplorerDriver(caps);
		
		driver.get("https://google.com");
		driver.close();
		driver.quit();
	}

}
/*What is DesiredCapabilities

A class in Selenium library
org.openqa.selenium.remote.DesiredCapabilities

Describes a series of key/value pairs

Used to set properties for browser like
BrowserName, Platform, Version etc
*/
//https://stackoverflow.com/questions/17527951/what-is-the-use-of-desiredcapabilities-in-selenium-webdriver
//https://github.com/SeleniumHQ/selenium/wiki/DesiredCapabilities
//https://www.selenium.dev/selenium/docs/api/java/org/openqa/selenium/remote/DesiredCapabilities.html 