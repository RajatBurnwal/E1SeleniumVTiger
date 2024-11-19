package tcRepo;

import org.testng.annotations.Test;

import genericUtility.BaseClass;
import objectRepo.CreatingNewLeadPage;
import objectRepo.HomePage;
import objectRepo.LeadsPage;

public class TC_002Test extends BaseClass{

	@Test
	public void LE_02Test() throws Exception
	{
		System.out.println("Test method 2 started");
		HomePage hp=new HomePage(driver);
		hp.clickOnLeadsMenu();
		LeadsPage lep=new LeadsPage(driver);
		lep.clickOnCreateNewLeadIcon();
		String fName=eUtil.getDataFromExcel("Leads", 2, 1);
		String lName=eUtil.getDataFromExcel("Leads", 2, 2);
		String company=eUtil.getDataFromExcel("Leads", 2, 3);
		String title=eUtil.getDataFromExcel("Leads", 2, 4);
		String phone=eUtil.getDataFromExcel("Leads", 2, 5);
		String mobile=eUtil.getDataFromExcel("Leads", 2, 6);
		String email=eUtil.getDataFromExcel("Leads", 2, 7);
		String noOfEmployees=eUtil.getDataFromExcel("Leads", 2, 8);
		String street=eUtil.getDataFromExcel("Leads", 2, 9);
		String poBox=eUtil.getDataFromExcel("Leads", 2, 10);
		String postalCode=eUtil.getDataFromExcel("Leads", 2, 11);
		String city=eUtil.getDataFromExcel("Leads", 2, 12);
		String country=eUtil.getDataFromExcel("Leads", 2, 13);
		String state=eUtil.getDataFromExcel("Leads", 2, 14);
		CreatingNewLeadPage cnl=new CreatingNewLeadPage(driver);
		cnl.createNewLead(fName, lName, company, title, mobile, phone, email, noOfEmployees, street, poBox, postalCode, city, country, state);
		System.out.println("Test method 2 executed");
	}
}
