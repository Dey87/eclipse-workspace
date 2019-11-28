package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

public WebDriver driver;
	
	private By username=By.xpath("//input[@data-ng-model='Username']");
	private By password=By.cssSelector("input[data-ng-model='Password']");
	private By submit=By.id("btnSubmit");
	private By reset=By.cssSelector("input[value='Reset']");
	private By sessionOut=By.id("btnSubmit_Seesioncheck");
	
	
	
	
	
	public LoginPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		
		this.driver=driver;
		
	}


	public WebElement getUsername()
	{
		return driver.findElement(username);
	}
	public WebElement getPassword()
	{
		return driver.findElement(password);
	}
	public WebElement getSubmit()
	{
		return driver.findElement(submit);
	}
	public WebElement getReset()
	{
		return driver.findElement(reset);
	}
	public WebElement getSessionOut()
	{
		return driver.findElement(sessionOut);
	}
}
