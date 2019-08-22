package org.browser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Text {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","D:\\Automate tools\\Training\\Browser launch\\Drivers\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://adactin.com/HotelApp/");
		
		WebElement userName = driver.findElement(By.xpath("//input[@id='username']"));
		userName.sendKeys("Ramachandran15");
		
		String txt = userName.getAttribute("value");
		System.out.println(txt);
		
		
		
		driver.quit();
		
	}
}
