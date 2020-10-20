package Steps;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;

public class CommonSteps extends AbstractSteps {
	WebDriver driver = getDriver();
	
	@Given("staff login to web")
	public void staff_login_to_web() {	    
	    System.out.println("--- Open web ");
	    driver.navigate().to("https://lastmile-backoffice-uat.all-delivery.net/");
	    List<WebElement> btns = driver.findElements(By.className("idpButton-customizable"));
	    btns.get(1).click();
	    
	    driver.findElement(By.name("username")).sendKeys("sunitakac@gosoft.co.th");
	    driver.findElement(By.name("password")).sendKeys("namii.i888");
	    driver.findElement(By.className("credentials_input_submit")).click();
	}
	
	@And("close the program")
	public void close_the_program() {
		System.out.println("--- close the program");
//		driver.quit();
	}
}
