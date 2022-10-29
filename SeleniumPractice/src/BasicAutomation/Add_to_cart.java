package BasicAutomation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Add_to_cart {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\adithya\\\\eclipse-workspace\\\\SeleniumPractice\\\\Drivers\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/ref=nav_logo");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		
		
		driver.findElement(By.xpath("//img[@alt='OnePlus Nord CE2 Lite | Starting from INR 17,499 (Incl. Additional Offers)']")).click();
		driver.findElement(By.xpath("//input[@id='add-to-cart-button']")).click();
		driver.findElement(By.xpath("//span[@id='attach-sidesheet-view-cart-button-announce']")).click();
		
		Boolean b=driver.findElement(By.xpath("//img[@alt='OnePlus Nord CE 2 Lite 5G (Blue Tide, 6GB RAM, 128GB Storage), Opens in a new tab']")).isDisplayed();
		System.out.println(b);
		
		
	}

}
