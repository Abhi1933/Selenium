package Facebook;

import java.io.File;
import java.io.IOException;
import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class MoreScreenshots {
public static void main (String[]args) throws InterruptedException, IOException
{
	System.setProperty("webdriver.chrome.driver","D:\\Setup\\New folder\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();

	driver.get("https://www.facebook.com/");
	Thread.sleep(2000);
	DateFormat dateFormat= new SimpleDateFormat("HH.mm.ss:dd/MM/yyyy");
	 Date date = new Date(0);
	 String date1= dateFormat.format(date);
	 System.out.println(date1);
	 Thread.sleep(5000);
    TakesScreenshot s = (TakesScreenshot)driver;
	
    File abc = s.getScreenshotAs(OutputType.FILE);

    File save = new File("D:\\Setup\\screenshot"+date1+".jpg");

    FileHandler.copy(abc, save); 
    System.out.println("End");
}
}
