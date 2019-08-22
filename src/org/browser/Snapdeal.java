package org.browser;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Snapdeal {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\Automate tools\\Training\\Browser launch\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.snapdeal.com/");
		
		WebElement search = driver.findElement(By.xpath("//input[@id='inputValEnter']"));
		search.sendKeys("Iphone 7");
		WebElement butn = driver.findElement(By.xpath("//button[@class='searchformButton col-xs-4 rippleGrey']"));
		butn.click();
		WebElement mobile = driver.findElement(By.xpath("(//p[text()='Apple iPhone 7 ( 32GB , 2 GB ) Black'])[1]"));
		mobile.click();
		
		String pwid = driver.getWindowHandle();
		System.out.println(pwid);
		
	 Set<String> se =  driver.getWindowHandles();
	 List<String> li = new ArrayList<String>(se);
	 System.out.println(li.size());
	 
				driver.switchTo().window(li.get(1));
				System.out.println(li.get(1));
				
			WebElement cart = 	driver.findElement(By.xpath("//span[text()='add to cart']"));
			
			cart.click();
			
			WebElement price = driver.findElement(By.xpath("//span[text()='Rs. 38,500']"));
			String txt = price.getText();
			System.out.println(txt);
				
				
				
				
			
			
				
			
		}

	}


