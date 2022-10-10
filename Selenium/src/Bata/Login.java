package Bata;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Login {
	public static void main(String[]args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","D:\\Setup\\New folder\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.bata.in/");
		
		driver.manage().window().maximize();
	
		WebElement login = driver.findElement(By.xpath("(//span[@class='cc-headerBar-label'])[4]"));	
		login.click();
	
		WebElement email = driver.findElement(By.xpath("(//input[@type='text'])[3]"));		
		email.sendKeys("7448282582");
	
		WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
		password.sendKeys("Abhi@1933");
		
   		WebElement signin = driver.findElement(By.xpath("(//button[@type='submit'])[3]"));
		signin.click();
		Thread.sleep(5000);
		WebElement mens = driver.findElement(By.xpath("//a[@id='IN_Men']"));
		mens.click();
//		Actions act= new Actions(driver);
//		act.moveToElement(mens).click().build().perform();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,600)", "");
		
		WebElement shoes = driver.findElement(By.xpath("(//a[@class='link js-analytics-productClick'])[12]"));
		shoes.click();
		
}
}
