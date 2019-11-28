package edaTest;

import java.io.IOException;
import java.util.Random;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pageObjects.FilePage;
import pageObjects.LandingPage;
import pageObjects.LoginPage;
import resource.Base;



public class Tag_Search_Test extends Base {
	public static Logger log =LogManager.getLogger(Tag_Search_Test.class.getName());	
	@BeforeTest
	public void initialize() throws IOException
	{
	
		 driver =initializeDriver();
		 driver.get(prop.getProperty("url"));
		 //driver.manage().deleteAllCookies();
		 driver.manage().window().maximize();
	}
	
	@Test
	public void  File_Tag() throws IOException, InterruptedException
	{

		//driver.get(prop.getProperty("url"));
		/*WelcomePage wp=new WelcomePage(driver);
		Thread.sleep(2000);
		wp.getsignIn().click();*/
		
		LoginPage lip=new LoginPage(driver);
		lip.getUsername().clear();
		lip.getUsername().sendKeys(prop.getProperty("username"));
		lip.getPassword().clear();
		lip.getPassword().sendKeys(prop.getProperty("password"));
		Thread.sleep(2000);
		lip.getSubmit().click();
		Thread.sleep(2000);
		if (lip.getSessionOut().isDisplayed()) {
			lip.getSessionOut().click();
	     }
		
		Thread.sleep(2000);
		
		LandingPage LP=new LandingPage(driver);
		LP.getFiles().click();
		Thread.sleep(2000);
		FilePage fp=new FilePage(driver);
		Thread.sleep(2000);
		fp.getView_files().click();
		Thread.sleep(2000);
		log.info("done1");
		fp.getfileList().click();
		log.info("selected 1st file");
		Thread.sleep(2000);
		Actions action = new Actions(driver);
		//WebElement we = webdriver.findElement(By.xpath("//html/body/div[13]/ul/li[4]/a"));
		action.moveToElement(fp.getTagSign()).build().perform();
		Thread.sleep(1000);
		Random randVal=new Random();
		int randInt=randVal.nextInt(1000);
		int randInt1=randVal.nextInt(1000);
		int randInt2=randVal.nextInt(1000);
		fp.getTagInput().sendKeys("TagTest"+randInt);
		fp.getTagInput().sendKeys(Keys.RETURN);
		fp.getTagInput().sendKeys("TagTest"+randInt1);
		fp.getTagInput().sendKeys(Keys.RETURN);
		fp.getBackButton().click();
		// for 2nd file
		fp.getfileList1().click();
		log.info("selected 2nd file");
		Thread.sleep(2000);
		action.moveToElement(fp.getTagSign()).build().perform();
		Thread.sleep(1000);
		fp.getTagInput().sendKeys("TagTest"+randInt);
		fp.getTagInput().sendKeys(Keys.RETURN);
		fp.getTagInput().sendKeys("TagTest"+randInt2);
		fp.getTagInput().sendKeys(Keys.RETURN);
		fp.getBackButton().click();
		//1st tag test(the tag is present in both file)
		driver.findElement(By.xpath("//*[@id='TreeTagTest"+randInt+"']"));
		fp.getTagsSubmitButton().click();
		log.info("the both files will come");
		if(fp.getfileList().isDisplayed()&&fp.getfileList1().isDisplayed()) {
			log.info("TestCase passed for the tag is present in both file ");
		}
		else {
			log.info("TestCase Fail for the tag is present in both file ");
		}
		
		//2nd tag test(one tag is present in both file and another is present in a single file)
		driver.findElement(By.xpath("//*[@id='TreeTagTest"+randInt2+"']"));
		fp.getTagsSubmitButton().click();
		log.info("just one file will come");
		if(fp.getfileList().isDisplayed()) {
			log.info("TestCase passed for one tag is present in both file and another is present in a single file");
		}
		else {
			log.info("TestCase Fail for one tag is present in both file and another is present in a single file");
		}
		
		//3rd tag test(both tag is present in different file)
		driver.findElement(By.xpath("//*[@id='TreeTagTest"+randInt+"']"));
		driver.findElement(By.xpath("//*[@id='TreeTagTest"+randInt1+"']"));
		fp.getTagsSubmitButton().click();
		log.info("no file will show");
		if(fp.getfileList1().isDisplayed()) {
			log.info("TestCase passed for both tag is present in different file ");
		}
		else {
			log.info("TestCase Fail for both tag is present in different file");
		}
		
		}

	
	
	@AfterTest
	public void teardown()
	{
		
		driver.close();
		driver=null;
		
	}
	

}
