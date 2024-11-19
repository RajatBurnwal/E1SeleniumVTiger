package objectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * This is a Organizations Page POM Class
 * @author rajat burnwal
 * @version 24.10.25
 */
public class OrganizationsPage {

	@FindBy(xpath = "//img[@title='Create Organization...']")
	private WebElement createNewOrganizationIcon;
	
	public OrganizationsPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getCreateNewOrganizationIcon() {
		return createNewOrganizationIcon;
	}
	
	/**
	 * This is a business library to click on Create New Organization Icon
	 */
	public void clickOnCreateNewOrganizationIcon()
	{
		getCreateNewOrganizationIcon().click();
	}
}
