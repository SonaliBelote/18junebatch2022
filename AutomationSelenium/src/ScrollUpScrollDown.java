import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollUpScrollDown {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\supek\\Downloads\\chromedriver_win32\\chromedriver.exe");

	WebDriver driver = new ChromeDriver(); // Browser Launch
	driver.manage().window().maximize();
	Thread.sleep(1000);

	driver.get("https://www.w3schools.com/js/js_popup.asp");
	Thread.sleep(1000);

	WebElement TryIt = driver.findElement(By.xpath("(//a[text()='Try it Yourself »'])[2]"));

	JavascriptExecutor js = (JavascriptExecutor) driver;
	//js.executeScript("arguments[0].scrollIntoView)(true)", TryIt);
	

	js.executeScript("window.scrollBy(0,-9000)");
	Thread.sleep(1000);
	
	js.executeScript("window.scrollBy(0,-1000)");
	Thread.sleep(1000);
	
	js.executeScript("window.scrollBy(1000,0)");
	Thread.sleep(1000);
	
	js.executeScript("window.scrollBy(-3000,0)");
	Thread.sleep(1000);
	
	js.executeScript("window.scrollBy(1000,2000)");
	Thread.sleep(1000);
	
	js.executeScript("window.scrollBy(-3000,2000)");
	Thread.sleep(1000);

	js.executeScript("window.scrollBy(-3000,-3000)");
	Thread.sleep(1000);
}
}