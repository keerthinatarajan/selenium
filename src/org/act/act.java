package org.act;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class act {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\eclipse-workspace\\selenium\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		Actions a=new Actions(driver);
		// to find webelement for bank webelement 
		WebElement banksrc=driver.findElement(By.xpath("[//a[text()='BANK'] "));
		
		//to find webelemt for debit side account
		WebElement debitside=driver.findElement(By.xpath("[//li[@class='placeholder'][1]"));
		a.dragAndDrop(banksrc, debitside).perform();
		// to find webeleemt for sale
		WebElement salessrc= driver.findElement(By.xpath("//a[text()='SALES']"));
		WebElement creditacc=driver.findElement(By.xpath("//li[@class='placeholder'][3]"));
		a.dragAndDrop(salessrc, creditacc).perform();
		WebElement debitsideamt=driver.findElement(By.xpath("//li[@class='placeholder'][2]"));
		WebElement bankamt=driver.findElement(By.xpath("//li[@class='placeholder'][4]"));
		a.dragAndDrop(debitsideamt, bankamt).perform();		
		
		
	}
	
	
	
	
	

}
