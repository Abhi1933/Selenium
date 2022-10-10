package Bata;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class buy {
	public static void main(String[]args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","D:\\Setup\\New folder\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.bata.in/");
		
		driver.manage().window().maximize();
	
		WebElement mens = driver.findElement(By.xpath("//a[@id='IN_Men']"));
		mens.click();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,600)", "");
		
		WebElement shoes = driver.findElement(By.xpath("(//a[@class='link js-analytics-productClick'])[12]"));
		shoes.click();
		Thread.sleep(3000);
		WebElement color = driver.findElement(By.xpath("//img[@title='Bata Light Brown Sneaker For Men']"));
		color.click();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		js.executeScript("window.scrollBy(0,100)", "");
		
		WebElement size = driver.findElement(By.xpath("(//ul[@id='size-ul-list']//li)[5]"));
		size.click();
		Thread.sleep(3000);
		WebElement addbag = driver.findElement(By.xpath("//button[contains(text(),'bag')]"));
		addbag.click();
		
		WebElement proceed = driver.findElement(By.xpath("//button[contains(text(),'CHECKOUT')]"));
		proceed.click();
		
		WebElement email = driver.findElement(By.xpath("//input[@type='email']"));
		email.sendKeys("shindeabhijeet03@gmail.com");
		
		WebElement phone = driver.findElement(By.xpath("//input[@type='tel']"));
		phone.sendKeys("7448282582");
		
		WebElement title = driver.findElement(By.xpath("//label[@for='mr']"));
		title.click();
		
		js.executeScript("window.scrollBy(0,200)", "");

		WebElement fname = driver.findElement(By.xpath("(//input[@type='text'])[1]"));
		fname.sendKeys("Abhijeet");
		
		WebElement lname = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		lname.sendKeys("Shinde");
		
		WebElement add1 = driver.findElement(By.xpath("(//input[@type='text'])[3]"));
		add1.sendKeys("Flat no.102, Arul Homes,Hinjewadi");
		
		WebElement pin = driver.findElement(By.xpath("(//input[@type='text'])[4]"));
		pin.sendKeys("411057");
		
		WebElement city = driver.findElement(By.xpath("(//input[@type='text'])[5]"));
		city.sendKeys("Pune");
		
		WebElement state = driver.findElement(By.xpath("(//input[@type='text'])[6]"));
		state.sendKeys("Maharashtra");
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		WebElement submit = driver.findElement(By.xpath("//button[@value='submit-shipping']"));
		submit.click();
		
		js.executeScript("window.scrollBy(0,100)", "");
		Thread.sleep(3000);
		WebElement cod = driver.findElement(By.xpath("(//button[@name='submit'])[5]"));
		cod.click();
}
}
