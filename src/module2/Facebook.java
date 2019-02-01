package module2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {

	public static void main(String[] args) throws InterruptedException {

		//Open Browser
		System.setProperty("webdriver.chrome.driver", "E:\\Abhresh\\Installation_stuff\\ExeFiles\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//Open AUT
		driver.get("https://www.facebook.com/");
		
		/*//Locate FirstName textBox and type Abhresh using ID locator
		driver.findElement(By.id("u_0_j")).sendKeys("Abhresh");
		driver.findElement(By.id("u_0_l")).sendKeys("Sugandhi");
		
		//Using Name Locator
		driver.findElement(By.name("reg_email__")).sendKeys("987654321");
		
		
		//Using Class Name
		driver.findElement(By.className("inputtext")).sendKeys("Abhresh");
		
		driver.findElement(By.className("inputtext")).sendKeys("Sugandhi");
		
		//LinkText
		driver.findElement(By.linkText("Forgotten account?")).click();
		
		
		//Partial linktext
		driver.findElement(By.partialLinkText("Forgot")).click();
		
		
		driver.findElement(By.name("reg_email__")).sendKeys("987654321");
		
		
		//Css Locator
		driver.findElement(By.cssSelector("#u_0_a")).click();
		
		List <WebElement> list = driver.findElements(By.tagName("a"));
		
		System.out.println(list.size());
		
		*/
		
		driver.findElement(By.xpath("//*[@name='pass']//preceding::input[1]")).sendKeys("Abhresh");
		driver.findElement(By.xpath("//*[@name='email']//following::input[1]")).sendKeys("Sugandhi");	
		
		
	}

}
