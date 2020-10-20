//package Steps;
//
//import java.util.List;
//import java.util.concurrent.TimeUnit;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import io.cucumber.java.en.And;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//
//public class RiderDetailsSteps extends AbstractSteps{
//	String riderListPage = "รายชื่อคนขับ";
//	String uploadPage = "อัปโหลดรายชื่อคนขับ";
//	String confirmBtn = "ยืนยัน";
//	
//	WebDriver driver = getDriver();
//	
////	@Given("staff login to web")
////	public void staff_login_to_web() {
////		System.out.println("--- Open browser ");
////		String projectPath = System.getProperty("user.dir");
////	    System.setProperty("webdriver.chrome.driver",projectPath + "/src/test/resources/drivers/chromedriver.exe");
////	    driver = new ChromeDriver();
////	    driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
////	    driver.manage().window().maximize();
////	    
////	    System.out.println("--- Open web ");
////	    driver.navigate().to("https://lastmile-backoffice-uat.all-delivery.net/");
////	    List<WebElement> btns = driver.findElements(By.className("idpButton-customizable"));
////	    btns.get(1).click();
////	    
////	    driver.findElement(By.name("username")).sendKeys("sunitakac@gosoft.co.th");
////	    driver.findElement(By.name("password")).sendKeys("namii.i888");
////	    driver.findElement(By.className("credentials_input_submit")).click();
////	}
////	
////	@And("staff go to upload page")
////	public void staff_go_to_upload_page() {
////		System.out.println("--- click upload page");
////		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
////		List<WebElement> upload = driver.findElements(By.className("MuiListItem-button"));
////		for(WebElement uploadBtn : upload) {
////			 System.out.println("pages : " + uploadBtn.getText());
////			 if (uploadBtn.getText().equals(uploadPage)) {
////				 uploadBtn.click();
////				 System.out.println("CLICK!!!");
////				 WebElement headerName = driver.findElement(By.className("App-Content"));
////				 assert headerName.getText().equals(riderListPage);
////				 break;
////			 }
////		 }
////	}
////	
////	@Then("^staff should see rider (.*) and (.*)$")
////	public void staff_should_see_rider_fname_and_lname(String fname, String lname) throws InterruptedException {
////		System.out.println("--- search rider name");
////		WebElement searchName = driver.findElement(By.cssSelector("input[type='text']"));
//////		String name = fname + " " + lname;
////		System.out.println("name : " + lname);
//////		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
////		Thread.sleep(1000);
////		searchName.sendKeys(lname);
////		
////		try {
////			List<WebElement> riderName = driver.findElements(By.className("four"));
////			for (WebElement rider : riderName) {
////				System.out.println(rider.getText());
////				if (rider.getText() == lname) {
////					assert rider.getText().contains(lname);
////					break;
////				}
////			}
////		} catch (Exception e) {
////			System.out.println(e);
////		}		
////	}               
////
////	@When("^stafff click details button of (.*) and (.*)$")
////	public void stafff_click_details_button(String fname, String lname) {
////		List<WebElement> riderName = driver.findElements(By.className("four"));
////		for (int i = 0; i < riderName.size(); i++) {
////			System.out.println(riderName.get(i).getText());
////			if (riderName.get(i).getText() == lname) {
////				assert riderName.get(i).getText().contains(lname);
////				List<WebElement> btn = driver.findElements(By.className("navbar-item"));
////				btn.get(i).click();
////				break;
////			}
////		}   
////	}
//
//	
//	
//	
//	@Given("staff login to web")
//	public void staff_login_to_web() {
//		System.out.println("--- Open browser ");
////		String projectPath = System.getProperty("user.dir");
////	    System.setProperty("webdriver.chrome.driver",projectPath + "/src/test/resources/drivers/chromedriver.exe");
////	    driver = new ChromeDriver();
////	    driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
////	    driver.manage().window().maximize();
//	    
//	    System.out.println("--- Open web ");
//	    driver.navigate().to("https://lastmile-backoffice-uat.all-delivery.net/");
//	    List<WebElement> btns = driver.findElements(By.className("idpButton-customizable"));
//	    btns.get(1).click();
//	    
//	    driver.findElement(By.name("username")).sendKeys("sunitakac@gosoft.co.th");
//	    driver.findElement(By.name("password")).sendKeys("namii.i888");
//	    driver.findElement(By.className("credentials_input_submit")).click();
//	}
//
//	@And("staff go to rider list page")
//	public void staff_go_to_rider_list_page() {
//		System.out.println("--- click rider list page");
//		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
//
//		List<WebElement> riderList = driver.findElements(By.className("MuiListItem-button"));
//		 for(WebElement page : riderList) {
//			 System.out.println("pages : " + page.getText());
//			 if (page.getText().equals(riderListPage)) {
//				 page.click();
//				 WebElement headerName = driver.findElement(By.className("App-Content"));
//				 assert headerName.getText().equals(riderListPage);
//				 break;
//			 }
//		 }
//	}
//
//	@When("^staff search for rider (.*) and (.*)$")
//	public void staff_search_for_rider_fname_and_lname(String fname, String lname) throws InterruptedException {
//		System.out.println("--- search rider name");
//		WebElement searchName = driver.findElement(By.cssSelector("input[type='text']"));
////		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//		Thread.sleep(1000);
//		searchName.sendKeys(lname);
//		
//		Thread.sleep(1000);
//		String name = fname + " " + lname;
//		System.out.println("name : " + name);
//		List<WebElement> riderName = driver.findElements(By.className("four"));
//		for (WebElement rider : riderName) {
//			System.out.println("rider name : " + rider.getText());
//			if (rider.getText().equals(name)) {
//				System.out.println("YESSSSS!!!!!");
//				int index = 0;
//				index = riderName.indexOf(rider);
//				System.out.println(index);
//				List<WebElement> detailBtn = driver.findElements(By.className("navbar-item"));
//				detailBtn.get(index - 3).click();
//				break;
//			}
//		}
//	}
//
//	@And("^click details button of (.*) and (.*)$")
//	public void click_details_button_of_fname_and_lname(String fname, String lname) {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//
//	@Then("^staff should see rider (.*) and (.*) details $")
//	public void staff_should_see_rider_fname_and_lname_details(String fname, String lname) {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//}
