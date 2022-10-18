package org.srcsht;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookSrc {

	public static void main(String[] args) throws InterruptedException, IOException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\sivaa\\selenium training\\SeleniumTraining\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/login.php");

		driver.manage().window().maximize();

		Thread.sleep(2000);

		TakesScreenshot ts = (TakesScreenshot) driver;

		File source = ts.getScreenshotAs(OutputType.FILE);

		File target = new File("C:\\Users\\sivaa\\OneDrive\\Pictures\\Screenshots\\page.jpeg");

		WebElement userName = driver.findElement(By.id("email"));
		userName.sendKeys("deku1234");

		Thread.sleep(2000);

		TakesScreenshot ts1 = (TakesScreenshot) driver;

		File source1 = ts1.getScreenshotAs(OutputType.FILE);

		File target1 = new File("C:\\Users\\sivaa\\OneDrive\\Pictures\\Screenshots\\user.jpeg");

		WebElement password = driver.findElement(By.id("pass"));
		password.sendKeys("12345678");

		Thread.sleep(2000);

		TakesScreenshot ts2 = (TakesScreenshot) driver;

		File target2 = new File("C:\\Users\\sivaa\\OneDrive\\Pictures\\Screenshots\\pass.jpeg");

		File source2 = ts2.getScreenshotAs(OutputType.FILE);

		WebElement button = driver.findElement(By.xpath("//button[@name='login']"));
		button.click();

		Thread.sleep(3000);

		TakesScreenshot ts3 = (TakesScreenshot) driver;

		File source3 = ts3.getScreenshotAs(OutputType.FILE);

		File target3 = new File("C:\\Users\\sivaa\\OneDrive\\Pictures\\Screenshots\\click.jpeg");

		FileUtils.copyFile(source, target);
		FileUtils.copyFile(source1, target1);
		FileUtils.copyFile(source2, target2);
		FileUtils.copyFile(source3, target3);
		
		
		driver.close();
		driver.quit();

	}

}
