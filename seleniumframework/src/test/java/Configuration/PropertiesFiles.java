package Configuration;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

public class PropertiesFiles {
	static  Properties prop = new Properties();
	static String projPath = System.getProperty("user.dir");

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		getProperties();
		setProperties();

	}
	public static String getProperties()  {
String Browser=null;
		try {


			InputStream input = new FileInputStream(projPath+"/src/test/java/Configuration/config.properties");
			prop.load(input);
			Browser = prop.getProperty("browser");
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println(e.getCause());
			System.out.println(e.getMessage());
		}
		return Browser;
	} 
	public static void setProperties() {
		try {
			OutputStream output = new FileOutputStream(projPath+"/src/test/java/Configuration/config.properties");
			prop.setProperty("browser1", "safari");
			prop.store(output, "Adding New browser value using the key \" browser \"");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getCause());
			System.out.println(e.getMessage());
		}
	}

}
