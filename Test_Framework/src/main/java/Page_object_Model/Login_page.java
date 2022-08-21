package Page_object_Model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login_page {
	
	
	private WebDriver driver;
	
	//Element by locators
	
	private  By loginbutton= By.xpath("//a[@class='btn btn-color'][normalize-space()='LOGIN / REGISTER']");
	private By user= By.xpath("//input[@id='txtUserID']");
	private By passWord= By.xpath("//input[@id='txtTradingPassword']");
	private By signInButton= By.xpath("//a[@id='loginBtn']");
	private By Forgetpasswordlink=By.xpath("//div[@class='form-group text-center forgot_psw_link']//a[@class='link text-uppercase'][normalize-space()='Forgot password?']");
	
			
	//Constructor of the Page class:
	
	public Login_page ( WebDriver driver) {
		this.driver= driver;
		
	}
	
	//  Page Actions : feature of the Page the form of methods 
	
	public String getLoginPagetitle() {
		return driver.getTitle();
	}
	
	public void clickonLogIn () {
		driver.findElement(loginbutton).click();
		
	}
	
	public boolean isForgotpasswordexist() {
	return	driver.findElement(Forgetpasswordlink).isEnabled();
	
		
	}
	
	public void enterUserName(String Username) {
		driver.findElement(user).sendKeys(Username);
		
	}
	
	public void enterPassword (String Password) {
		driver.findElement(passWord).sendKeys(Password);
	}
	
	public void clickonSignIn () {
		driver.findElement(signInButton).click();
		
	}
	
	public void doLogin(String un, String pwd) {
		
		System.out.println("Login with username: " +un+ " and password "+ pwd);
		driver.findElement(user).sendKeys(un);
		driver.findElement(passWord).sendKeys(pwd);
		driver.findElement(signInButton).click();
		
			
		
		
	}
	
	
	
	
}
