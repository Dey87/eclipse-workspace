package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FilterPage {
	
	WebDriver driver;
	
	private By Add=By.xpath("//*[@id='add_Filter']/a");
	private By View=By.xpath("//*[@id='view_filter']/a");
	private By Edit=By.xpath("//*[@id='edit_filter']/a");
	private By Delete=By.xpath("//*[@id='delete_filter']/a");
	private By Rview=By.xpath("//*[@id='A7']/span");
	private By Redit=By.xpath("//*[@id='edit-filter']/a/span");
	private By Rdelete=By.xpath("//*[@id='delete-filter']/a/span");
	private By table1stRow=By.xpath("//*[@id='dtBasicExampleFilter']/tbody/tr[2]/td[1]");
	
	public FilterPage(WebDriver driver) {
		
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
	public WebElement gettable1stRow() {
		
		return driver.findElement(table1stRow);	
	}
}
