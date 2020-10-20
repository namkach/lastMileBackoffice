package Steps;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AbstractSteps {
	protected static WebDriver driver;
	
	protected WebDriver getDriver() {
		if (driver == null) {
			String projectPath = System.getProperty("user.dir");
		    System.setProperty("webdriver.chrome.driver",projectPath + "/src/test/resources/drivers/chromedriver.exe");
		    driver = new ChromeDriver();
		    driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		    driver.manage().window().maximize();
		}
		return driver;
	}
}
