package saucelab;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class SaucelabsDemo {
	public static final String USERNAME = "armuthuraj";
	public static final String  ACCESS_KEY= "d04d03e3-d581-472c-988e-7783f7aedb25";
	public static final String  URL= "https://"+USERNAME+":"+ACCESS_KEY+"@ondemand.saucelabs.com:443/wd/hub";
	public static void main(String[] args) throws Exception {
		DesiredCapabilities caps = DesiredCapabilities.chrome();
		caps.setCapability("platform", "Windows 10");
		caps.setCapability("version", "latest");
		caps.setCapability("name", "Yahootest");
		WebDriver driver = new RemoteWebDriver(new java.net.URL(URL), caps);
		driver.get("https://yahoo.com");
		System.out.println(driver.getTitle());
		driver.quit();
		System.out.println("Test Complete.........!");
		
	}

}
