package Facebook;



import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class TimeFormat {
 
	public static void main(String[]args) throws IOException, InterruptedException
	{

		Date x = new Date();
		System.out.println(x);
		String abhi = x.toString().replace(" ", "-").replace(":", "-");
		
		System.setProperty("webdriver.chrome.driver","D:\\Setup\\New folder\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.instagram.com/");
		
		TakesScreenshot s = (TakesScreenshot)driver;
		
		File abc = s.getScreenshotAs(OutputType.FILE);
		
		File save = new File("C:\\Users\\abhij\\OneDrive\\Desktop\\Software Testing\\Selenium\\Screenshot"+abhi+".jpeg");
		
		FileHandler.copy(abc, save);
		
		
	}
}
