package sample;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertionPractice {

	@Test
	public void strictComparisonSoftAssert()
	{
		String expectedValue="raja";
		String actualValue="Raja";
		SoftAssert s=new SoftAssert();
		s.assertEquals(actualValue, expectedValue);
		System.out.println("Strict compariosn soft assertion completed");
		s.assertAll();
	}
	
	@Test
	public void containsComparisonSoftAssert()
	{
		String expectedValue="corn";
		String actualValue="babycorn";
		SoftAssert s=new SoftAssert();
		s.assertFalse(actualValue.contains(expectedValue));
		System.out.println("Contains comparison soft assertion completed");
		s.assertAll();
	}
}
