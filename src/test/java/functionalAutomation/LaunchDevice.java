package functionalAutomation;


import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.WebElement;
import java.net.MalformedURLException;
import java.net.URL;

public class LaunchDevice {
	
	public static void main(String[] args) throws MalformedURLException {
		
		  DesiredCapabilities capabilities = new DesiredCapabilities();
	        capabilities.setCapability("platformName", "Android");
	        capabilities.setCapability("appium:platformVersion", "13"); // Change to your device's version
	        capabilities.setCapability("appium:deviceName", "R5CRA1SRJ1P"); // Change to your device name
	        capabilities.setCapability("appium:appPackage", "com.scb.pk.bmw"); // Your app package
	        capabilities.setCapability("appium:appActivity", "com.sc.retail.scmobile.MainActivity"); // Your app's main activity
	        capabilities.setCapability("appium:automationName", "UiAutomator2"); // Use UiAutomator2
		
	    
	     AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/"), capabilities);  
		
		
		
	}

}