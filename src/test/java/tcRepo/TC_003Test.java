package tcRepo;

import org.testng.Assert;
import org.testng.annotations.Test;

import genericUtility.BaseClass;
import objectRepo.CreatingNewLeadPage;
import objectRepo.HomePage;
import objectRepo.LeadsPage;

public class TC_003Test extends BaseClass{

	@Test
	public void LE_03() throws Exception
	{
		System.out.println("Test method 3 started");
		HomePage hp=new HomePage(driver);
		hp.clickOnLeadsMenu();
		LeadsPage lep=new LeadsPage(driver);
		lep.clickOnCreateNewLeadIcon();
//		Assert.fail();
		String fName=eUtil.getDataFromExcel("Leads", 2, 1);
		String lName=eUtil.getDataFromExcel("Leads", 2, 2);
		String company=eUtil.getDataFromExcel("Leads", 2, 3);
		String title=eUtil.getDataFromExcel("Leads", 2, 4);
		String phone=eUtil.getDataFromExcel("Leads", 2, 5);
		String mobile=eUtil.getDataFromExcel("Leads", 2, 6);
		String email=eUtil.getDataFromExcel("Leads", 2, 7);
		String noOfEmployees=eUtil.getDataFromExcel("Leads", 2, 8);
		CreatingNewLeadPage cnl=new CreatingNewLeadPage(driver);
		cnl.createNewLead(fName, lName, company, title, mobile, phone, email, noOfEmployees);
		System.out.println("Test method 3 executed");
	}
	
	@Test
	public void sample()
	{
		System.out.println("executing sample");
	}
}
