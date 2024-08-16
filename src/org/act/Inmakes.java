package org.act;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Inmakes {
	public static void main(String[] args) throws InterruptedException {
	   System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\eclipse-workspace\\Sele\\driver\\chromedriver.exe");
	   WebDriver driver=new ChromeDriver();
	   driver.get("https://lh.inmakesedu.com/home");
	   Actions a=new Actions(driver);
	   WebElement path=driver.findElement(By.xpath("//a[text()='Courses']"));
	   a.moveToElement(path).perform();
	   Thread.sleep(3000);
	   WebElement src=driver.findElement(By.xpath("//a[text()='Software Testing Tamil']"));
	   a.moveToElement(src).perform();
	   Thread.sleep(3000);
	   WebElement master=driver.findElement(By.xpath("//a[text()='ST Master Class']"));
	   master.click(); 
	}
}
