package sample;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

/**
 * @Test is mandatory for any test script, if we are not providing this annotation that test method will not
 * take part in execution 
 */
public class TestNGPractice {

	@Test(priority = 1, invocationCount = 0)
	public void createUser()
	{
		System.out.println("User created");
	}
	
	@Test(priority = 2/*, dependsOnMethods = {"createUser"}*/)
	public void modifyUser()
	{
		System.out.println("User modified");
	}
	
	@Ignore
	@Test(priority = 3)
	public void deleteUser()
	{
		System.out.println("User deleted");
	}
}
