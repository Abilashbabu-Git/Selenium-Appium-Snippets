package functionalAutomation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AxnSel3VsSel4 {

	public static void main (String args[])
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/droppable/");
		driver.switchTo().frame(0);
		WebElement draggable = driver.findElement(By.id("draggable"));
		WebElement droppable = driver.findElement(By.id("droppable"));
		
		Actions actions = new Actions(driver);
		
		//Seleniu, 4 implementaiton
		
		 actions.dragAndDrop(draggable, droppable).perform();
		
		//Can be used in 3 and 4
	
		actions.clickAndHold(draggable)
		.moveToElement(droppable)
		.release()
		.build()
		.perform();
		
		//in 4, can add fluent wait
		
		actions
        .clickAndHold(draggable)      // Click and hold the draggable element
        .pause(Duration.ofSeconds(1)) // Optional: pause for better visualization
        .moveToElement(droppable)     // Move to the droppable element
        .pause(Duration.ofSeconds(1)) // Optional: pause for better visualization
        .release()                     // Release the mouse button
        .build()                       // Build the action chain
        .perform(); 

		// Close the browser
		driver.quit();
	}
}
