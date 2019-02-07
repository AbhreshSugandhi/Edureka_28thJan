package module5;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;


public class KeyboardMouseAction {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "E:\\Abhresh\\Installation_stuff\\ExeFiles\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		WebElement FName = driver.findElement(By.name("firstname"));
		
		Actions act = new Actions(driver);

		Action newact = act.moveToElement(FName)
				.keyDown(FName, Keys.SHIFT)
				.sendKeys("ahresh")
				.keyUp(FName, Keys.SHIFT)
				.doubleClick(FName)
				.contextClick(FName)
				.build();
		
		
		newact.perform();
		

				
				
				
				
	}

}
