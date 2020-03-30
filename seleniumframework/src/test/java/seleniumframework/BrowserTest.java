package seleniumframework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;
public class BrowserTest {

	public static void main(String[] args) {

		//String projectPath = System.getProperty("user.dir");
		//System.setProperty("webdriver.gecko.driver",projectPath+"/drivers/geckoDriver/geckodriver");
		WebDriver driver1 = new FirefoxDriver();
		//System.setProperty("webdriver.chrome.driver",projectPath+"/drivers/chromeDriver/chromedriver");
		WebDriver driver=new ChromeDriver();
		WebDriver driver2 = new SafariDriver();
		WebDriver driver3 = new InternetExplorerDriver();
		driver.get("https://google.com");
		driver.quit();
		driver1.get("https://google.com");
		driver1.quit();
		driver2.get("https://google.com");
		driver2.quit();
		driver3.get("https://google.com");
		driver3.quit();
	}

	}

	//Maven is for managing the dependencies with the help of POM.xml
	//Once you added dependency in pom.xml, save, then it will pull and place the required jar files under "Maven Dependencies" folder of the maven project
//Gradle is also kind of maven which help us to have gradle project and help us to manage the dependencies
	//While creating maven project choose "Creating a simple" project in order to skip Arch type selection
	//If the driver is not executable then change the mode using "chmod +x nameOfTheDriver" or "chmod 7777 nameOfTheDriver" by going the corresponding parent folder with the help of terminal
	//TODO Auto-generated method stub
	//If you give the location of folder having driver in environment/system variable Path, then you don’t have to set system property
	//echo $PATH in mac to view the path info. TO add the path 
	//Update system variables in window
	/*open up Terminal
Run sudo nano /etc/paths
Enter your password
Go to the bottom of the file and enter the path you wish to add
My PATH looks like: /Users/name/Documents/WebDriver (Add path till the folder where it has exe, Meaning dont include the exe name in path)
Control-x to quit
Y to save
Press enter to confirm
To double check, quit Terminal and relaunch it. Run echo $PATH. You should see your newly added path in the stream of other paths already there.*/

	/*
	 * For safari, No need to download any driver as it has default inbuilt driver
	 * All you need to do is, Go to Safari -> Preference ->check show develop menu is menubar -> then choose "Allow Remote Automation"
	 */
/*for IE we have to uncheck the "Enable protected mode" under all zone of security settings*/
	