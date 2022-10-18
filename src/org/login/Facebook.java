package org.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\sivaa\\selenium training\\SeleniumTraining\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/login.php");

		driver.manage().window().maximize();

		WebElement userName = driver.findElement(By.id("email"));
		userName.sendKeys("vijay123");

	}

}
