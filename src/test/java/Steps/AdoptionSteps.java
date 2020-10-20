package Steps;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AdoptionSteps extends AbstractSteps {
	String riderListPage = "รายชื่อคนขับ";
	String approveListPage = "รายการรออนุมัติ";
	String reportPage = "รายงานประจำวัน";
	String storeMappingPage = "จัดการพื้นที่รับงาน";
	String uploadPage = "อัปโหลดรายชื่อคนขับ";
	String confirmBtn = "ยืนยัน";
	
	WebDriver driver = getDriver();
	
	@When("staff click on {string} page")
	public void staff_click_on_x_page(String wantedPage) {
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		List<WebElement> pages = driver.findElements(By.className("MuiListItem-button"));
		String textPage = null;
		switch (wantedPage) {
		 case "riderList" :
			 textPage = riderListPage;
			 break;
		 case "upload" :
			 textPage = uploadPage;
			 break;
		 }
		
		 for(WebElement page : pages) {
			 System.out.println("pages : " + page.getText());
			 if (page.getText().equals(textPage)) {
				 page.click();
				 WebElement headerName = driver.findElement(By.className("App-Content"));
				 assert headerName.getText().equals(textPage);
				 break;
			 }
		 }
	}
	
	@And("^staff search for rider (.*) and (.*) and click details button$")
	public void staff_search_for_rider_fname_and_lname(String fname, String lname) throws InterruptedException {
		System.out.println("--- search rider name");
		WebElement searchName = driver.findElement(By.cssSelector("input[type='text']"));
		Thread.sleep(1000);
		searchName.sendKeys(lname);
		
//		Thread.sleep(1000);
		String name = fname + " " + lname;
		System.out.println("name : " + name);
		List<WebElement> riderName = driver.findElements(By.className("four"));
		for (WebElement rider : riderName) {
			System.out.println("rider name : " + rider.getText());
			if (rider.getText().equals(name)) {
				System.out.println("YESSSSS!!!!!");
				int index = 0;
				index = riderName.indexOf(rider);
				System.out.println(index);
				List<WebElement> detailBtn = driver.findElements(By.className("navbar-item"));
				detailBtn.get(index - 3).click();
				break;
			}
		}
	}
	
//	@Then("^rider (.*) and (.*) details such as (.*) or (.*) or (.*) or (.*) or (.*) or (.*) or (.*) or (.*) or (.*) or (.*) or (.*) or (.*) or (.*) or (.*) or (.*) or (.*) or (.*)$")
//	public void rider_firstname_and_lastname_details(String fname, String lname, String fnameEng, String lnameEng, String sex, String bd, Integer tel, Integer idNo, String cvcode, String licenseID, String licenseIssueDate, String licenseExpireDate, String licenseType, String insureExpireDate, String taxExpireDate, String vehicleType, String licensePlateNo, String brand, String color) {
//		List<WebElement> searchText = driver.findElements(By.cssSelector("input[type='text']"));
//		for (WebElement text : searchText) {
//			System.out.println("text : " + text);
//		}
//	}
	
	@Then("^see rider (.*) and (.*) details such as (.*) or (.*) or (.*) or (.*) or (.*)$")
	public void see_rider_fname_and_lname_details_such_as_fnameEng_or_lnameEng_or_sex_or_bd_or_tel(String fname, String lname, String fnameEng, String lnameEng, String sex, String bd, String tel) throws InterruptedException {
		Thread.sleep(2000);
		System.out.println("fname : " + fname);
		System.out.println("lname : " + lname);
		System.out.println("fnameEng : " + fnameEng);
		System.out.println("lnameEng : " + lnameEng);
		System.out.println("sex : " + sex);
		System.out.println("bd : " + bd);
		System.out.println("tel : " + tel);
		List<WebElement> searchText = driver.findElements(By.cssSelector("input[type='text']"));
		for (WebElement text : searchText) {
			System.out.println("text : " + text.getAttribute("value"));
		}
	}
}
