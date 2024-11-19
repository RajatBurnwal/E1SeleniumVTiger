package sample;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.manage().window().maximize();
		
		WebElement ele=driver.findElement(By.xpath("//input[@class='Pke_EE']"));
		ele.sendKeys("iphone");
		
		driver.navigate().refresh();
		
		ele.sendKeys("iphone");

	}

}
