package autoIT;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutoITDemo {
	
	public void test() throws IOException {
		Runtime.getRuntime().exec("path of the .exe"); //AUtoIt for only window
	}
	
}

/*What is a AutoIT
Why to use AutoIT
How to use AutoIT with Selenium

helpful tips

What is AutoIT

Software designed for automating windows GUI

Uses a combination of simulated keystrokes, mouse movement and window/control manipulation to automate tasks not possible using only Selenium

An AutoIt automation script can be converted into a compressed, stand-alone executable

AutoIT is Free
Works on Windows


Why to use AutoIT

Selenium cannot handle any non-browser / non-HTML elements

To handle such elements like:
Windows authentication box
File upload dialog box
Any other non-browser interaction

How to use AutoIT with Selenium

Step 1
Download and install AutoIT
https://www.autoitscript.com/site/autoit/downloads

Step 2
Download AutoIT Script Editor (SciTE)
https://www.autoitscript.com/site/autoit-script-editor/downloads



Step 3
Open Au3Info.exe and locate objects on the windows GUI (This will be available under the autoIT installed folder under c:/ProgramFiles)

Step 4
Create AutoIT Script and Test (This can be achieved using SciTE), Save the script using .au3 extension, then compile it based on your system BIT size (64, 86)

It will create an .exe file upon compiling it. 
Step 5
Call AutoIT script in Selenium Test
Runtime.getRuntime().exec(“location of autoit exe");


helpful tips

Use AutoIT Help application

Refer AutoIT Docs
https://www.autoitscript.com/autoit3/...

*/