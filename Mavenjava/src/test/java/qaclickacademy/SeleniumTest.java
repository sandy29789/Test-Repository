import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver","/home/ubuntu/Documents/geckodriver");
		WebDriver driver = new FirefoxDriver();
		driver.get("www.google.com");
		System.out.println(driver.getCurrentUrl());
		driver.close();
		
		
		
		
	}

}
