package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WelcomePage {

public WebDriver driver;
	
	private By infographic=By.xpath("//*[@id='form1']/div[5]/input[1]");
	private By signIn=By.cssSelector("input[value='Sign In']");
	private By faq=By.cssSelector("input[value='FAQ']");
	
	
	
	
	
	public WelcomePage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		
		this.driver=driver;
		
	}




	public WebElement getinfographic()
	{
		return driver.findElement(infographic);
	}
	public WebElement getsignIn()
	{
		return driver.findElement(signIn);
	}
	public WebElement getfaq()
	{
		return driver.findElement(faq);
	}
}
