package headLessBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;
public class HeadLessBrowserDemo {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("headless");
		WebDriver driver = new ChromeDriver(options);
		
		
		
		driver.get("https://google.com/");
		System.out.println(driver.getTitle());
		driver.findElement(By.name("q")).sendKeys("Charter Communication");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		driver.close();
		System.out.println("Test Completed");
	}

}

/*What are Headless Browsers
Why should we use Headless Browsers
When should we NOT use Headless Browsers
Examples of Headless Browsers
helpful tips

What are Headless Browsers

Headless Browsers are web browsers without a head or GUI (Graphical User Interface)
i.e. you cannot see anything on your screen, programs runs at backend.

Headless Browsers are software programs that access the web pages but do not show them to the user.

Headless Chrome
Html Unit Browser
Zombie.js
PhantomJS
TrifleJS
SlimmerJS



Why should we use Headless Browsers

Headless Browsers can be used for :

Running your test on a headless systems like linux os without gui.
When you want simulate multiple browser behaviour on a single machine.
To use minimal resources (because there is no GUI)
Need to run your test just for data creation


When should we NOT use Headless Browsers

Headless Browsers should not/cannot be used:

If you need to visually observe your test on the browser
It does not give you exact feedback of what your customers will actually experience on your website (Page loading speeds ...etc)
Headless Browsers sometimes may throw errors that is not observed on real browsers


Examples of Headless Browsers
https://gist.github.com/evandrix/3694955

Helpful Tips

You can use actual browsers on a headless machine

Real browsers can run in headless manner on systems with Linux with zero configurations. CI systems like Jenkins can be used.

Read about Xvfb - X virtual frame buffer
It is a display server that performs all graphical operations in memory without showing anything on the screen.
Therefore it does not require the system to have a screen or gui.

https://en.wikipedia.org/wiki/Xvfb
https://wiki.jenkins-ci.org/display/Jenkins/Xvfb+plugin

http://stackoverflow.com/questions/31...

HtmlUnit browser can be run with Web Driver and not with Selenium RC.

Selenium RC cannot support headless HtmlUnit browser.

*/
