package seleniumframework;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverManagerTest {
	public static void main(String[] args) {
		//WebDriverManager.chromedriver().version("79.0").setup();
		WebDriverManager.chromedriver().setup();
		 ChromeDriver driver = new ChromeDriver();
		 driver.get("https://google.com");
		 driver.quit();
		 
		
	}

}

/*
 * WebDriverManager.chromedriver().setup();
WebDriverManager.firefoxdriver().setup();
WebDriverManager.operadriver().setup();
WebDriverManager.phantomjs().setup();
WebDriverManager.edgedriver().setup();
WebDriverManager.iedriver().setup();
 */
/*
References
https://github.com/bonigarcia/webdrivemanager...
https://mvnrepository.com/*/