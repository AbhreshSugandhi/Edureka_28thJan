package module2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

/*
 * Created by Abhresh
 */

public class SeleniumCommands {

	public static void main(String[] args) {
		
		//Instantiate the browser / Open Browser
		//Chrome Browser
		System.setProperty("webdriver.chrome.driver", "E:\\Abhresh\\Installation_stuff\\ExeFiles\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//Firefox Browser
		System.setProperty("webdriver.gecko.driver", "E:\\Abhresh\\Installation_stuff\\ExeFiles\\geckodriver.exe");
		WebDriver driver1 = new FirefoxDriver();
		
		//InternetExplorer Browser
		System.setProperty("webdriver.ie.driver", "E:\\Abhresh\\Installation_stuff\\ExeFiles\\IEDriverServer.exe");
		WebDriver driver2 = new InternetExplorerDriver();
		
		//Quit and Close commands
		driver.quit();// it will close all the windows of current instance
		driver.close();// it will close the current active window
		
		//Get Commands
		driver.get("URL");//Open URL of the AUT
		driver.getCurrentUrl();//this will cature the current URL available into the browser
		driver.getTitle();//this will cature the current title of the page
		driver.getWindowHandles();//this will helop to get the names of the windows with with you can switch between multiple windows
		
		
		//Navigation Commands
		driver.navigate().to("URL");//To go to a perticular URL which is not on the current page
		driver.navigate().refresh();//page refresh
		driver.navigate().back();//go to previous page
		driver.navigate().forward();// to move to forward page
		
		//Element handling commands
		driver.findElement(By.id("")).click();
		driver.findElement(By.id("")).sendKeys("Abhresh");
		driver.findElement(By.id("")).clear();

	}

}
