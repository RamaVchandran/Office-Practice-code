package org.browser;

import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class Multi {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
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
		int size =childWind.size();
		System.out.println(size);
		System.out.println(childWind);
		
		for (String x : childWind) {
			
			if(!pWid.equals(x)){
				driver.switchTo().window(x);
				
				System.out.println(x);
				
				Thread.sleep(5000);
				try{
				WebElement close = driver.findElement(By.xpath("//img[@class='popupCloseButton']"));
				close.click();
				}
				catch( org.openqa.selenium.ElementNotInteractableException e)
				{
					
				}
				WebElement wind2 = driver.findElement(By.xpath("(//a[@class='animatedseealllink'])[4]"));
				wind2.click();
				
				String third = driver.getWindowHandle();
				System.out.println("third wind"+third);
				Set<String> y = driver.getWindowHandles();
				System.out.println(y);
						
					for (String v : y) {
						if(!pWid.equals(v)){
							
							if(!third.equals(v)){
							
							driver.switchTo().window(v);
							System.out.println(v);
						
							WebElement click = driver.findElement(By.xpath("//a[@class='blue_btn right_btn']"));	
							JavascriptExecutor executor = (JavascriptExecutor)driver;
							executor.executeScript("arguments[0].click();", click);
						}
						
					}
					
					}
		
		
			}
		}
	}
}
		 
			 

	


		 
		
		
			
		










	


