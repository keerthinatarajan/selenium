package org.act;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Down {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\eclipse-workspace\\Sele\\driver\\chromedriver.exe");
		   WebDriver driver=new ChromeDriver();
		   driver.get("https://inmakeslh.in/");
		   JavascriptExecutor js=(JavascriptExecutor)driver;
		   WebElement send = driver.findElement(By.xpath("//h1[@class='xc-section-3-title']"));
		   js.executeScript("arguments[0].ScrollIntoView(true)",send );
	}
}
