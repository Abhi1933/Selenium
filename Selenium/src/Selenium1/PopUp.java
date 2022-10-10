package Selenium1;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopUp {
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
		Thread.sleep(3000);
		WebElement confirmbox = driver.findElement(By.xpath("(//a[text()='Try it Yourself »'])[2]"));
		confirmbox.click();
		Thread.sleep(3000);
		WebElement promptbox = driver.findElement(By.xpath("(//a[text()='Try it Yourself »'])[3]"));
		promptbox.click();
		Thread.sleep(3000);
		WebElement line = driver.findElement(By.xpath("(//a[text()='Try it Yourself »'])[4]"));
		line.click();
		
		ArrayList<String> address = new ArrayList<String>(driver.getWindowHandles());
		
		System.out.println(address.get(0));
		System.out.println(address.get(1));
		System.out.println(address.get(2));
		System.out.println(address.get(3));
		System.out.println(address.get(4));
		
		driver.switchTo().window(address.get(0));
		System.out.println(driver.getCurrentUrl());
		
		driver.switchTo().window(address.get(1));
		System.out.println(driver.getCurrentUrl());
		
		driver.switchTo().window(address.get(2));
		System.out.println(driver.getCurrentUrl());
		
		driver.switchTo().window(address.get(3));
		System.out.println(driver.getCurrentUrl());
		
    	driver.switchTo().window(address.get(4));
		System.out.println(driver.getCurrentUrl());

	}
}
