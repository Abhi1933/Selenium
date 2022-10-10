package Selenium1;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Childpopup {
	public static void main(String[]args) throws InterruptedException
	{
	System.setProperty("webdriver.chrome.driver","D:\\Setup\\New folder\\chromedriver.exe");

	WebDriver driver = new ChromeDriver();
	driver.get("https://www.w3schools.com/js/js_popup.asp");
	Thread.sleep(3000);
	
	driver.manage().window().maximize();
	Thread.sleep(3000);
	
	WebElement alertbox = driver.findElement(By.xpath("(//a[text()='Try it Yourself »'])[1]"));
	alertbox.click();
	
	ArrayList<String> add= new ArrayList<String> (driver.getWindowHandles());
	
	driver.switchTo().window(add.get(1));
	
	driver.switchTo().frame("iframeResult");
	
    WebElement tryit = driver.findElement(By.xpath("//button[text()='Try it']"));
	tryit.click();

}

}
