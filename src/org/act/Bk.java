package org.act;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Bk {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\eclipse-workspace\\selenium\\drivers\\chromedriver.exe");
		WebDriver txt=new ChromeDriver();
		txt.get("https://toolsqa.com/");
		txt.manage().window().maximize();
		JavascriptExecutor js=(JavascriptExecutor)txt;
	    WebElement send=txt.findElement(By.xpath("//div[@class='heading__articles']"));
	    js.executeScript("arguments[0].scrollIntoView(true)",send);
	    Thread.sleep(3000);
	    WebElement send1=txt.findElement(By.xpath("//span[@class='navbar__tutorial-menu--text']"));
	    js.executeScript("arguments[0].scrollIntoView(true)",send1);
	}

}
