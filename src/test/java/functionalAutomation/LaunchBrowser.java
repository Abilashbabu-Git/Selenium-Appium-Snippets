package functionalAutomation;

import java.time.Duration;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.Select;

public class LaunchBrowser {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.leafground.com/select.xhtml");

		WebElement dd = driver.findElement(By.className("ui-selectonemenu"));

		//create object for Select Class
		Select obj=new Select(dd);

		//object.method()
		//obj.selectByIndex(2);

		obj.selectByVisibleText("Cypress");

		//		List mylist = new ArrayList();
		//		mylist.add(10);		
		//		List mylist = new LinkedList();
		//		mylist.add(10);		
		

		HashMap<Integer, String> map = new HashMap<Integer, String>();

		map.put(1, "One");
		map.put(2, "Two");
		map.put(3, "Three");
		for(Map.Entry<Integer, String> entry : map.entrySet()) {
			System.out.println(entry.getKey() + " => " + entry.getValue());
		}
		
		ArrayList<LaunchBrowser> carList = new ArrayList<LaunchBrowser>();
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		
//		  DesiredCapabilities capabilities = new DesiredCapabilities();
//	        capabilities.setCapability("platformName", "Android");
//	        capabilities.setCapability("platformVersion", "13.0"); // Change to your device's version
//	        capabilities.setCapability("deviceName", "R5CRA1SRJ1P"); // Change to your device name
//	        capabilities.setCapability("appPackage", "com.scb.pk.bmw"); // Your app package
//	        capabilities.setCapability("appActivity", "com.sc.retail.scmobile.MainActivity"); // Your app's main activity
//	        capabilities.setCapability("automationName", "UiAutomator2"); // Use UiAutomator2
		
		Thread.sleep(2000);
		driver.close();
	}

}
