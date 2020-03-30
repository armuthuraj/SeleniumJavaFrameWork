package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import Pages.GoogleSearchPage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleSearchPageTest {
	private static WebDriver driver = null;

	public static void main(String[] args) {
		googleSearch();

	}
	public static void googleSearch() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://google.com/");
		GoogleSearchPage.textbox_search(driver).sendKeys("Charter");
		GoogleSearchPage.button_searc(driver).sendKeys(Keys.RETURN);

		driver.close();
		System.out.println("Test Completed");
	}

}
