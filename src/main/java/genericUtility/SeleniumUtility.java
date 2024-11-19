package genericUtility;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.google.common.io.Files;

/**
 * This is an Utility class which has all the Selenium related methods
 */
public class SeleniumUtility {

	/**
	 * This is a generic method to provide implicit wait
	 * @param driver
	 * @param maxTime
	 */
	public void implicitWait(WebDriver driver, int maxTime)
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(maxTime));
	}
	
	///////******Dropdown handling methods*******////////
	
	/**
	 * This is a generic method to select and option from a dropdown based on index
	 * @param dropdownElement
	 * @param index
	 */
	public void selectOptionByIndex(WebElement dropdownElement, int index)
	{
		Select sel=new Select(dropdownElement);
		sel.selectByIndex(index);
	}
	
	/**
	 * This is a generic method to select and option from a dropdown based on value attribute
	 * @param dropdownElement
	 * @param value
	 */
	public void selectOptionByValue(WebElement dropdownElement, String value)
	{
		Select sel=new Select(dropdownElement);
		sel.selectByValue(value);
	}
	
	/**
	 * This is a generic method to select and option from a dropdown based on visible text
	 * @param dropdownElement
	 * @param text
	 */
	public void selectOptionByVisibleText(WebElement dropdownElement, String text)
	{
		Select sel=new Select(dropdownElement);
		sel.selectByVisibleText(text);
	}
	
	//////*******Alert handling methods******///////
	
	/**
	 * This is a generic method to switch to an alert and accept it
	 * @param driver
	 */
	public void acceptAlert(WebDriver driver)
	{
		driver.switchTo().alert().accept();
	}
	
	/**
	 * This is a generic method to switch to an alert and dismiss it
	 * @param driver
	 */
	public void cancelAlert(WebDriver driver)
	{
		driver.switchTo().alert().dismiss();
	}
	
	/**
	 * This is a generic method to switch to an alert and get the alert message
	 * @param driver
	 * @return
	 */
	public String getAlertMessage(WebDriver driver)
	{
		String value=driver.switchTo().alert().getText();
		return value;
	}
	
	/**
	 * This is a generic method to switch to an alert and pass values to it
	 * @param driver
	 * @param value
	 */
	public void sendAlertMessage(WebDriver driver, String value)
	{
		driver.switchTo().alert().sendKeys(value);;
	}
	
	//////*******Frame handling methods******///////
	
	/**
	 * This is a generic method to switch to a frame based on its index
	 * @param driver
	 * @param index
	 */
	public void switchToFrame(WebDriver driver, int index)
	{
		driver.switchTo().frame(index);
	}
	
	/**
	 * This is a generic method to switch to a frame based on its name or id attribute value
	 * @param driver
	 * @param nameOrIdAttribute
	 */
	public void switchToFrame(WebDriver driver, String nameOrIdAttribute)
	{
		driver.switchTo().frame(nameOrIdAttribute);
	}
	
	/**
	 * This is a generic method to switch to a frame based on the frame webelement
	 * @param driver
	 * @param frameElement
	 */
	public void switchToFrame(WebDriver driver, WebElement frameElement)
	{
		driver.switchTo().frame(frameElement);
	}
	
	///////*******
	/**
	 * This is a generic method to perform maximization of window
	 * @param driver
	 */
	public void maximizeWindow(WebDriver driver)
	{
		driver.manage().window().maximize();
	}
	
	/**
	 * This is a generic method to navigate to an application
	 * @param driver
	 * @param url
	 */
	public void navigateToUrl(WebDriver driver, String url)
	{
		driver.get(url);
	}
	
	/**
	 * This is a generic method to capture the screenshot
	 * @param driver
	 * @param screenshotName
	 * @throws Exception
	 */
	public String captureScreenshot(WebDriver driver, String screenshotName) throws Exception
	{
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File dest=new File("./Screenshot/"+screenshotName+".png");
		Files.copy(src, dest);
		return dest.getAbsolutePath();		//used in Extent Reports
	}
}
