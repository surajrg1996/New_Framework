package stepdefinitions;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;

import Page_object_Model.oderCreationPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import qa.factory.DriverFactory;

public class Ordecreationstep {
	
	private oderCreationPage orderpage= new oderCreationPage(DriverFactory.getDriver());
	
	
	
	
	
	@Given("Redirect to Home Page")
	public void redirect_to_home_page() {
		DriverFactory.getDriver().get("https://lynx-dev.entercoms.com/#");
		DriverFactory.getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		String title= orderpage.gethomepagetitle();
		System.out.println("login page title is :"+ title);
	}

	@Then("Login to application")
	public void login_to_application() throws InterruptedException {
		
			
		orderpage.dologin();
		
		orderpage.SSOlogin();

	}

	@Then("Select dropdown and select LYNX-North America")
	public void select_dropdown_and_select_lynx_north_america() {
		
		orderpage.northheaderselect();
	   
	}

	@When("Click on Order Creation")
	public void click_on_order_creation() throws InterruptedException {
		orderpage.ordercreate();
		
			    
	}

	@Then("Enter Order id details")
	public void enter_order_id_details() throws InterruptedException {
		orderpage.orderdetails();
		
		JavascriptExecutor js= (JavascriptExecutor)DriverFactory.getDriver();
		js.executeScript("window.scrollBy (0,200)");
		
		
		
		orderpage.shipmentdetails();
		
		JavascriptExecutor js1= (JavascriptExecutor)DriverFactory.getDriver();
		js1.executeScript("window.scrollBy (0,200)");
		
		orderpage.contactdetails();
		
		JavascriptExecutor js2= (JavascriptExecutor)DriverFactory.getDriver();
		js2.executeScript("window.scrollBy (0,200)");
		
		orderpage.partdetailsfill();
	
	   
	}

	@Then("Submit Order ID Details")
	public void submit_order_id_details() throws InterruptedException, IOException {
		orderpage.order_submit();
		orderpage.ordercheck();
	}

	@Then("Redirect to Tracking in Order Menu")
	public void redirect_to_tracking_in_order_menu() {
		orderpage.redirecttotracking();
	}

	@Then("Select the date & Apply")
	public void select_the_date_apply() {
	   orderpage.selectdate();
	}

	@Then("Check the Order details")
	public void check_the_order_details() {
		orderpage.selectorderdetails();
	}

	@Then("Logout from Application")
	public void logout_from_application() {
		orderpage.logout();
	}

	
	
	

}
