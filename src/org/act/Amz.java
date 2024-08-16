package org.act;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Amz {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\eclipse-workspace\\selenium\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		Actions a=new Actions(driver);
		WebElement prime=driver.findElement(By.id("nav-link-amazonprime"));
		a.moveToElement(prime).perform();
		Thread.sleep(3000);
		WebElement src=driver.findElement(By.id("multiasins-img-link"));
		src.click()	;
		}

}
