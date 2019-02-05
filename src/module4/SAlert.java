package module4;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SAlert {

	public static void main(String[] args) throws InterruptedException {
		
		//open browser
		System.setProperty("webdriver.chrome.driver", "E:\\Abhresh\\Installation_stuff\\ExeFiles\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		//open AUT
		driver.get("https://seleniumautomationpractice.blogspot.com/2018/01/blog-post.html");
		
		driver.findElement(By.id("alert")).click();
		
		//Inilialise the Alert Insterface and Move the focus to Alert
		Alert sA = driver.switchTo().alert();
	
		//get the text of the alert and print on the console
		System.out.println(sA.getText());
		
		Thread.sleep(5000);
		
		//accept the alert
		sA.accept();


	}

}
