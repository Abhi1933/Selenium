package Selenium1;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class firstcry {
	
	public static void main(String[]args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\Setup\\New folder\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
	driver.get("https://www.firstcry.com/");
	//driver.manage().window().maximize();   //label[text()=' Login to place order ']
	Thread.sleep(5000);
	WebElement girl_fashion = driver.findElement(By.xpath("(//li[@class='M14_42 categry'])[2]"));
	Thread.sleep(5000);
	Actions act = new Actions(driver);
	act.moveToElement(girl_fashion).build().perform();
	Thread.sleep(5000);
	WebElement hair_band = driver.findElement(By.xpath("(//a[text()='Hair Bands'])[2]"));
	hair_band.click();
	Thread.sleep(5000);
	WebElement add_cart = driver.findElement(By.xpath("//img[@title='Pihoo Crystal Detailing Crown Hair Band - Golden']"));
	JavascriptExecutor ks = (JavascriptExecutor)driver;
	ks.executeScript("arguments[0].scrollIntoView(true);", add_cart);
	Thread.sleep(5000);
	act.moveToElement(add_cart).click().build().perform();
	Thread.sleep(10000);
//	WebElement addcart = driver.findElement(By.xpath("(//span[@class='step1 M16_white'])[1]"));
//	addcart.click();
	ArrayList<String> address= new ArrayList<String> (driver.getWindowHandles());
	driver.switchTo().window(address.get(1));
	WebElement addcart = driver.findElement(By.xpath("(//span[@class='step1 M16_white'])[1]"));
	addcart.click();
	Thread.sleep(5000);
	WebElement cart = driver.findElement(By.xpath("//span[@class='prodQuant cart-icon B18_orange paddinglft']"));
	ks.executeScript("arguments[0].scrollIntoView(true);", cart);
	Thread.sleep(5000);
	cart.click();                  //input[@id='usrmb']
	Thread.sleep(5000);
	WebElement loginto_order = driver.findElement(By.xpath("//label[text()=' Login to place order ']"));
	loginto_order.click();
	Thread.sleep(5000);
	WebElement entry_email = driver.findElement(By.xpath("//input[@id='lemail']"));
	entry_email.click();
	Thread.sleep(5000);
	entry_email.sendKeys("amitkumar18189@gmail.com");
	Thread.sleep(5000);
	WebElement email_select = driver.findElement(By.xpath("//li[@title='amitkumar18189@gmail.com']"));
	email_select.click();
	Thread.sleep(5000);
	WebElement continu = driver.findElement(By.xpath("//div[text()='CONTINUE']"));
	act.moveToElement(continu).click().build().perform();
//	Thread.sleep(5000);
//	WebElement username = driver.findElement(By.xpath("//input[@id='usrname']"));
//	username.click();
//	username.sendKeys("amit kumar");
//	Thread.sleep(5000);
//	WebElement mobile = driver.findElement(By.xpath(" //input[@id='usrmb']"));
//	mobile.click();
//	mobile.sendKeys("8434300586");         //div[@id='verfiedbtn']
//	Thread.sleep(5000);
//	WebElement password = driver.findElement(By.xpath("//input[@id='usrpass']"));
//	password.click();
//	password.sendKeys("Amit_@123");
//	Thread.sleep(5000);
//	WebElement conti = driver.findElement(By.xpath("//div[@id='continueid']"));
//	conti.click();
	Thread.sleep(20000);
	WebElement submit = driver.findElement(By.xpath("//div[@id='verfiedbtn']"));
	submit.click();
}
}
