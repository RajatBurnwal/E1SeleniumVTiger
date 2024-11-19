package tcRepo;

import org.testng.annotations.Test;

import genericUtility.BaseClass;
import objectRepo.CreatingNewOrganizationPage;
import objectRepo.HomePage;
import objectRepo.OrganizationsPage;

public class TC_006 extends BaseClass{

	@Test(groups = {"Smoke","Regression"})
	public void ORG_02() throws Exception
	{
		HomePage hp=new HomePage(driver);
		hp.clickOnOrganizationsMenu();
		OrganizationsPage op=new OrganizationsPage(driver);
		op.clickOnCreateNewOrganizationIcon();
		String orgName=eUtil.getDataFromExcel("Organizations", 5, 1);
		String website=eUtil.getDataFromExcel("Organizations", 5, 2);
		String employees=eUtil.getDataFromExcel("Organizations", 5, 3);
		String phone=eUtil.getDataFromExcel("Organizations", 5, 4);
		String otherPhone=eUtil.getDataFromExcel("Organizations", 5, 5);
		String email=eUtil.getDataFromExcel("Organizations", 5, 6);
		CreatingNewOrganizationPage cop=new CreatingNewOrganizationPage(driver);
		cop.createNewOrganization(orgName, website, employees, phone, otherPhone, email);
		System.out.println("Test 6 executed");
	}
}
