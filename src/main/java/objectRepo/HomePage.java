package objectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * This is a POM class for Home Page
 * @author rajat burnwal
 * @version 24.10.24
 */
public class HomePage {

	@FindBy(xpath ="//td[@class='tabUnSelected']/a[text()='Leads']")
	private WebElement leadsMenu;
	
	@FindBy(xpath = "//td[@class='tabUnSelected']/a[text()='Organizations']")
	private WebElement organizationsMenu;
	
	@FindBy(xpath = "//td[@class='tabUnSelected']/a[text()='Contacts']")
	private WebElement contactsMenu;
	
	@FindBy(xpath = "//img[@src='themes/softed/images/user.PNG']")
	private WebElement accountIcon;
	
	@FindBy(xpath = "//a[text()='Sign Out']")
	private WebElement signOutoption;
	
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);	
	}

	public WebElement getLeadsMenu() {
		return leadsMenu;
	}

	public WebElement getOrganizationsMenu() {
		return organizationsMenu;
	}

	public WebElement getContactsMenu() {
		return contactsMenu;
	}

	public WebElement getAccountIcon() {
		return accountIcon;
	}

	public WebElement getSignOutoption() {
		return signOutoption;
	}
	
	/**
	 * This is a business library to click on Leads Menu in the application
	 */
	public void clickOnLeadsMenu()
	{
		getLeadsMenu().click();
	}
	
	/**
	 * This is a business library to click on Organizations Menu in the application
	 */
	public void clickOnOrganizationsMenu()
	{
		getOrganizationsMenu().click();
	}
	
	/**
	 * This is a business library to click on Contacts Menu in the application
	 */
	public void clickOnContactsMenu()
	{
		getContactsMenu().click();
	}
	
	/**
	 * This is a business library to perform sign out operation
	 * @param driver
	 */
	public void signOutOperation(WebDriver driver)
	{
		Actions act=new Actions(driver);
		act.moveToElement(getAccountIcon()).perform();
		getSignOutoption().click();
	}
}
