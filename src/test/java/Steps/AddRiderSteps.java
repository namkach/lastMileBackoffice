//package Steps;
//
//import java.awt.AWTException;
//import java.util.List;
//import java.util.concurrent.TimeUnit;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import io.cucumber.java.en.*;
//
//public class AddRiderSteps {
//	String riderListPage = "รายชื่อคนขับ";
//	String uploadPage = "อัปโหลดรายชื่อคนขับ";
//	String confirmBtn = "ยืนยัน";
//	
//	WebDriver driver = null;
//	
//	@Given("staff login to web")
//	public void staff_login_to_web() {
//		System.out.println("--- Open browser ");
//		String projectPath = System.getProperty("user.dir");
//	    System.setProperty("webdriver.chrome.driver",projectPath + "/src/test/resources/drivers/chromedriver.exe");
//	    driver = new ChromeDriver();
//	    driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
//	    driver.manage().window().maximize();
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
//	@And("staff go to upload page")
//	public void staff_go_to_upload_page() {
//		System.out.println("--- click upload page");
//		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
//		List<WebElement> upload = driver.findElements(By.className("MuiListItem-button"));
//		for(WebElement uploadBtn : upload) {
//			 System.out.println("pages : " + uploadBtn.getText());
//			 if (uploadBtn.getText().equals(uploadPage)) {
//				 uploadBtn.click();
//				 System.out.println("CLICK!!!");
//				 WebElement headerName = driver.findElement(By.className("App-Content"));
//				 assert headerName.getText().equals(riderListPage);
//				 break;
//			 }
//		 }
//	}
//
//	@When("staff import rider name")
//	public void staff_import_rider_name() throws AWTException {
//		System.out.println("--- import rider");
//		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//		WebElement upload = driver.findElement(By.className("uploadFile"));
//		upload.click();
//		new RobotTyping().importRidersPath("downloads", "rider_allnow1.xlsx");		
//		List<WebElement> Btns = driver.findElements(By.className("buttonConfirm"));
//		for (WebElement i : Btns) {
//			System.out.println(i.getText());
//			if (i.getText().equals(confirmBtn)) {
//				i.click();
//				WebElement BtnOK = driver.findElement(By.className("buttonOK"));
//				BtnOK.click();
//			}
//		}
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
//	@Then("^staff should see rider (.*) and (.*)$")
//	public void staff_should_see_rider_fname_and_lname(String fname, String lname) throws InterruptedException {
//		System.out.println("--- search rider name");
//		WebElement searchName = driver.findElement(By.cssSelector("input[type='text']"));
////		String name = fname + " " + lname;
//		System.out.println("name : " + lname);
////		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//		Thread.sleep(1000);
//		searchName.sendKeys(lname);
//		
//		try {
//			List<WebElement> riderName = driver.findElements(By.className("four"));
//			for (WebElement rider : riderName) {
//				System.out.println(rider.getText());
//				if (rider.getText() == lname) {
//					assert rider.getText().contains(lname);
//					break;
//				}
//			}
//		} catch (Exception e) {
//			System.out.println(e);
//		}		
//	}               
//}
