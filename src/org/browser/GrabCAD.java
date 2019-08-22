package org.browser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GrabCAD {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","D:\\Automate tools\\Training\\Browser launch\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://grabcad.com/login");
		WebElement userName = driver.findElement(By.xpath("//input[@id='member_email']"));
		userName.sendKeys("ramav660@gamil.com");
		WebElement passWord = driver.findElement(By.xpath("//input[@id='member_password']"));
		passWord.sendKeys("Rama@1591");
		WebElement login = driver.findElement(By.xpath("//button[@class='button b48 red action']"));
		login.click();
		
	}

}
