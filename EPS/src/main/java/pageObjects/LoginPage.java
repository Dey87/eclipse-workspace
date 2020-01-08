package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

public WebDriver driver;
	
	private By Login=By.xpath("//a[@class='btn btn-primary']");
	private By Username=By.xpath("//input[@placeholder='Login']");
	private By Password=By.xpath("//input[@placeholder='Password']");
	private By Ok=By.xpath("//button[@id='login']");
	
	
	
	public LoginPage(WebDriver driver) {
		
		this.driver=driver;
		
	}


	public WebElement getLogin()
	{
		return driver.findElement(Login);
	}
	public WebElement getUsername()
	{
		return driver.findElement(Username);
	}
	public WebElement getPassword()
	{
		return driver.findElement(Password);
	}
	public WebElement getOk()
	{
		return driver.findElement(Ok);
	}
	
}
