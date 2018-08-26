package sampleGIT;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class SampleGIT {

	@Test
	public void loginTest() {

		WebDriver wd = new FirefoxDriver();
		wd.manage().window().maximize();
		wd.get("https://www.bing.com/");

		WebElement input = wd.findElement(By.name("q"));

		input.sendKeys("abc");
		input.submit();

	}
}
