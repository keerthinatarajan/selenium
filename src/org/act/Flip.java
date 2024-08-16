package org.act;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Flip {
	public static void main(String[] args) {
		
	
	   System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\eclipse-workspace\\Sele\\driver\\chromedriver.exe");
	   WebDriver driver=new ChromeDriver();
	   Actions a=new Actions(driver);
	   driver.get("https://www.flipkart.com/");
	   WebElement path=driver.findElement(By.xpath("//span[text()='Fashion']"));
	   a.moveToElement(path).perform();
	   WebElement src=driver.findElement(By.xpath("//a[text()='Women Footwear']"));
	   a.moveToElement(src).perform();
	   WebElement clik=driver.findElement(By.xpath("//a[text()='Women Flats']"));
	   clik.click();	   
	   
	   
	   }}
