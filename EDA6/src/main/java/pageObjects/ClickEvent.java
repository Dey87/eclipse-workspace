package pageObjects;

import java.util.NoSuchElementException;

import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ClickEvent {

	public WebDriver driver;
	public ClickEvent(WebDriver driver)
	{
		
		this.driver=driver;
	}
	
	 public void rightClick(WebElement element) {
	        try {
	            Actions action = new Actions(driver).contextClick(element);
	            action.build().perform();

	            System.out.println("Sucessfully Right clicked on the element");
	        } catch (StaleElementReferenceException e) {
	            System.out.println("Element is not attached to the page document "
	                    + e.getStackTrace());
	        } catch (NoSuchElementException e) {
	            System.out.println("Element " + element + " was not found in DOM "
	                    + e.getStackTrace());
	        } catch (Exception e) {
	            System.out.println("Element " + element + " was not clickable "
	                    + e.getStackTrace());
	        }
	    }
}
