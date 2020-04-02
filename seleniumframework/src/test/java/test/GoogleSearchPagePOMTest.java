package Test;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.GoogleSearchPagePOM;
import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleSearchPagePOMTest {
	static WebDriver driver = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		testGoogleSearchPagePOM();

	}
	public static void testGoogleSearchPagePOM() {
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();

			GoogleSearchPagePOM searchpageObj=new GoogleSearchPagePOM(driver);
			driver.get("https://google.com/");
			searchpageObj.setTextInSearchBox("charter");
			searchpageObj.clickGoogleSearchBtn();
			driver.close();
			System.out.println("Test Completed");
	}

}
