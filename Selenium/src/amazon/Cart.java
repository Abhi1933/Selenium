package amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cart
{
	public static void main(String[]args) throws InterruptedException
	{
	System.setProperty("webdriver.chrome.driver","D:\\Setup\\New folder\\chromedriver.exe");

	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.amazon.in/");
	
	driver.manage().window().maximize();
	
	WebElement cart = driver.findElement(By.xpath("//a[@id='nav-cart']"));	
	cart.click();
	
	WebElement signin = driver.findElement(By.xpath("//span[@class='a-size-base-plus']"));		
	signin.click();
	
    WebElement createAcc = driver.findElement(By.xpath("//a[contains(text(),'Create your Amazon account')]"));
    createAcc.click();
   
    WebElement fullname = driver.findElement(By.xpath("//input[@type='text']"));
    fullname.sendKeys("Abhijeet Shinde");
    
    WebElement operator = driver.findElement(By.xpath("//span[@class='a-dropdown-prompt']"));
    operator.click();
    
    WebElement india = driver.findElement(By.xpath("//a[@id='auth-country-picker_92']"));
    india.click();
   
    WebElement mobileno = driver.findElement(By.xpath("//input[@type='tel']"));
    mobileno.sendKeys("9082244989");
   
    WebElement password= driver.findElement(By.xpath("//input[@type='password']"));
    password.sendKeys("Abhi@1933");
    
    WebElement continue1= driver.findElement(By.xpath("//input[@id='continue']"));
    continue1.click();
  
    System.out.println("End");
   


	}
}


//
//
