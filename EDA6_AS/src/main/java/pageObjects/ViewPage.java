package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ViewPage {
	
	WebDriver driver;
	
	private By Add=By.xpath("//*[@id='add_view']");
	private By View=By.xpath("//*[@id='show_view']");
	private By Edit=By.xpath("//*[@id='edit_view'] ");
	private By Delete=By.xpath("//*[@id='Delete_view']");
	private By Rview=By.xpath("//*[@id='A4']/span");
	private By Redit=By.xpath("//*[@id='editview']/a/span");
	private By Rdelete=By.xpath("//*[@id='Deleteview']/a/span");
	private By T1strow=By.xpath("//*[@id='dtBasicExampleView']/tbody/tr[2]/td[1]");
	private By SearchName=By.xpath("//*[@id='dtBasicExampleView']/tbody/tr[1]/td[1]/input");

	
	public ViewPage(WebDriver driver) {
		
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
	public WebElement getDelete() {
		
		return driver.findElement(Delete);	
	}
	public WebElement getRview() {
		
		return driver.findElement(Rview);	
	}
	public WebElement getRedit() {
		
		return driver.findElement(Redit);	
	}
	public WebElement getRdelete() {
		
		return driver.findElement(Rdelete);	
	}
	public WebElement getT1strow() {
		
		return driver.findElement(T1strow);	
	}
	public WebElement getSearchName() {
		
		return driver.findElement(SearchName);	
	}
}
