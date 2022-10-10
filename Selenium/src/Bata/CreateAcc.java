package Bata;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateAcc {
	public static void main(String[]args) throws InterruptedException
	{
	System.setProperty("webdriver.chrome.driver","D:\\Setup\\New folder\\chromedriver.exe");

	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.bata.in/");
	
	driver.manage().window().maximize();
	
	WebElement login = driver.findElement(By.xpath("//span[contains (text(),'Login')]"));	
	login.click();
	
	WebElement register = driver.findElement(By.xpath("//button[contains(text(),'bata')]"));		
	register.click();
	
    WebElement email = driver.findElement(By.xpath("(//input[@type='text'])[3]"));
    email.sendKeys("shindeabhijeet03@gmail.com");
   
    WebElement otp = driver.findElement(By.xpath("//label[contains(text(),'otp')]"));
	
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("arguments[0].ScrollIntoView(true)",otp);
	
    WebElement mobno = driver.findElement(By.xpath("(//input[@type='tel'])"));
    mobno.sendKeys("7448282582");
    
    WebElement password = driver.findElement(By.xpath("(//input[@type='string'])"));
    password.sendKeys("Abhi@1933");
    
    WebElement conpass = driver.findElement(By.xpath("(//input[@type='password'])[2]"));
    conpass.sendKeys("Abhi@1933");
      
}
}
