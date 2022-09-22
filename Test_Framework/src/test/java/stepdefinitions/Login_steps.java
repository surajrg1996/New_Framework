package stepdefinitions;

import Page_object_Model.Login_Page;
import io.cucumber.java.en.Then;
import qa.factory.DriverFactory;

public class Login_steps {
	
private Login_Page loginpage= new Login_Page(DriverFactory.getDriver());
	
	
	
	
	@Then("Login to application")
	public void login_to_application() throws InterruptedException {
		
			
		loginpage.dologin();
		
		loginpage.SSOlogin();

	}

}
