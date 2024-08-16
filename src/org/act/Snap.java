package org.act;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Snap {
	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\eclipse-workspace\\Sele\\driver\\chromedriver.exe");
		   WebDriver driver=new ChromeDriver();
		   Actions a=new Actions(driver);
		   driver.get("https://www.snapdeal.com ");
		   WebElement src=driver.findElement(By.xpath("//span[text()='Mobile & Accessories']"));
		   a.moveToElement(src).perform();
		   Thread.sleep(3000);
		   WebElement path=driver.findElement(By.xpath("//span[text()='Mobile Cases & Covers']"));
		   path.click();
		   Thread.sleep(3000);
		
	}

}
