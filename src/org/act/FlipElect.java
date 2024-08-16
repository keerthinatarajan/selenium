package org.act;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FlipElect {
	public static void main(String[] args) throws InterruptedException {
		   System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\eclipse-workspace\\Sele\\driver\\chromedriver.exe");
		   WebDriver driver=new ChromeDriver();
		   Actions a=new Actions(driver);
		   driver.get("https://www.flipkart.com/");
		   WebElement src=driver.findElement(By.xpath("//span[text()='Electronics']"));
		   a.moveToElement(src).perform();
		   WebElement path=driver.findElement(By.xpath("//a[text()='Electronics GST Store']"));
		   a.doubleClick(path).perform();
		   Thread.sleep(3000);
		   WebElement type=driver.findElement(By.xpath("//div[placeholder()='Search for products, brands and more']"));
		   type.sendKeys("Realme");	
	}
}
