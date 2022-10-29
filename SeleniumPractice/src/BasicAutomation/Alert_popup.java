package BasicAutomation;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_popup {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\adithya\\\\eclipse-workspace\\\\SeleniumPractice\\\\Drivers\\\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		
		driver.get("http://www.seleniumframework.com/Practiceform/");
		driver.findElement(By.xpath("//button[@id='alert']")).click();
		Alert alert=driver.switchTo().alert();
		String s =alert.getText();
		alert.accept();
		System.out.println(s);
		
	}

}
