package tcRepo;

import org.testng.annotations.Test;

import genericUtility.BaseClass;
import objectRepo.CreatingNewOrganizationPage;
import objectRepo.HomePage;
import objectRepo.OrganizationsPage;

public class TC_005 extends BaseClass{

	@Test(groups = "Smoke")
	public void ORG_01() throws Exception
	{
		HomePage hp=new HomePage(driver);
		hp.clickOnOrganizationsMenu();
		OrganizationsPage op=new OrganizationsPage(driver);
		op.clickOnCreateNewOrganizationIcon();
		String orgName=eUtil.getDataFromExcel("Organizations", 2, 1);
		String website=eUtil.getDataFromExcel("Organizations", 2, 2);
		String employees=eUtil.getDataFromExcel("Organizations", 2, 3);
		CreatingNewOrganizationPage cop=new CreatingNewOrganizationPage(driver);
		cop.createNewOrganization(orgName, website, employees);
		System.out.println("Test 5 executed");
	}
}
