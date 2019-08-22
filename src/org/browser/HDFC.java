package org.browser;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HDFC {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","D:\\Automate tools\\Training\\Browser launch\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hdfcbank.com/htdocs/common/NetBanking/logout.html?id=tudMR5MNIXhpCithwEbZ6g%3D%3D");
		
		//link click
		WebElement visit  = driver.findElement(By.xpath("(//a[@href='https://www.hdfcbank.com/'])[2]"));
		visit.click();
		
		String pWid = driver.getWindowHandle();
		System.out.println(pWid);
		
		Set<String> childWind = driver.getWindowHandles();
		
		System.out.println(childWind);

		for (String x : childWind) {
			if(!pWid.equals(x)){
				driver.switchTo().window(x);
				
				System.out.println(x);
				
				Thread.sleep(5000);
				WebElement close = driver.findElement(By.xpath("//img[@class='popupCloseButton']"));
				close.click();
				
				WebElement wind2 = driver.findElement(By.xpath("(//a[@class='animatedseealllink'])[4]"));
				wind2.click();
				
				String third = driver.getWindowHandle();
				System.out.println("third wind"+third);
				
				Set<String> link = driver.getWindowHandles();
				for (String y : link) {
					if(!third.equals(y)){
						driver.switchTo().window(y);
						WebElement touch =	driver.findElement(By.xpath("//a[@class='blue_btn right_btn']"));
						touch.click();
						System.out.println(y);
						
				}
				
					
				}
				
			}
		}

	}

}
