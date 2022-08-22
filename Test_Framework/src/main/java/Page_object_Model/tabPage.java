package Page_object_Model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class tabPage {
	
private WebDriver driver;
	
	//Element by locators
	private  By dashboardbutton = By.xpath("//a[@id='mnDashboard']");
	private By portfoliobutton = By.xpath("//a[@id='mnPort']");
	private By marketsbutton= By.xpath("//a[@id='mnMarkets']");
	private By ordersbutton= By.xpath("//a[@id='mnOrders']");
	private By advisorybuttn= By.xpath("//a[@id='mnAdvisory']");
	private By fundsbutton=By.xpath("//a[@id='mnFunds']");
	private By reportsbutton= By.xpath("//a[@id='mnReports']");
	private By morebutton= By.xpath("//a[@id='mnMore']");
			
	//Constructor of the Page class:
	
	public tabPage ( WebDriver driver) {
		this.driver= driver;
	}
	
	public boolean dashboard() {
	return	driver.findElement(dashboardbutton).isEnabled();
	
	}
	
	public boolean portfolio() {
		return driver.findElement(portfoliobutton).isEnabled();
	}
	
	public boolean market() {
		return driver.findElement(marketsbutton).isEnabled();
	}
	
	public boolean order() {
		return driver.findElement(ordersbutton).isEnabled();
	}
	
	public boolean advisory() {
		return driver.findElement(advisorybuttn).isEnabled();
	}
	
	public boolean fund() {
		return driver.findElement(fundsbutton).isEnabled();
	}
	
	public boolean report() {
		return driver.findElement(reportsbutton).isEnabled();
		
	}
	
	public boolean more() {
		return driver.findElement(morebutton).isEnabled();
	}
	
	public String loginmessage() throws InterruptedException {
		System.out.println("User Logged In");
		Thread.sleep(2000);
		return driver.getTitle();
	}
	
	public void tabdetails() {
		String dashboardtext= driver.findElement(dashboardbutton).getText();
		System.out.println(dashboardtext);
		
		String portfoliotext= driver.findElement(portfoliobutton).getText();
		System.out.println(portfoliotext);
		
		String markettext= driver.findElement(marketsbutton).getText();
		System.out.println(markettext);
		
		String ordertext= driver.findElement(ordersbutton).getText();
		System.out.println(ordertext);
		
		String advisorytext= driver.findElement(advisorybuttn).getText();
		System.out.println(advisorytext);
		
		String fundtext= driver.findElement(fundsbutton).getText();
		System.out.println(fundtext);
		
		String reporttext= driver.findElement(reportsbutton).getText();
		System.out.println(reporttext);
		
		String moretext= driver.findElement(morebutton).getText();
		System.out.println(moretext);
		
		
	}
	
	
	
	
	
	

}
