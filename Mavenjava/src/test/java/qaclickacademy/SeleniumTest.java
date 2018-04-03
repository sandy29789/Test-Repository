import org.openqa.selenium.chrome.ChromeDriver;


public class SeleniumTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver","/home/ubuntu/Documents/geckodriver");
		WebDriver driver = new FirefoxDriver();
        Thread.sleep(3000);
		driver.close();
		
		
		
		
	}

}
