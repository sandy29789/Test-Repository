package qaclickacademy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class SeleniumTest {

	//testng xml file from Maven
	// how to execute all test cases from Test folder  - mvn test
	@Test
	public void BrowserAUtomation()
	{
		System.out.println("BrowserAUtomation");	
		System.setProperty("webdriver.firefox.marionette", "\\home\\ubuntu\\Documents\\geckodriver");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://facebook.com");
        System.out.println(driver.getTitle());  
        String s =driver.getCurrentUrl();
        System.out.println(s);
	}
	@Test
	public void elementsUi()
	{
		System.out.println("elementsUi");	
	}
	
	
}
