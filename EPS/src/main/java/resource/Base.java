package resource;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import pageObjects.LoginPage;

public class Base {
	
	public static WebDriver driver;
	public Properties prop;	
	public static int a=0;
	public static int b=0;
	
public WebDriver initializeDriver() throws IOException
{
	
 prop= new Properties();
FileInputStream fis=new FileInputStream("C:\\Users\\Arka\\eclipse-workspace\\EPS\\src\\main\\java\\resource\\Data.properties");

prop.load(fis);
String browserName=prop.getProperty("browser");
System.out.println(browserName);

if(browserName.equals("chrome"))
{
	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Arka\\eclipse-workspace\\EPS\\src\\main\\java\\resource\\chromedriver.exe");
	driver= new ChromeDriver();
		//execute in chrome driver
	
}
else if (browserName.equals("firefox"))
{
	System.setProperty("webdriver.gecko.driver", "C:\\Users\\Arka\\eclipse-workspace\\EPS\\src\\main\\java\\resource\\geckodriver.exe");
	 driver= new FirefoxDriver();
	//firefox code
}
else if (browserName.equals("IE"))
{
//	IE code
}

driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
return driver;


}

public void login() throws InterruptedException {

	LoginPage lp=new LoginPage(driver);
	lp.getLogin().click();
	Thread.sleep(1000);
	lp.getUsername().sendKeys(prop.getProperty("username"));
	lp.getPassword().sendKeys(prop.getProperty("password"));
	lp.getOk().click();
	
}

public void uploadFileWithRobot (String imagePath) {
    StringSelection stringSelection = new StringSelection(imagePath);
    Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
    clipboard.setContents(stringSelection, null);

    Robot robot = null;

    try {
        robot = new Robot();
    } catch (AWTException e) {
        e.printStackTrace();
    }

    robot.delay(250);
    robot.keyPress(KeyEvent.VK_ENTER);
    robot.keyRelease(KeyEvent.VK_ENTER);
    robot.keyPress(KeyEvent.VK_CONTROL);
    robot.keyPress(KeyEvent.VK_V);
    robot.keyRelease(KeyEvent.VK_V);
    robot.keyRelease(KeyEvent.VK_CONTROL);
    robot.keyPress(KeyEvent.VK_ENTER);
    robot.delay(150);
    robot.keyRelease(KeyEvent.VK_ENTER);
}

public static boolean isPresentAndDisplayed(final WebElement element) {
    try {
      return element.isDisplayed();
    } catch (NoSuchElementException e) {
      return false;
    }
  }

public static void incrementp3()
{
    a++;
}

public static void incrementp4()
{
    b++;
}


}
