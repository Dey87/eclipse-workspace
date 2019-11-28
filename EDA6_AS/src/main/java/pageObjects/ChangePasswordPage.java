package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ChangePasswordPage {
	
	WebDriver driver;
	
	private By User=By.xpath("/html/body/div[1]/div[1]/div[2]/div[1]/button");
	private By Profile=By.xpath("//*[@id='myDropdown']/ul/li[3]/ul/li[1]/a");
	private By ChangePasswordButton=By.xpath("//*[@id='changepassword']");
	private By OldPassword=By.xpath("//*[@id='changepassword_div']/div/div/div/div[1]/ul/li[1]/input");
	private By NewPassword=By.xpath("//*[@id='changepassword_div']/div/div/div/div[1]/ul/li[2]/div/input");
	private By ConfirmPassword=By.xpath("//*[@id='changepassword_div']/div/div/div/div[1]/ul/li[3]/input");
	private By Cancel=By.xpath("//*[@id='changepassword_div']/div/div/div/div[2]/div/ul/li/input[1]");
	private By Save=By.xpath("//*[@id='UpdatePassword']");
	private By SignOut=By.xpath("//*[@id='myDropdown']/ul/li[3]/ul/li[2]/a");

	
	public ChangePasswordPage(WebDriver driver) {
		
		this.driver=driver;
		
	}
	
	public WebElement getUser() {
			
		return driver.findElement(User);	
	}
	public WebElement getProfile() {
		
		return driver.findElement(Profile);	
	}
	public WebElement getChangePasswordButton() {
		
		return driver.findElement(ChangePasswordButton);	
	}
	public WebElement getOldPassword() {
		
		return driver.findElement(OldPassword);	
	}
	public WebElement getNewPassword() {
		
		return driver.findElement(NewPassword);	
	}
	public WebElement getConfirmPassword() {
		
		return driver.findElement(ConfirmPassword);	
	}
	public WebElement getCancel() {
		
		return driver.findElement(Cancel);	
	}
	public WebElement getSave() {
		
		return driver.findElement(Save);	
	}
	public WebElement getSignOut() {
		
		return driver.findElement(SignOut);	
	}
}
