package org.act;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.FilenameUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class seleone {
public static void main(String[] args) throws IOException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\eclipse-workspace\\Sele\\driver\\chromedriver.exe");
	   WebDriver driver=new ChromeDriver();
	   driver.get("https://lh.inmakesedu.com/");
	   TakesScreenshot tk=(TakesScreenshot)driver;
	   File i=tk.getScreenshotAs(OutputType.FILE);
	   File f=new File("C:\\Users\\HP\\eclipse-workspace\\Sele\\scrsht\\sspath.png");
	   FileUtils.copyFile(i, f);
	   
	   
	
	
	
}

}
