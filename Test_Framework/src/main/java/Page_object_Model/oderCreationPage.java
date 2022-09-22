package Page_object_Model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class oderCreationPage {
	
private WebDriver driver;
	
	//Element by locators
	
//	private  By username= By.xpath("//input[@id='1-email']");
//	private By password= By.xpath("//input[@placeholder='your password']");
//	private By LogIn= By.xpath("//span[@class='auth0-label-submit']");
//	private By usernamecloud = By.xpath("//input[@placeholder='User Email Address']");
//	private By passwordcloud = By.xpath("//input[@placeholder='Password']");
//	private By SSOlogin= By.xpath("//button[@type='submit']");
	private By  headeroption= By.xpath("//a[@class='bx--header__menu-item bx--header__menu-title']//*[name()='svg']");
	private By northoption= By.xpath("//a[normalize-space()='LYNX - North America']");
	private By orderCreationButton= By.xpath("//div[@class='app--row']//div[1]//div[2]//div[1]");
	private By RMAidtextbox= By.xpath("//input[@id='ibm-label-0']");
	private By Dispatchtext= By.xpath("//input[@id='ibm-label-1']");
	private By coverageselect= By.xpath("//ibm-dropdown//div[@class='bx--list-box bx--dropdown']/button[normalize-space()='Select a value'][@id='dropdown-1']");
	private By returnselect= By.xpath("//div[normalize-space()='Return & Exchange/IRMA/Standard RMA']");
	private By serviceselect = By.xpath("//button[@id='dropdown-2']//span[@class='bx--list-box__label'][normalize-space()='Select a value']");
	private By dayselect= By.xpath("//div[normalize-space()='1 day']");
	private By dispatchselect= By.xpath("//button[@id='dropdown-3']//span[@class='bx--list-box__menu-icon']//*[name()='svg']");
	private By standardselect= By.xpath("//div[normalize-space()='Standard']");
	private By assestserialtext= By.xpath("//input[@id='ibm-label-7']");
	private By sitenametext= By.xpath("//input[@id='ibm-label-8']");
	private By addrestext= By.xpath("//input[@id='ibm-label-9']");
	private By citytest= By.xpath("//input[@id='ibm-label-11']");
	private By countrytext = By.xpath("//input[@id='ibm-label-14']");
	private By firstnametext=  By.xpath("//input[@id='ibm-label-15']");
	private By lastnametext= By.xpath("//input[@id='ibm-label-16']");
	private By primaryphonetext= By.xpath("//input[@id='ibm-label-17']");
	private By partselect= By.xpath("//button[@title='open menu']//*[name()='svg']");
	private By partoption=By.xpath("//div[normalize-space()='1-03563-01']");
	private By nextbutton= By.xpath("//button[normalize-space()='Next']");
	private By ordersubmitbutton= By.xpath("//button[@class='order-information-button bx--btn bx--btn--primary bx--btn--sm']");
	private By Mainbutton= By.xpath("//a//span[@class='bx--header__name--prefix']");
	private By trackingbutton= By.xpath("//span[normalize-space()='Tracking']");
	
	
//	private By calenderfrom= By.xpath("//input[@id='datepicker-22-input']");
//	private By fromdate= By.xpath("//input[@id='datepicker-7-input']");
//	private By calenderto= By.xpath("//ibm-date-picker[@label='To']//div[@class='bx--date-picker-input__wrapper']");
//	private By toDate= By.xpath("//input[@id='datepicker-8-input']");
	private By dateApply= By.xpath("//button[@class='apply-button flex__item--bottom right--margin bx--btn bx--btn--primary bx--btn--sm']");
//	private By selectallcheckbox= By.xpath("//div[@class='selectall selectall-checked']//div//*[name()='svg']//*[name()='path' and contains(@d,'M13 24L4 1')]");
//	private By closebutton= By.xpath("//button[normalize-space()='Close']");
//	private By backbutton= By.xpath("//button[@class='bx--btn bx--btn--secondary']");
	private By userprofile= By.xpath("//*[name()='path' and contains(@d,'M16 4a5 5 ')]");
	private By logout= By.xpath("/html[1]/body[1]/ibm-overflow-menu-pane[1]/ul[1]/ibm-overflow-menu-option[2]/button[1]");
	
			
	//Constructor of the Page class:
	
	public  oderCreationPage ( WebDriver driver) {
		this.driver= driver;
		
	}
	
	//  Page Actions : feature of the Page the form of methods 
	
	public String gethomepagetitle() {
		return driver.getTitle();
	}
	
//	public void dologin() {
//		driver.findElement(username).sendKeys("sgawande@baxterplanning.com");
//		driver.findElement(LogIn).click();
//	}
//	
//	public void SSOlogin() {
//		driver.findElement(usernamecloud).sendKeys("sgawande@baxterplanning.com");
//		driver.findElement(passwordcloud).sendKeys("Nandu@123");
//		driver.findElement(SSOlogin).click();
//	}
	
	public void northheaderselect() {
		Actions act= new Actions(driver);
		act.moveToElement(driver.findElement(headeroption)).click();
		act.moveToElement(driver.findElement(northoption)).click().build().perform();
	}
	
	public void ordercreate() {
		driver.findElement(orderCreationButton).click();
	}
	
	
	
	public void orderdetails() throws InterruptedException {
		driver.findElement(RMAidtextbox).sendKeys("313");
		driver.findElement(Dispatchtext).sendKeys("50000");
		
		driver.findElement(coverageselect).click();
		Actions coveragesel= new Actions(driver);
		coveragesel.moveToElement(driver.findElement(returnselect)).click().build().perform();
		
		Thread.sleep(2000);
		
		driver.findElement(serviceselect).click();
		Actions servicesel= new Actions(driver);
		servicesel.moveToElement(driver.findElement(dayselect)).click().build().perform();
		
		Thread.sleep(2000);
		
		driver.findElement(dispatchselect).click();
		Actions dispatchsel= new Actions(driver);
		dispatchsel.moveToElement(driver.findElement(standardselect)).click().build().perform();
		
				
	}
	
	public void shipmentdetails() {
		
		driver.findElement(assestserialtext).sendKeys("surajrg313");
		driver.findElement(sitenametext).sendKeys("WareHouse");
		driver.findElement(addrestext).sendKeys("Gajnan Nagar");
		driver.findElement(citytest).sendKeys("Aurangabad");
		driver.findElement(countrytext).sendKeys("India");
		
		
		
	}
	
	public void contactdetails() {
		
		driver.findElement(firstnametext).sendKeys("Suraj");
		driver.findElement(lastnametext).sendKeys("Gawande");
		driver.findElement(primaryphonetext).sendKeys("9699332708");
	
	}
	
	public void partdetailsfill() {
		
		driver.findElement(partselect).click();
		Actions partsel= new Actions(driver);
		partsel.moveToElement(driver.findElement(partoption)).click().build().perform();
		
		
	}
	
	public void order_submit() {
		
		driver.findElement(nextbutton).click();
				
		
				

		
	}
	
	public void ordercheck() throws InterruptedException {
		driver.findElement(ordersubmitbutton).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//button[@class='bx--btn bx--btn--primary']")).click();
		
	}
	
	
	public void redirecttotracking() {
		
		
		driver.findElement(Mainbutton).click();
		driver.findElement(trackingbutton).click();
		
		String title= driver.getTitle();
		System.out.println(title);
		
				
		
	}
	
	public void selectdate() throws InterruptedException {
		
//		Actions dateselect= new Actions(driver);
//		Thread.sleep(1000);
//		dateselect.moveToElement(driver.findElement(By.xpath("//span[@aria-label='August 1, 2022']"))).click().perform();;
//		
//		driver.findElement(fromdate).click();
//		driver.findElement(fromdate).clear();
//		driver.findElement(fromdate).sendKeys("07/01/2022");
//		
//		driver.findElement(toDate).click();
//		driver.findElement(toDate).clear();
//		driver.findElement(toDate).sendKeys("08/01/2022");
//		
		driver.findElement(dateApply).click();;
		
	}
	
	public void selectorderdetails() {
		
//		driver.findElement(selectallcheckbox).click();
//		driver.findElement(closebutton);
//		
//		Alert alert= driver.switchTo().alert();
//		
//		alert.dismiss();
		driver.getTitle();
		
	}
	
	public void logout() {
		
		driver.findElement(userprofile).click();
		Actions logsel= new Actions(driver);
		logsel.moveToElement(driver.findElement(logout)).click().build().perform();
	}
	
	
	
	
	
	
	
	

}
