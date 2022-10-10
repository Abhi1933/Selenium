package Bata;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class buynowonly {
	public static void main(String[]args)
	{
		System.setProperty("webdriver.chrome.driver","D:\\Setup\\New folder\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.bata.in/on/demandware.store/Sites-bata-in-Site/en_IN/Checkout-Begin?stage=payment#payment");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,100)", "");
	
	
	}
	
}
