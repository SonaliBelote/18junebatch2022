package PopUps;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopup {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\supek\\Downloads\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver(); // Browser Launch
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='confirmation']")).click();
		Thread.sleep(3000);
		
		Alert alt = driver.switchTo().alert();
	
		alt.accept();
		//alt.dismiss();
		// alt.getText();
		// alt.sendKeys("Saee");

	}
}
