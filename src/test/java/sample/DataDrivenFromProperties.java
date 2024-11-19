package sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import genericUtility.PropertiesUtility;

public class DataDrivenFromProperties {

	public static void main(String[] args) throws Exception {
		
		WebDriver driver=new ChromeDriver();
		PropertiesUtility p=new PropertiesUtility();
		String URL=p.getDataFromPropertiesFile("url");
		String UN=p.getDataFromPropertiesFile("username");
		System.out.println(URL);
		System.out.println(UN);
		driver.get(URL);

	}

}
