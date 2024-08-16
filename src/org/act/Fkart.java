package org.act;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Fkart {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\eclipse-workspace\\selenium\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		Actions a=new Actions(driver);
		driver.get("http://www.flipkart.com");
		WebElement path=driver.findElement(By.xpath("(//span[@class='_1XjE3T'])[5]"));
		a.moveToElement(path).perform();
		Thread.sleep(3000);
		WebElement bath=driver.findElement(By.xpath("//a[text()='Cleaning & Bath']"));
		a.doubleClick(bath).perform();
		WebElement print=driver.findElement(By.xpath("(//div[@class='CXW8mj'])[1]"));
		System.out.println(print);
		
		
	}

}
