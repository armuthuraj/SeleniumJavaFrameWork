package publishTestNGResultInJenkins;

public class PublishTestNGResultInJenkins {
	//Launch Jenkins
	// Go to Manage jenkins -> Manage Plugins -> Available ->search for "testNG"-> select the plugin -> click on "Install without restart 
	//Wait for the plugin installation
	//go to your project/Job, then click on configure -> go to "Post Build Action" -> then Choose "Publish TestNG Result"
	//here you to give the path where you would like to store the result (path can be absolute, relative (if it is relative then give then no need to add anything under the edit box "TestNG XML Reported pattern")
	// Absolute path - just copy the path by right click on "testNG-result.xml" followed by click on properties
	//relative path - Go to your project/job then in general section click on "Advance" -> then choose "use custom workspace" and give the path of your framework directoy here

}
