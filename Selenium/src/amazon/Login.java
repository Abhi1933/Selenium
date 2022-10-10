package amazon;

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
	driver.manage().window().maximize();
	
	driver.get("https://www.amazon.in/");
	
	Actions act = new Actions(driver);
	
	WebElement sign= driver.findElement(By.xpath("(//span[@class='nav-icon nav-arrow'])[2]"));
	act.moveToElement(sign);
	
	WebElement signin= driver.findElement(By.xpath("//span[@class='nav-action-inner']"));
	act.moveToElement(signin).click().build().perform();
	
	WebElement username= driver.findElement(By.xpath("//input[@type='email']"));
	username.sendKeys("7448282582");
	
	WebElement Loginbutton = driver.findElement(By.xpath("//span[@class='a-button a-button-span12 a-button-primary']"));
	Loginbutton.click();
	
	WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
	password.sendKeys("Abhi@1933");
	
	WebElement SignIn = driver.findElement(By.xpath("//span[@id='auth-signin-button']"));
	SignIn.click();
	
	WebElement amazonlogo = driver.findElement(By.xpath("//a[@id='nav-logo-sprites']"));
	amazonlogo.click();
	
	WebElement all = driver.findElement(By.xpath("//i[@class='hm-icon nav-sprite']"));
	all.click();
	
	WebElement mensfashion = driver.findElement(By.xpath("(//i[@class='nav-sprite hmenu-arrow-next'])[9]"));

	 mensfashion.click();
	 }

	
}

