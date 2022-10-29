package BasicAutomation;

import java.io.File;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Take_a_screenShot {

	public static void main(String[] args) throws Throwable {
		
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\adithya\\\\eclipse-workspace\\\\SeleniumPractice\\\\Drivers\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.seleniumframework.com/Practiceform/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.xpath("//input[@name='name']")).sendKeys("no one");
		driver.findElement(By.xpath("//input[@class='validate[required,custom[email]]']")).sendKeys("noone.184@gmail.com");

		
		
		Thread.sleep(3000);
		TakesScreenshot tsc=(TakesScreenshot) driver;
	File src=	tsc.getScreenshotAs(OutputType.FILE);
	File dest=new File("F:\\che120\\scr.png");
	Files.copy(src, dest);
		
	driver.quit();
	
		
		

	}

}
