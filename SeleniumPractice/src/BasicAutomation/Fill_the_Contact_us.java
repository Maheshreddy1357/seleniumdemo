package BasicAutomation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fill_the_Contact_us {

	public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\adithya\\eclipse-workspace\\SeleniumPractice\\Drivers\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://www.seleniumframework.com/Practiceform/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.findElement(By.xpath("//input[@name='name']")).sendKeys("no one");
	driver.findElement(By.xpath("//input[@class='validate[required,custom[email]]']")).sendKeys("noone.184@gmail.com");
	driver.findElement(By.xpath("//input[@name='telephone']")).sendKeys("545145525");
	driver.findElement(By.xpath("//input[@name='country']")).sendKeys("somaliskkfk");
	driver.findElement(By.xpath("//input[@name='company']")).sendKeys("piratesfyshdkh pvt ltd");
	driver.findElement(By.xpath("//textarea[@name='message']")).sendKeys("nothing,i am doing  for prativ=ce  donot take serious");
	driver.findElement(By.linkText("Submit")).click();
	Thread.sleep(2000);
	WebElement we=driver.findElement(By.xpath("//div[text()='Feedback has been sent to the administrator']"));
	
	System.out.println(we.isDisplayed());
	System.out.println(we.getText());
	
	
	Thread.sleep(3000);
	driver.quit();
	
	
	

	}

}
