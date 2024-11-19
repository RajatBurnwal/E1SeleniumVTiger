package tcRepo;

import org.testng.annotations.Test;

import genericUtility.BaseClass;
import objectRepo.CreatingNewOrganizationPage;
import objectRepo.HomePage;
import objectRepo.OrganizationsPage;

public class TC_007 extends BaseClass{

	@Test
	public void ORG_03() throws Exception
	{
		HomePage hp=new HomePage(driver);
		hp.clickOnOrganizationsMenu();
		OrganizationsPage op=new OrganizationsPage(driver);
		op.clickOnCreateNewOrganizationIcon();
		String orgName=eUtil.getDataFromExcel("Organizations", 8, 1);
		String website=eUtil.getDataFromExcel("Organizations", 8, 2);
		String billingAddress=eUtil.getDataFromExcel("Organizations", 8, 3);
		String billingCity=eUtil.getDataFromExcel("Organizations", 8, 4);
		String billingState=eUtil.getDataFromExcel("Organizations", 8, 5);
		CreatingNewOrganizationPage cop=new CreatingNewOrganizationPage(driver);
		cop.createNewOrganization(orgName, website, billingAddress, billingCity, billingState);
	}
}
