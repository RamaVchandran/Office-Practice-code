package org.browser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day6_1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "http://www.greenstechnologys.com/");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.greenstechnologys.com/");
		
		driver.findElement(By.xpath("//font[text()='GREENS TECHNOLOGY']"));

	}

}
