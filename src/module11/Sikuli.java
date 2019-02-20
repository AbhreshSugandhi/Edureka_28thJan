package module11;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class Sikuli {

	public static void main(String[] args) throws FindFailed, InterruptedException {
	
		//Open browser
		System.setProperty("webdriver.chrome.driver", "E:\\Abhresh\\Installation_stuff\\ExeFiles\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//Open Edureka.com
		driver.get("https://www.edureka.co");
		
		driver.manage().window().maximize();
		
		Screen s = new Screen();
		
		Pattern chatbar = new Pattern("E:\\hdd\\Training\\Programs\\Sikuli\\dropchatdown.JPG");
		
		Pattern Login = new Pattern("E:\\hdd\\Training\\Programs\\Sikuli\\Login124.JPG");
		
		Pattern Forgot = new Pattern("E:\\hdd\\Training\\Programs\\Sikuli\\forgotOn.JPG");
		
		Pattern courselist = new Pattern("E:\\hdd\\Training\\Programs\\Sikuli\\browseallcourse.JPG");
		
		Pattern email = new Pattern("E:\\hdd\\Training\\Programs\\Sikuli\\Email.JPG");
		
		Thread.sleep(5000);
		
		//s.getScreen().click(chatbar);
		
		s.getScreen().click(Login);
		
		Thread.sleep(5000);	
		
		s.getScreen().type(email, "Abhresh");
		
		//s.getScreen().click(Forgot);


	}

}
