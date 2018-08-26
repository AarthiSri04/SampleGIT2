package sampleGIT;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class SampleGIT {

	@Test
	public void loginTest() throws IOException {

		WebDriver wd = new FirefoxDriver();
		wd.manage().window().maximize();
		wd.get("https://www.bing.com/");

		WebElement input = wd.findElement(By.name("q"));

		input.sendKeys("abc");
		input.submit();
		File src = ((TakesScreenshot) wd).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("D:\\Automation Testing\\SeleniumWorkspace\\SampleGIT\\screenshot\\screen.jpg"));
		
	}
}
