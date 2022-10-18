package org.adactin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Testing {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\sivaa\\selenium training\\SeleniumTraining\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://adactinhotelapp.com/");

		WebElement userName = driver.findElement(By.id("username"));
		userName.sendKeys("vijay4567");

		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("CLQ1W2");

		WebElement login = driver.findElement(By.name("login"));
		login.click();

		Thread.sleep(3000);

		WebElement location = driver.findElement(By.id("location"));
		Select s1 = new Select(location);
		s1.selectByValue("Sydney");

		WebElement hotel = driver.findElement(By.id("hotels"));
		Select s2 = new Select(hotel);
		s2.selectByValue("Hotel Sunshine");

		WebElement room = driver.findElement(By.id("room_type"));
		Select s3 = new Select(room);
		s3.selectByValue("Deluxe");

		WebElement nos = driver.findElement(By.id("room_nos"));
		Select s4 = new Select(nos);
		s4.selectByValue("1");

		WebElement checkIn = driver.findElement(By.id("datepick_in"));
		checkIn.clear();
		checkIn.sendKeys("29/09/2022");

		WebElement checkOut = driver.findElement(By.id("datepick_out"));
		checkOut.clear();
		checkOut.sendKeys("01/10/2022");

		WebElement adults = driver.findElement(By.id("adult_room"));
		Select s7 = new Select(adults);
		s7.selectByValue("1");

		WebElement children = driver.findElement(By.id("child_room"));
		Select s8 = new Select(children);
		s8.selectByValue("0");

		WebElement search = driver.findElement(By.id("Submit"));
		search.click();

		Thread.sleep(2000);

		WebElement radioB = driver.findElement(By.xpath("//input[@id='radiobutton_0']"));
		radioB.click();

		WebElement con = driver.findElement(By.id("continue"));
		con.click();

		WebElement firstName = driver.findElement(By.name("first_name"));
		firstName.sendKeys("vijay");

		WebElement lastName = driver.findElement(By.name("last_name"));
		lastName.sendKeys("sankar");

		WebElement address = driver.findElement(By.name("address"));
		address.sendKeys("calicut,kerala,india");

		WebElement cc = driver.findElement(By.id("cc_num"));
		cc.sendKeys("1478523694567891");

		WebElement type = driver.findElement(By.id("cc_type"));
		Select s9 = new Select(type);
		s9.selectByValue("VISA");

		WebElement expMonth = driver.findElement(By.id("cc_exp_month"));
		Select s10 = new Select(expMonth);
		s10.selectByValue("3");

		WebElement expYear = driver.findElement(By.id("cc_exp_year"));
		Select s11 = new Select(expYear);
		s11.selectByValue("2022");

		WebElement cvv = driver.findElement(By.id("cc_cvv"));
		cvv.sendKeys("456");

		WebElement book = driver.findElement(By.id("book_now"));
		book.click();
		
		Thread.sleep(5000);
		
		WebElement id = driver.findElement(By.xpath("//input[@id='order_no']"));
		String attribute = id.getAttribute("value");
		System.out.println(attribute);
		
		driver.close();
		driver.quit();
	}
}
