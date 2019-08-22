package org.browser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day6 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Automate tools\\Training\\Browser launch\\Drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		WebElement butn = driver.findElement(By.xpath("//a[@class='gb_z gb_pc']"));
		butn.click();
		
		WebElement gmail = driver.findElement(By.xpath("//span[text()='Gmail']"));
		gmail.click();
	}
	
	
	
}
