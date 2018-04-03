package qaclickacademy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SeleniumTest {

	//testng xml file from Maven
	// how to execute all test cases from Test folder  - mvn test
	@Test
	public void BrowserAUtomation()
	{
		System.out.println("BrowserAUtomation");	
		System.setProperty("webdriver.gecko.driver","/home/ubuntu/Documents/geckodriver");
		WebDriver driver = new FirefoxDriver();
        Thread.sleep(3000);
		driver.close();
	}
	@Test
	public void elementsUi()
	{
		System.out.println("elementsUi");	
	}
	
	
}
