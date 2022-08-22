package stepdefinitions;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import Page_object_Model.Login_page;
import Page_object_Model.tabPage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import qa.factory.DriverFactory;

public class tabSteps {
	
	private Login_page loginpage= new Login_page(DriverFactory.getDriver());
	private tabPage tabpage;
	

	@Given("user already logged in to Application")
	public void user_already_logged_in_to_application(DataTable dataTable) {
	    List<Map<String,String>> credlist =dataTable.asMaps();
		String userName= credlist.get(0).get("username");
		String passWord=credlist.get(0).get("password");

		
		DriverFactory.getDriver().get("https://trade.angelbroking.com/Login");
		tabpage= loginpage.doLogin(userName, passWord);
		
		
	}


	
	@Given("user already logged in")
	public void user_already_logged_in() throws InterruptedException {
		String logintitle= tabpage.loginmessage();
		System.out.println("Title of WebPage: "+logintitle);
	   
	}

	@Given("get all tab details")
	public void get_all_tab_details() {
		tabpage.tabdetails();
	  
	}


	@Then("verfiy all tab working")
	public void verfiy_all_tab_working() {
		Assert.assertTrue(tabpage.dashboard());
		Assert.assertTrue(tabpage.portfolio());
		Assert.assertTrue(tabpage.market());
		Assert.assertTrue(tabpage.order());
		Assert.assertTrue(tabpage.advisory());
		Assert.assertTrue(tabpage.fund());
		Assert.assertTrue(tabpage.report());
		Assert.assertTrue(tabpage.more());
		
		
		  
	}
	
	
	
	
}
