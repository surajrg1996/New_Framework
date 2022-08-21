package stepdefinitions;

import org.junit.Assert;

import Page_object_Model.Login_page;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import qa.factory.DriverFactory;

public class login_steps {
	
	private Login_page loginpage= new Login_page(DriverFactory.getDriver());
	public String title= "";
	

	@Given("User is on Home Page")
	public void user_is_on_home_page() {
		DriverFactory.getDriver().get("https://trade.angelbroking.com/");
	 
	}

	@When("User click on Login\\/Register")
	public void user_click_on_login_register() {
	   loginpage.clickonLogIn();
	}

	@Then("User Should redirect to Login Page")
	public void user_should_redirect_to_login_page() {
		title= loginpage.getLoginPagetitle();
		System.out.println("login page title is :"+ title);
	}

	@Then("Page title should be {string}")
	public void page_title_should_be(String Expectedtitle) {
		Assert.assertTrue(title.contains(Expectedtitle));
		
	}

	@Then("Forget password link should be displayed")
	public void forget_password_link_should_be_displayed() {
		Assert.assertTrue(loginpage.isForgotpasswordexist());
	}

	@When("User enter Username {string}")
	public void user_enter_username(String Username) {
	   loginpage.enterUserName(Username);
	}

	@When("User enter Password {string}")
	public void user_enter_password(String Password) {
	   loginpage.enterPassword(Password);
	}

	@When("Click on Login button")
	public void click_on_login_button() {
	  loginpage.clickonSignIn();
	}

	@When("User should redirect to Portfolio Page")
	public void User_should_redirect_to_Portfolio_Page() throws InterruptedException {
		Thread.sleep(2000);
		title= loginpage.getLoginPagetitle();
		System.out.println("login page title is :"+ title);
	}
	

}
