package seleniumframework;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebElementLocatorsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https:google.com/");
		//WebElement inputBox = driver.findElement(By.name("q"));
		WebElement inputBox = driver.findElement(By.xpath("//input[@name='q']"));
		
		inputBox.sendKeys("Automation");
		List<WebElement> listOfInputs = driver.findElements(By.xpath("//input"));
		System.out.println(listOfInputs.size());
		

	}

}
/*Step 1 : Inspect Web Element

Step 2 : Check any of these locators

id
name
cssSelector
xPath
className
linkText
partialLinkText
tagName

Step 3 : Use locators with Selenium func.

findElement
findElements

Check your selected locator in different browsers

Can take help of tools for generating xpath and cssSelectors

Can ask developers to provide unique ids to every web element for easy identification and location

Xpath Generator:

Chrome APP - CHROPATH, ESKry

REFERENCES
https://www.w3schools.com/xml/xpath_examples.asp
http://xmltoolbox.appspot.com/xpath_generator.html
https://www.youtube.com/watch?v=8V74PsFupis
https://www.youtube.com/watch?v=ft52GxN7SPw

#S*/

/* Css Selector input[type=text][name='q']*/ //input[type=submit][name='btnK']
/* Relative Xpath //input[@type='text'][@name='q']*/ /////input[@type='submit'][@name='btnK']

/* Creating your own xpath */
//input[@name='q']
  
