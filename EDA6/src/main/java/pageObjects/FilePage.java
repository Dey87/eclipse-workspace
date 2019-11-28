package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FilePage {
	
	WebDriver driver;
	
	private By View_files=By.xpath("//*[@id='Files']/span");
	private By Upload_Files=By.xpath("//*[@id='rootMenu']/div[1]/ul/li[2]/a/span");
	private By Browse=By.xpath("//*[@id='main1']/div[2]/div/div[2]/div/div/div/div/ul/li[5]/div/ul/li[2]/label");
	private By Upload_Button=By.xpath("//*[@id='uploaddoc']");
	private By fileList=By.xpath("//*[@id='312 ']");
	private By fileList1=By.xpath("//*[@id='314 ']");
	private By UploadNewVersion=By.xpath("//*[@id='A6']/span");
	private By UploadRelatedFiles=By.xpath("//*[@id='A19']/span");
	private By TagSign=By.xpath("//*[@id='main1']/div[2]/div/div[3]/div/div[2]/div[1]/ul/li[3]/div/span");
	private By TagInput=By.xpath("//*[@id='main1']/div[2]/div/div[3]/div/div[2]/div[1]/ul/li[3]/div/div/tags-input/div/div/input");
	private By BackButton=By.xpath("//*[@id='main1']/div[2]/div[2]/div[1]/div[2]/div[1]/ul/li[2]/a/span");
	private By TagsSubmitButton=By.xpath("//*[@id='main1']/div[2]/div[2]/div[3]/div[2]/div[2]/div[2]/span/button");
	
	
	public FilePage(WebDriver driver) {
		
		this.driver=driver;
		
	}
	
	public WebElement getView_files() {
			
		return driver.findElement(View_files);	
	}
	public WebElement getUpload_Files() {
		
		return driver.findElement(Upload_Files);	
	}
	public WebElement getBrowse() {
		
		return driver.findElement(Browse);	
	}
	public WebElement getUpload_Button() {
		
		return driver.findElement(Upload_Button);	
	}
	public WebElement getfileList() {
		
		return driver.findElement(fileList);	
	}
	public WebElement getfileList1() {
		
		return driver.findElement(fileList1);	
	}
	public WebElement getUploadNewVersion() {
		
		return driver.findElement(UploadNewVersion);	
	}
	public WebElement getUploadRelatedFiles() {
		
		return driver.findElement(UploadRelatedFiles);	
	}
	public WebElement getTagSign() {
			
			return driver.findElement(TagSign);	
		}
	public WebElement getTagInput() {
		
		return driver.findElement(TagInput);	
	}
	public WebElement getBackButton() {
		
		return driver.findElement(BackButton);	
	}
	public WebElement getTagsSubmitButton() {
		
		return driver.findElement(TagsSubmitButton);	
	}
	
}
