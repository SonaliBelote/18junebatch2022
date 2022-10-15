import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\supek\\Downloads\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver(); // Browser Launch
		driver.manage().window().maximize();

		driver.get("https://www.facebook.com/login/"); // Url Insert

		Thread.sleep(3000);
		//WebElement LoginButton = driver.findElement(By.tagName("LoginButton"));
		//LoginButton.click();
		
		driver.findElement(By.name("email")).sendKeys("Supekar");
		driver.findElement(By.id("pass")).sendKeys("Saee");
		//driver.findElement(By.name("login")).click();
		
		//driver.findElement(By.linkText("Forgotten account?")).click();
		//driver.findElement(By.partialLinkText(" account?")).click();
		
		driver.findElement(By.linkText("Log In")).click();	
		driver.findElement(By.partialLinkText("Log ")).click();
		
	}
}