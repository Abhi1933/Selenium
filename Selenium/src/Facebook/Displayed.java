package Facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Displayed {
	public static void main(String[]args) throws InterruptedException
	{
		
	System.setProperty("webdriver.chrome.driver", "D:\\Setup\\New folder\\chromedriver.exe");	
	ChromeOptions options = new ChromeOptions();
	options.addArguments("--disable-notifications");
	WebDriver driver = new ChromeDriver(options);
	driver.get("https://www.facebook.com/");
	Thread.sleep(2000);
	
	 WebElement createnew = driver.findElement(By.xpath("(//a[@role='button'])[2]"));
	 createnew.click();
	 Thread.sleep(2000);
	 
	 WebElement custom = driver.findElement(By.xpath("//label[text()='Custom']"));
	custom.click();
	 WebElement pronoun = driver.findElement(By.xpath("//select[@aria-label='Select your pronoun']"));
	 boolean result = pronoun.isSelected();
	 result = pronoun.isSelected();
	 if (result==true)
	 {
		 System.out.println("pass");
	 }
	 else
	 {
		 System.out.println("fail");
	 }
}
}
