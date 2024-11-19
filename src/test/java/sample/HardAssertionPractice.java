package sample;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertionPractice {

	@Test
	public void strictComparisonHardAssert()
	{
		String expectedValue="robin";
		String actualvalue="robin";
		Assert.assertEquals(actualvalue, expectedValue);
		System.out.println("Assertion completed");
	}
	
	@Test
	public void containsComparisonHardAssert()
	{
		String expectedValue="Don";
		String actualValue="london";
		Assert.assertTrue(actualValue.contains(expectedValue));
		System.out.println("Contains comparison completed");
	}
}
