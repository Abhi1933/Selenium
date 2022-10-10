package Facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Login {
public static void main(String[]args) throws InterruptedException
{
	System.setProperty("webdriver.chrome.driver", "D:\\Setup\\New folder\\chromedriver.exe");
	
	
	ChromeOptions options = new ChromeOptions();
	options.addArguments("--disable-notifications");
	WebDriver driver = new ChromeDriver(options);
	driver.get("https://www.facebook.com");
	
	driver.manage().window().maximize();
	
	WebElement username = driver.findElement(By.xpath("//input[@name='email']"));
	
	username.sendKeys("7448282582");
	
WebElement password= driver.findElement(By.xpath("//input[@id='pass']"));
	
	password.sendKeys("Abhi@1998");
	
WebElement LogIn= driver.findElement(By.xpath(""));
	
	LogIn.click();
//	Thread.sleep(3000);
//WebElement Profile = driver.findElement(By.xpath("//span[@class='gvxzyvdx aeinzg81 t7p7dqev gh25dzvf exr7barw b6ax4al1 gem102v4 ncib64c9 mrvwc6qr sx8pxkcf f597kf1v cpcgwwas m2nijcs8 hxfwr5lz k1z55t6l oog5qr5w innypi6y rtxb060y']"));
//	
//	Profile.click();
	

	
}
}
