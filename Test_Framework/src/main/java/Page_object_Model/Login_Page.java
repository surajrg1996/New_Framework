package Page_object_Model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login_Page {
	
private WebDriver driver;
	
	//Element by locators
	
	private  By username= By.xpath("//input[@id='1-email']");
	//private By password= By.xpath("//input[@placeholder='your password']");
	private By LogIn= By.xpath("//span[@class='auth0-label-submit']");
	private By usernamecloud = By.xpath("//input[@placeholder='User Email Address']");
	private By passwordcloud = By.xpath("//input[@placeholder='Password']");
	private By SSOlogin= By.xpath("//button[@type='submit']");
	
	public  Login_Page ( WebDriver driver) {
		this.driver= driver;
		
	}
	
	//  Page Actions : feature of the Page the form of methods 
	
	public String gethomepagetitle() {
		return driver.getTitle();
	}
	
	public void dologin() {
		driver.findElement(username).sendKeys("sgawande@baxterplanning.com");
		driver.findElement(LogIn).click();
	}
	
	public void SSOlogin() {
		driver.findElement(usernamecloud).sendKeys("sgawande@baxterplanning.com");
		driver.findElement(passwordcloud).sendKeys("Nandu@123");
		driver.findElement(SSOlogin).click();
	}
	
	

}
