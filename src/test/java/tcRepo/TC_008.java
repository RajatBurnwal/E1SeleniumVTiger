package tcRepo;

import org.testng.annotations.Test;

import genericUtility.BaseClass;
import objectRepo.CreatingNewOrganizationPage;
import objectRepo.HomePage;
import objectRepo.OrganizationsPage;

public class TC_008 extends BaseClass{

	@Test
	public void ORG_04() throws Exception
	{
		HomePage hp=new HomePage(driver);
		hp.clickOnOrganizationsMenu();
		OrganizationsPage op=new OrganizationsPage(driver);
		op.clickOnCreateNewOrganizationIcon();
		String orgName=eUtil.getDataFromExcel("Organizations", 11, 1);
		String website=eUtil.getDataFromExcel("Organizations", 11, 2);
		String employees=eUtil.getDataFromExcel("Organizations", 11, 3);
		String phone=eUtil.getDataFromExcel("Organizations", 11, 4);
		String otherPhone=eUtil.getDataFromExcel("Organizations", 11, 5);
		String email=eUtil.getDataFromExcel("Organizations", 11, 6);
		String billingAddress=eUtil.getDataFromExcel("Organizations", 11, 7);
		String billingCity=eUtil.getDataFromExcel("Organizations", 11, 8);
		String billingState=eUtil.getDataFromExcel("Organizations", 11, 9);
		CreatingNewOrganizationPage cop=new CreatingNewOrganizationPage(driver);
		cop.createNewOrganization(orgName, website, employees, phone, otherPhone, email, billingAddress, billingCity, billingState);
	}
}
