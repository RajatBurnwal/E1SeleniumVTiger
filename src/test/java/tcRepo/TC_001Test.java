package tcRepo;

import org.testng.annotations.Test;

import genericUtility.BaseClass;
import objectRepo.CreatingNewLeadPage;
import objectRepo.HomePage;
import objectRepo.LeadsPage;

public class TC_001Test extends BaseClass{

	@Test
	public void LE_01Test() throws Exception
	{
		System.out.println("Test method started");
		HomePage hp=new HomePage(driver);
		hp.clickOnLeadsMenu();
		LeadsPage lep=new LeadsPage(driver);
		lep.clickOnCreateNewLeadIcon();
		String fName=eUtil.getDataFromExcel("Leads", 2, 1);
		String lName=eUtil.getDataFromExcel("Leads", 2, 2);
		String company=eUtil.getDataFromExcel("Leads", 2, 3);
		CreatingNewLeadPage cnl=new CreatingNewLeadPage(driver);
		cnl.createNewLead(fName, lName, company);
	}
}
