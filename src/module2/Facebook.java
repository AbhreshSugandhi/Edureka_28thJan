package module2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {

	public static void main(String[] args) {

		//Open Browser
		System.setProperty("webdriver.chrome.driver", "E:\\Abhresh\\Installation_stuff\\ExeFiles\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//Open AUT
		driver.get("https://www.facebook.com/");
		
		//Locate FirstName textBox and type Abhresh using ID locator
		driver.findElement(By.id("u_0_j")).sendKeys("Abhresh");
		
		driver.findElement(By.id("u_0_l")).sendKeys("Sugandhi");

	}

}
