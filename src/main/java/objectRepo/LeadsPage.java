package objectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * This is a POM class for Leads Page
 * @author rajat burnwal
 * @version 24.10.24
 */
public class LeadsPage {

	@FindBy(xpath = "//img[@title='Create Lead...']")
	private WebElement createNewLeadIcon;
	
	public LeadsPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getCreateNewLeadIcon() {
		return createNewLeadIcon;
	}
	
	/**
	 * This is a business library to click on Create New Lead Icon in Leads Page
	 */
	public void clickOnCreateNewLeadIcon()
	{
		getCreateNewLeadIcon().click();
	}
}
