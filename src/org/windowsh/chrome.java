package org.windowsh;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class chrome {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\\\Users\\\\sivaa\\\\selenium training\\\\SeleniumTraining\\\\driver\\\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		driver.manage().window().maximize();
		
		WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
		search.sendKeys("iphone",Keys.ENTER);
		
		WebElement iphone = driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[3]"));
		iphone.click();
		
		String wH = driver.getWindowHandle();
		System.out.println(wH);
		
		Set<String> wHS = driver.getWindowHandles();
		System.out.println(wHS);
	
		int count = 0;
		for (String ind : wHS) {
			count++;
			System.out.println(ind);
			if (count == 3) {		
				driver.switchTo().window(wH);
			}
			
		}
		
	}
}
