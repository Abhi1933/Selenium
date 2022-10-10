package DynamicElement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamic2
{

	public static void main(String[]args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","D:\\Setup\\New folder\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		List <WebElement> cells = driver.findElements(By.xpath("(//table [@id='customers']//tr)"));
		System.out.println(cells.size());
//		System.out.println(cells.get(18).getText());	
		for(int i =0;i<cells.size();i++)
		{
			System.out.println(cells.get(i).getText());		
	    }

	}
}