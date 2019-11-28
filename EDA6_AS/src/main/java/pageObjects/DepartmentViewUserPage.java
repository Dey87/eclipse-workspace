package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DepartmentViewUserPage {
	
	WebDriver driver;
	
	private By View_user=By.xpath("//*[@id='view_user']");
	private By Edit_user=By.xpath("//*[@id='edit_user']");
	private By Active_user=By.xpath("//*[@id='active_user']");
	private By Rview_user=By.xpath("//*[@id='viewUser']/a");
	private By Redit_user=By.xpath("//*[@id='editUser']/a");
	private By Ractive_user=By.xpath("//*[@id='activeuser']/a");

	
	public DepartmentViewUserPage(WebDriver driver) {
		
		this.driver=driver;
		
	}
	
	public WebElement getView_user() {
			
		return driver.findElement(View_user);	
	}
	public WebElement getEdit_user() {
		
		return driver.findElement(Edit_user);	
	}
	public WebElement getActive_user() {
		
		return driver.findElement(Active_user);	
	}
	public WebElement getRview_user() {
		
		return driver.findElement(Rview_user);	
	}
	public WebElement getRedit_user() {
		
		return driver.findElement(Redit_user);	
	}
	public WebElement getRactive_user() {
		
		return driver.findElement(Ractive_user);	
	}
}
