package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class GoogleSearchPagePOM {
	
	WebDriver driver = null;
	By txtBoxSearch = By.name("q");
	By btnGoogleSerach = By.name("btnK");

	public GoogleSearchPagePOM(WebDriver driver) {
		this.driver=driver;

	}

	public void setTextInSearchBox(String searchTxt) {
		driver.findElement(txtBoxSearch).sendKeys(searchTxt);


	}
	public void clickGoogleSearchBtn() {
		driver.findElement(btnGoogleSerach).sendKeys(Keys.RETURN);


	}

}
