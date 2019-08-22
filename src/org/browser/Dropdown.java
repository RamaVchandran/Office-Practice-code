package org.browser;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dropdown {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\Automate tools\\Training\\Browser launch\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.irctc.co.in/nget/train-search");
		driver.findElement(By.xpath("//a[text()=' REGISTER ']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//label[text()='Select Security Question']")).click();
		
		List<WebElement> li = driver.findElements(By.xpath("//div[@class='ui-dropdown-items-wrapper']//ul//li//span"));
		try{
		for (WebElement x : li) {
	
			String txt = x.getText();
			
			
			System.out.println(txt);
			
			if(x.getText().contains("What is your all time favorite sports team?")){
				
				x.click();
				
			}
		}
		}
		catch(org.openqa.selenium.StaleElementReferenceException ex)
		{
			
				
		}
		
		/*try{
		for(int i=1;i<li.size();i++){
			
			if(i%2==0){
				String txt = li.get(i-1).getText();
				System.out.println(txt);
				
			}
		}
		}
		
		catch(org.openqa.selenium.StaleElementReferenceException ex){
			
		}*/
		
		}
	
	
}




		
		
	
	


