package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class UserPage {
	
	WebDriver driver;
	
	private By Add=By.xpath("//*[@id='Add_user']");
	private By View=By.xpath("//*[@id='view_user']");
	private By Edit=By.xpath("//*[@id='edit_user']");
	private By InActive=By.xpath("//*[@id='active_user']");
	private By Rview=By.xpath("//*[@id='viewUser']");
	private By Redit=By.xpath("//*[@id='editUser']");
	private By RInActive=By.xpath("//*[@id='activeuser']");
	private By T1stRow=By.xpath("//*[@id='dtBasicExampleUser']/tbody/tr[2]/td[2]");

	
	public UserPage(WebDriver driver) {
		
		this.driver=driver;
		
	}
	
	public WebElement getAdd() {
			
		return driver.findElement(Add);	
	}
	public WebElement getView() {
		
		return driver.findElement(View);	
	}
	public WebElement getEdit() {
		
		return driver.findElement(Edit);	
	}
	public WebElement getInActive() {
		
		return driver.findElement(InActive);	
	}
	public WebElement getRview() {
		
		return driver.findElement(Rview);	
	}
	public WebElement getRedit() {
		
		return driver.findElement(Redit);	
	}
	public WebElement getRInActive() {
		
		return driver.findElement(RInActive);	
	}
	public WebElement getT1stRow() {
		
		return driver.findElement(T1stRow);	
	}
}
