package XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathMethods {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\supek\\Downloads\\chromedriver_win32\\chromedriver.exe");

	WebDriver driver = new ChromeDriver(); // Browser Launch
	driver.manage().window().maximize();

	driver.findElement(By.xpath("//input[@type=\'text\']")).sendKeys("Velocity.com");
	//driver.findElement(By.xpath("//button[text()='Log In']")).sendKeys("Saee");
	//driver.findElement(By.name("//input[@name=\'login\']")).click();
	
	
}
}
