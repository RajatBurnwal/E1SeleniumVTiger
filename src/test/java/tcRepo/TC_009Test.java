package tcRepo;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import genericUtility.BaseClass;
import objectRepo.ContactsPage;
import objectRepo.CreatingNewContactPage;
import objectRepo.HomePage;

@Listeners(genericUtility.LitsenersImplementation.class)
public class TC_009Test extends BaseClass{

	@Test
	public void CON_01() throws Exception
	{
		HomePage hp=new HomePage(driver);
		hp.clickOnContactsMenu();
		ContactsPage cp=new ContactsPage(driver);
		cp.clickOnCreateNewContactIcon();
//		Assert.fail();
		String fName=eUtil.getDataFromExcel("Contacts", 2, 1);
		String lName=eUtil.getDataFromExcel("Contacts", 2, 2);
		String title=eUtil.getDataFromExcel("Contacts", 2, 3);
		CreatingNewContactPage ccp=new CreatingNewContactPage(driver);
		ccp.createNewContact(fName, lName, title);
	}
}
