package org.browser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\Automate tools\\Training\\Browser launch\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.greenstechnologys.com/selenium-course-content.html");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		WebElement poPup= driver.findElement(By.xpath("//button [@class='close']"));
		poPup.click();
		WebElement print = driver.findElement(By.xpath("//strong[text()= 'Selenium with Appium course syllabus']"));
		String para=print.getText();
		System.out.println(para);
		
	}
	
}
