package module8.Live;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BingSearchText {

	public static WebDriver driver;
	
	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "E:\\Abhresh\\Installation_stuff\\ExeFiles\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.navigate().to("https://www.bing.com");
		
		BingPageObjects page = new BingPageObjects(driver);
		
		//Type the Text in the search bar
		page.searchbar.sendKeys("SeleniumHQ");
		
		//Click the search button
		page.ClickSearch.click();
		
		
		page.searchbar.clear();
		page.searchbar.sendKeys("edureka");
		page.ClickSearch.click();
		
		
	}

}
