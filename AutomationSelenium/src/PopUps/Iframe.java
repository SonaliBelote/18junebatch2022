package PopUps;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\supek\\Downloads\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver(); // Browser Launch
		driver.manage().window().maximize();
		Thread.sleep(1000);

		driver.get("https://www.w3schools.com/js/js_popup.asp");
		Thread.sleep(1000);
		
		ArrayList <String> ar= new ArrayList <String>(driver.getWindowHandles());
		driver.switchTo().window(ar.get(1));
		Thread.sleep(1000);

		driver.findElement(By.xpath("//a[@href='tryit.asp?filename=tryjs_alert']")).click();
		Thread.sleep(1000);

		WebElement TryItFrame = driver.findElement(By.xpath("//a[@title='Change Theme']"));
		driver.switchTo().frame("TryItFrame");

		// driver.switchTo().parentFrame();
		driver.switchTo().defaultContent();
		
		 driver.findElement(By.xpath("//a[@title='Change Theme']"));
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//button[text()='Try it']")).click();
	}
}