package BasicAutomation;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Open_the_Browser {

	public static void main(String[] args) {
		
	System.setProperty("webdriver.chrome.driver","C:\\Users\\adithya\\eclipse-workspace\\SeleniumPractice\\Drivers\\chromedriver.exe");
	
	WebDriver driver =new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	driver.get("http://www.seleniumframework.com/Practiceform/");
	driver.findElement(By.xpath("//button[text()='New Browser Tab']")).click();
	Set<String> windowHandles=driver.getWindowHandles();
	
	for(String window:windowHandles) {
		
		driver.switchTo().window(window);
		if(driver.getTitle().equals("Selenium Framework | Selenium, Cucumber, Ruby, Java et al."))
		{
			String s=driver.findElement(By.xpath("//span[text()='MENU']")).getAttribute("class");
			System.out.println(s);
			break;
		}
	}
	
	
	
//	driver.quit();

	}

}
