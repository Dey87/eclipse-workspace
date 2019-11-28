package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class InfographicPage {

public WebDriver driver;
	
	private By ok=By.id("btnInfo");
	
	
	public InfographicPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		
		this.driver=driver;
		
	}




	public WebElement getOk()
	{
		return driver.findElement(ok);
	}
}
