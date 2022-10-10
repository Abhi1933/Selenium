package DynamicElement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamic1
{
	public static void main(String[]args) throws InterruptedException
	{
	System.setProperty("webdriver.chrome.driver","D:\\Setup\\New folder\\chromedriver.exe");

	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.w3schools.com/html/html_tables.asp");
	List <WebElement> row = driver.findElements(By.xpath("(//table [@id='customers']//tr)"));
	for(int i =2;i<=row.size();i++)
		{
			for (int j=1;j<4;j++)
			{
				List <WebElement> cells = driver.findElements(By.xpath("(//table [@id='customers']//tr["+i+"]//td["+j+"])"));
				String cellval = cells.get(0).getText();
				System.out.print(cellval+" , ");
			}
				System.out.println();
		}

	}
}
