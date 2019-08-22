package org.browser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Kedge {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Automate tools\\Training\\Browser launch\\Drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		String baseUrl= "http://kedge.srinsofttech.com/#/kn-pages/auth/login";
		String desiredTitle="Kedge 2.0";
		String actualTitle="";
		String tagName="";
		driver.get(baseUrl);
		actualTitle= driver.getTitle();
		if 
		(actualTitle.contentEquals(desiredTitle))
		{
			System.out.println("Its pass da dude");
		}
		else
		 {
			System.out.println("damn fail"); 
		 }
		

		WebElement Employeeid = driver.findElement(By.id("mat-input-0"));
		//Employeeid.clear();
		Employeeid.sendKeys("SS385");
		WebElement Password = driver.findElement(By.id("mat-input-1"));
		Password.clear();
		Password.sendKeys("Rama@1591");
		WebElement LOGIN = driver.findElement(By.xpath("//*[@id='login-form']/form/button/span"));
		//LOGIN.clear();
		LOGIN.click();
		Thread.sleep(5000);
		WebElement previous =  driver.findElement(By.xpath("//div[text()='Previous Week']"));
		previous.click();
		
		
		
	}
}
