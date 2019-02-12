package module8.Live;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BingPageObjects2 {

	public BingPageObjects2(WebDriver driver) {
		//this is a PageFactory in Selenium which will initialize all the below WebElements
		PageFactory.initElements(driver, this);
	}
		
	@FindBy(name = "q")
	WebElement Searchbar;
	
	@FindBy(id="sb_form_go")
	WebElement ClickSearch;
	
	@FindBy(linkText = "Selenium - Web Browser Automation")
	WebElement LinkClick;

	public void Search(String searchTXT) {

		Searchbar.clear();
		Searchbar.sendKeys(searchTXT);
		ClickSearch.click();
	}
	
	public void LinkSelenium() {
		
		LinkClick.click();
	}
	
	
	
}