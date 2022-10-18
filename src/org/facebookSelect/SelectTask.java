package org.facebookSelect;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectTask {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\sivaa\\selenium training\\SeleniumTraining\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/login.php");

//		driver.manage().window().maximize();
		Thread.sleep(3000);

		WebElement create = driver.findElement(By.xpath("//a[text()='Sign up for Facebook']"));
		create.click();

		Thread.sleep(2000);

		WebElement year = driver.findElement(By.id("year"));

		Select s = new Select(year);

		System.out.println("*****First 5 values from dropdown******");

		List<WebElement> first = s.getOptions();

		for (int i = 0; i < 5; i++) {

			WebElement webElement = first.get(i);
			String text = webElement.getText();
			System.out.println(text);

		}

		System.out.println("*****Last 5 values from dropdown*****");

		List<WebElement> lastOption = s.getOptions();

		for (int i = lastOption.size() - 1; i >= lastOption.size() - 5; i--) {

			WebElement last = lastOption.get(i);
			String txt1 = last.getText();
			System.out.println(txt1);

		}

		System.out.println("*****Middle 5 values from dropdown*****");

		List<WebElement> middle = s.getOptions();

		for (int i = middle.size() / 2; i < middle.size() ; --i) {

			WebElement middleop = middle.get(i);
			String txt2 = middleop.getText();
			System.out.println(txt2);

		}

		System.out.println("*****Odd 5 values from dropdown*****");

		List<WebElement> odd = s.getOptions();

		for (int i = 0; i < odd.size(); i++) {

			if (i % 2 != 0) {

				WebElement oddNo = odd.get(i);
				String txt3 = oddNo.getText();
				System.out.println(txt3);

			}

		}

		System.out.println("*****Even 5 values from dropdown*****");

		List<WebElement> even = s.getOptions();

		for (int i = 0; i < even.size(); i++) {

			if (i % 2 == 0) {

				WebElement evenNo = even.get(i);
				String txt4 = evenNo.getText();
				System.out.println(txt4);

			}

		}

		System.out.println("*****Increment of 5 values from dropdown*****");

		List<WebElement> inc = s.getOptions();

		for (int i = inc.size() - 1; i >= 0; i--) {

			if (i % 5 == 0) {

				WebElement incNo = inc.get(i);
				String txt5 = incNo.getText();
				System.out.println(txt5);

			}

		}

		System.out.println("*****Decrement of 5 values from dropdown");

		List<WebElement> dec = s.getOptions();

		for (int i = 0; i < dec.size(); i++) {

			if (i % 5 == 0) {

				WebElement decNo = dec.get(i);
				String txt6 = decNo.getText();
				System.out.println(txt6);

			}

		}

		driver.close();

		driver.quit();
	}
}
