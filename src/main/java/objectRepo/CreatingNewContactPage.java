package objectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * This is a CreateNewContact POM Class
 * @author rajat burnwal
 * @version 24.10.25
 */
public class CreatingNewContactPage {

	@FindBy(xpath = "//input[@name='firstname']")
	private WebElement firstName;
	
	@FindBy(xpath = "//input[@name='lastname']")
	private WebElement lastName;
	
	@FindBy(xpath = "//input[@name='title']")
	private WebElement title;
	
	@FindBy(xpath = "//input[@title='Save [Alt+S]']")
	private WebElement saveButton;
	
	public CreatingNewContactPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getFirstName() {
		return firstName;
	}

	public WebElement getLastName() {
		return lastName;
	}

	public WebElement getTitle() {
		return title;
	}

	public WebElement getSaveButton() {
		return saveButton;
	}
	
	/**
	 * This is a business library to create a new contact
	 * @param fName
	 * @param lName
	 * @param title
	 */
	public void createNewContact(String fName, String lName, String title)
	{
		getFirstName().sendKeys(fName);
		getLastName().sendKeys(lName);
		getTitle().sendKeys(title);
		getSaveButton().click();
	}
}
