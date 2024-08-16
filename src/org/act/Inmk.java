package org.act;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Inmk {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\eclipse-workspace\\selenium\\drivers\\chromedriver.exe");
		WebDriver txt=new ChromeDriver();
		txt.get("https://inmakes.com/");
		txt.manage().window().maximize();
		JavascriptExecutor js=(JavascriptExecutor)txt;
		WebElement send=txt.findElement(By.xpath("//h2[contains(text(),'Welcome To Inmakes Family')]"));
		js.executeScript("arguments[0].scrollIntoView(true)",send);
		

		}
		
		
		
	}


