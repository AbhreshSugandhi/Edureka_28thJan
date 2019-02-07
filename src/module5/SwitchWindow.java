package module5;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchWindow {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "E:\\Abhresh\\Installation_stuff\\ExeFiles\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("http://toolsqa.com/automation-practice-switch-windows/");

		// Part1 - get the name of the main window
		String mw = driver.getWindowHandle();

		System.out.println("Main Window Name - " + mw);
		
		System.out.println("=========================================================================");

		Thread.sleep(5000);

		// Part2 - Click on the new message window button
		driver.findElement(By.xpath("//*[@id=\"content\"]/p[3]/button")).click();
		
		Thread.sleep(5000);

		// Part3 - 2 windows are opened and we are capturing the names of both the windows
		Set awn = driver.getWindowHandles();
		
		System.out.println("All Window Name - " + awn);
		
		System.out.println("=========================================================================");
		
		Thread.sleep(5000);
				
		//Part4 - using the for loop we are going to switch between the main window and the new windows.
		for(String nw : driver.getWindowHandles()) {
			
			Thread.sleep(5000);
			
			driver.switchTo().window(nw);

			Thread.sleep(5000);
			
			driver.switchTo().window(nw);
					
		}
		

	}

}
