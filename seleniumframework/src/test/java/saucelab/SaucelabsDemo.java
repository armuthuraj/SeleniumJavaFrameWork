package saucelab;



import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SaucelabsDemo {
	public static final String USERNAME = "armuthuraj";
	public static final String  ACCESS_KEY= "d04d03e3-d581-472c-988e-7783f7aedb25";
	public static final String  URL= "https://"+USERNAME+":"+ACCESS_KEY+"@ondemand.saucelabs.com:443/wd/hub";
	public static void main(String[] args) throws Exception {
		DesiredCapabilities caps = DesiredCapabilities.chrome();
		caps.setCapability("platform", "Windows 10");
		caps.setCapability("version", "latest");
		caps.setCapability("name", "googletest");
		caps.setCapability("extendedDebugging", "true");
		WebDriver driver = new RemoteWebDriver(new java.net.URL(URL), caps);

		
		driver.get("https://google.com/");
		driver.findElement(By.name("q")).sendKeys("Charter Communication");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		System.out.println(driver.getTitle());
		driver.quit();
		System.out.println("Test Complete.........!");
		
	}

}
