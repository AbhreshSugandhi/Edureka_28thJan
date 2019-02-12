package module8.Live;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BingSearchText2 {

	public static WebDriver driver;
	
	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "E:\\Abhresh\\Installation_stuff\\ExeFiles\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.navigate().to("https://www.bing.com");
		
		BingPageObjects2 page = new BingPageObjects2(driver);
		
		page.Search("SeleniumHQ");
		
		page.LinkSelenium();
		
		SeleniumPageObjects page2 = new SeleniumPageObjects(driver);
		
		page2.Download();
		
		page2.Home();
		
	}

}
