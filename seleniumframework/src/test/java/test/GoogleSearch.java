package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
public class GoogleSearch {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().version("80").setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://pearson.com");
		driver.findElement(By.id("q")).sendKeys("physics");
		driver.findElement(By.id("q")).sendKeys(Keys.RETURN);
		
		
		driver.close();
		System.out.println("Test Completed");
	}

}
