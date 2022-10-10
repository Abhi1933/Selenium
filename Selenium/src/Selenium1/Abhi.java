package Selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Abhi {
	public static void main(String[]args) throws InterruptedException
	{
	System.setProperty("webdriver.chrome.driver","D:\\Setup\\New folder\\chromedriver.exe");

	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.facebook.com/");
	
	
	WebElement username= driver.findElement(By.xpath("//input[@id='email']"));
	
	username.sendKeys("7448282582");
	
	WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
	
	password.sendKeys("Abhi@1998");
	
	WebElement loginbutton = driver.findElement(By.xpath("//button[@type='submit']"));
	
	loginbutton.click();
//	WebDriverWait wait =new WebDriverWait(driver, (10));
//	
//	WebElement submit= wait.until(ExpectedConditions
//				.visibilityOfElementLocated(By.xpath("(//button[@name=\"submit\"])[4]")));
//	submit.click();
	}
}
