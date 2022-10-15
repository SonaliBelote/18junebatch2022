import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

public class class2 {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", 
			"C:\\Users\\supek\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	Thread.sleep(4000);
	 
	driver.manage().window().minimize();
	
	 Options op= driver.manage();
	 Window w= op.window();
	 w.maximize();
	 Thread.sleep(4000);
	 
	 Dimension D= new Dimension (100,400);
	 driver.manage().window().setSize(D);
	 Thread.sleep(4000);
	 Point P= new Point (400,400);
	 driver.manage().window().setPosition(P);
	 Thread.sleep(4000);
	 driver.quit();
	
	
}}