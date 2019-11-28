package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class EnterprisePage {
	
	WebDriver driver;
	
	private By Name=By.xpath("//*[@id='lblEnterpriseProfileName']");
	private By Email=By.xpath("//*[@id='lblEnterpriseProfileEmail']");
	private By Phone=By.xpath("//*[@id='lblEnterpriseProfileContactno']");
	
	private By Address=By.xpath("//*[@id='hideaddress_enterprise']");
	
	private By Line1=By.xpath("//*[@id='enterprise_ul']/li[2]/ul/li[1]/input");
	private By Line2=By.xpath("//*[@id='enterprise_ul']/li[2]/ul/li[2]/input");
	private By City=By.xpath("//*[@id='enterprise_ul']/li[3]/ul/li[1]/input");
	private By State=By.xpath("//*[@id='enterprise_ul']/li[3]/ul/li[2]/input");
	
	private By Pin=By.xpath("//*[@id='enterprise_ul']/li[4]/ul/li[1]/input");
	private By Country=By.xpath("//*[@id='enterprise_ul']/li[4]/ul/li[2]/input");
	
	private By Cancel=By.xpath("//*[@id='btnCanceluser']");
	private By Save=By.id("btnSubmitCompanyProfile");
	

	
	public EnterprisePage(WebDriver driver) {
		
		this.driver=driver;
		
	}
	
	public WebElement getName() {
			
		return driver.findElement(Name);	
	}
	public WebElement getEmail() {
		
		return driver.findElement(Email);	
	}
	public WebElement getPhone() {
		
		return driver.findElement(Phone);	
	}
	public WebElement getAddress() {
		
		return driver.findElement(Address);	
	}
	public WebElement getLine1() {
		
		return driver.findElement(Line1);	
	}
	public WebElement getLine2() {
		
		return driver.findElement(Line2);	
	}
	public WebElement getCity() {
		
		return driver.findElement(City);	
	}
	public WebElement getState() {
		
		return driver.findElement(State);	
	}
	public WebElement getPin() {
		
		return driver.findElement(Pin);	
	}
	public WebElement getCountry() {
		
		return driver.findElement(Country);	
	}
	public WebElement getCancel() {
		
		return driver.findElement(Cancel);	
	}
	public WebElement getSave() {
		
		return driver.findElement(Save);	
	}
}
