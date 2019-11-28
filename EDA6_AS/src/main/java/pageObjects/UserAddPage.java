package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class UserAddPage {
	
	WebDriver driver;
	
	private By Name=By.xpath("//*[@id='LabelFirstName']");
	private By MiddleName=By.xpath("//*[@id='AddUser']/div/div/div[1]/div[2]/ul/li[2]/ul/li[1]/input");
	
	private By LastName=By.xpath("//*[@id='AddUser']/div/div/div[1]/div[2]/ul/li[2]/ul/li[2]/input");
	
	private By SelectRole=By.xpath("//*[@id='rolelist']/div/button/span[1]");
	private By SearchRole=By.xpath("//*[@id='rolelist']/div/div/div/input");
	private By ChooseRole=By.xpath("//*[@id='rolelist']/div/div/ul/li[2]");
	
	private By Email=By.xpath("//*[@id='validatemail']");
	private By Username=By.xpath("//*[@id='txtUserName']");
	
	private By PhoneNo=By.xpath("//*[@id='contactno']");
	
	private By SelectLang=By.xpath("//*[@id='languageList1']/div/button/span[1]");
	private By ChooseLang=By.xpath("//*[@id='languageList1']/div/div/ul/li[2]/a/span[1]");
	
	private By ActiveCheckbox=By.xpath("//*[@id='isActiveUser']");
	private By AddLine1=By.xpath("//*[@id='divmenu']/li[2]/ul/li[1]/input");
	private By AddLine2=By.xpath("//*[@id='divmenu']/li[2]/ul/li[2]/input");
	private By City=By.xpath("//*[@id='divmenu']/li[3]/ul/li[1]/input");
	private By State=By.xpath("//*[@id='divmenu']/li[3]/ul/li[2]/input");
	
	private By Pin=By.xpath("//*[@id='divmenu']/li[4]/ul/li[1]/input");
	private By Country=By.xpath("//*[@id='divmenu']/li[4]/ul/li[2]/input");
	
	private By Cancel=By.xpath("//*[@id='btnCanceluser']");
	private By Save=By.id("btnSaveUser");
	
	private By DuplicateError=By.id("error");

	
	public UserAddPage(WebDriver driver) {
		
		this.driver=driver;
		
	}
	
	public WebElement getName() {
			
		return driver.findElement(Name);	
	}
	public WebElement getMiddleName() {
		
		return driver.findElement(MiddleName);	
	}
	public WebElement getLastName() {
		
		return driver.findElement(LastName);	
	}
	public WebElement getSelectRole() {
		
		return driver.findElement(SelectRole);	
	}
	public WebElement getSearchRole() {
		
		return driver.findElement(SearchRole);	
	}
	public WebElement getChooseRole() {
		
		return driver.findElement(ChooseRole);	
	}
	public WebElement getEmail() {
		
		return driver.findElement(Email);	
	}
	public WebElement getUsername() {
		
		return driver.findElement(Username);	
	}
	public WebElement getPhoneNo() {
		
		return driver.findElement(PhoneNo);	
	}
	public WebElement getSelectLang() {
		
		return driver.findElement(SelectLang);	
	}
	public WebElement getChooseLang() {
	 
	return driver.findElement(ChooseLang);	
}
	public WebElement getActiveCheckbox() {
		
		return driver.findElement(ActiveCheckbox);	
	}
	public WebElement getAddLine1() {
		
		return driver.findElement(AddLine1);	
	}
	public WebElement getAddLine2() {
		
		return driver.findElement(AddLine2);	
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
	public WebElement getDuplicateError() {
		
		return driver.findElement(DuplicateError);	
	}
}
