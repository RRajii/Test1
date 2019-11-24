package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\eclipse-workspace\\RajiiTest\\A\\Lib\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.get("https://www.facebook.com/");
//	WebElement txt1 = driver.findElement(By.xpath("//span[text()='Create an account']"));
//	WebElement txt2 = driver.findElement(By.xpath("//li[text()='English (UK)']"));
	JavascriptExecutor jss= (JavascriptExecutor)driver;
//	jss.executeScript("arguments[0].scrollIntoView(true)", txt1);
//	Thread.sleep(2000);
//	jss.executeScript("arguments[0].scrollIntoView(false)", txt2);
	WebElement txt1 = driver.findElement(By.id("email"));
	WebElement txt2 = driver.findElement(By.id("pass"));
	jss.executeScript("arguments[0].setAttribute('value','raji111@gmail.com')", txt1,txt2);

	


	

}
}
