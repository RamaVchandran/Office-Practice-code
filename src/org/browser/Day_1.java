package org.browser;

import javax.swing.Popup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Day_1 {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Automate tools\\Training\\Browser launch\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		WebElement poPup = driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']"));
		poPup.click();
		WebElement lableOne=driver.findElement(By.xpath("//span[text()='Electronics']"));
		Actions acc = new Actions(driver);
		acc.moveToElement(lableOne).perform();
	}

}
