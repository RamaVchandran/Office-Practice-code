package org.browser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day_2 {

	public static void main(String[] args) {
		// configure Driver
		//System.setProperty("webdriver.chrome.driver","D:\\Automate tools\\Training\\Browser launch\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//Launch browser
		
		driver.get("https://www.redbus.in/");
		
		WebElement from = driver.findElement(By.id("src"));
		from.sendKeys("Chennai");
		WebElement To = driver.findElement(By.id("dest"));
		To.sendKeys("Madurai");
		driver.close();
		
		

	}

}
