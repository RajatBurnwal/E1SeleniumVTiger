package objectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreatingNewOrganizationPage {

	@FindBy(xpath = "//input[@name='accountname']")
	private WebElement organizationName;
	
	@FindBy(xpath = "//input[@name='website']")
	private WebElement website;
	
	@FindBy(xpath = "//input[@name='employees']")
	private WebElement employees;
	
	@FindBy(xpath = "//input[@id='phone']")
	private WebElement phone;
	
	@FindBy(xpath = "//input[@id='otherphone']")
	private WebElement otherPhone;
	
	@FindBy(xpath = "//input[@id='email1']")
	private WebElement email;
	
	@FindBy(xpath = "//textarea[@name='bill_street']")
	private WebElement billingAddress;
	
	@FindBy(xpath = "//input[@id='bill_city']")
	private WebElement billingCity;
	
	@FindBy(xpath = "//input[@id='bill_state']")
	private WebElement billingState;
	
	@FindBy(xpath = "//input[@title='Save [Alt+S]']")
	private WebElement saveButton;
	
	public CreatingNewOrganizationPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getOrganizationName() {
		return organizationName;
	}

	public WebElement getWebsite() {
		return website;
	}

	public WebElement getEmployees() {
		return employees;
	}

	public WebElement getPhone() {
		return phone;
	}

	public WebElement getOtherPhone() {
		return otherPhone;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getBillingAddress() {
		return billingAddress;
	}

	public WebElement getBillingCity() {
		return billingCity;
	}

	public WebElement getBillingState() {
		return billingState;
	}

	public WebElement getSaveButton() {
		return saveButton;
	}
	
	/**
	 * This is a business library to create a new organization
	 * @param orgName
	 * @param website
	 * @param employees
	 */
	public void createNewOrganization(String orgName, String website, String employees)
	{
		getOrganizationName().sendKeys(orgName);
		getWebsite().sendKeys(website);
		getEmployees().sendKeys(employees);
		getSaveButton().click();
	}
	
	/**
	 * This is a business library to create a new organization
	 * @param orgName
	 * @param website
	 * @param employees
	 * @param phone
	 * @param otherPhone
	 * @param email
	 */
	public void createNewOrganization(String orgName, String website, String employees, String phone,
			String otherPhone, String email)
	{
		getOrganizationName().sendKeys(orgName);
		getWebsite().sendKeys(website);
		getEmployees().sendKeys(employees);
		getPhone().sendKeys(phone);
		getOtherPhone().sendKeys(otherPhone);
		getEmail().sendKeys(email);
		getSaveButton().click();
	}
	
	/**
	 * This is a business library to create a new organization
	 * @param orgName
	 * @param website
	 * @param billingAddress
	 * @param billingCity
	 * @param billingState
	 */
	public void createNewOrganization(String orgName, String website, String billingAddress,
			String billingCity, String billingState)
	{
		getOrganizationName().sendKeys(orgName);
		getWebsite().sendKeys(website);
		getBillingAddress().sendKeys(billingAddress);
		getBillingCity().sendKeys(billingCity);
		getBillingState().sendKeys(billingState);
		getSaveButton().click();
	}
	
	/**
	 * This is a business library to create a new organization
	 * @param orgName
	 * @param website
	 * @param employees
	 * @param phone
	 * @param otherPhone
	 * @param email
	 * @param billingAddress
	 * @param billingCity
	 * @param billingState
	 */
	public void createNewOrganization(String orgName, String website, String employees, String phone, 
			String otherPhone, String email, String billingAddress, String billingCity, String billingState)
	{
		getOrganizationName().sendKeys(orgName);
		getWebsite().sendKeys(website);
		getEmployees().sendKeys(employees);
		getPhone().sendKeys(phone);
		getOtherPhone().sendKeys(otherPhone);
		getEmail().sendKeys(email);
		getBillingAddress().sendKeys(billingAddress);
		getBillingCity().sendKeys(billingCity);
		getBillingState().sendKeys(billingState);
		getSaveButton().click();
	}
}
