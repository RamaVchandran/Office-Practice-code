package org.browser;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\Automate tools\\Jars\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");

		WebElement search = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		search.sendKeys("oneplus 7 pro nebula blue 8gb+256gb");
		WebElement click = driver.findElement(By.xpath("//input[@value='Go']"));
		click.click();
		WebElement pro = driver.findElement(By.xpath("//span[text()='OnePlus 7 Pro (Nebula Blue, 8GB RAM, 256GB Storage)']"));
		pro.click();
		Thread.sleep(5000);
		String pwid = driver.getWindowHandle();
		System.out.println(pwid);
		Set<String> allwindows = driver.getWindowHandles();
		System.out.println(allwindows);
		
		for (String x : allwindows) {
			if (!pwid.equals(x)){
				driver.switchTo().window(x);
				System.out.println(x);
				WebElement Add = driver.findElement(By.xpath("//input[@id='add-to-cart-button']"));
				Add.click();
				
				WebElement price = driver.findElement(By.xpath("(//span[text()='52,999.00'])[1]"));
				String text= price.getText();
				System.out.println(text);
				
			}
			
			
		}
		
		
	}

}
