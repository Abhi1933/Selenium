package Facebook;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot {
	public static void main(String[]args) throws IOException, InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","D:\\Setup\\New folder\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		
		driver.manage().window().maximize();
		
		TakesScreenshot s = (TakesScreenshot)driver;
		
		File abc = s.getScreenshotAs(OutputType.FILE);
		
		File save = new File("D:\\Setup\\screenshot.jpg");
		
		FileHandler.copy(abc, save);
		
		System.out.println("End");
}
}
