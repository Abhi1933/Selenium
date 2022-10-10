package NSE;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class facebook {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\Setup\\New folder\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		WebElement createAcc= driver.findElement(By.xpath("(//a[@role='button'])[2]"));
		createAcc.click();
		
		Thread.sleep(3000);
		
		WebElement lastname= driver.findElement(By.xpath("//input[@name='lastname']"));
		lastname.sendKeys("Shinde");
		WebElement firstname= driver.findElement(By.xpath("//input[@name='firstname']"));
		
		System.out.println("start");
		Actions act = new Actions(driver);
		Thread.sleep(3000);
	//	act.moveToElement(lastname).dragAndDrop(lastname, firstname);
		act.doubleClick(lastname).moveToElement(firstname).release();
	}
}
