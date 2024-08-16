package org.act;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class shop {
	public static void main(String[] args) throws InterruptedException {
	   System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\eclipse-workspace\\selenium\\drivers\\chromedriver.exe");
	   WebDriver driver=new ChromeDriver();
	   Actions a=new Actions(driver);
	   driver.get(" https://www.shopclues.com/wholesale.html");
	   WebElement mouse=driver.findElement(By.xpath("//a[text()='Mobiles & More']"));
	   a.moveToElement(mouse).perform();
	   Thread.sleep(3000);
	   WebElement apple=driver.findElement(By.xpath("//a[text()='Apple']"));
	   apple.click();
	}
}
