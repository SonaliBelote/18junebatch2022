import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class class4 {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\supek\\Downloads\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver(); // Browser Launch
		driver.get("https://www.google.co.in"); // Url Insert

		driver.manage().window().maximize();

		String title = driver.getTitle();
		System.out.println(title);
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		driver.get("https://www.facebook.com");
		Thread.sleep(2000);
		
		Navigation nv= driver.navigate();
		nv.back();
 
		Thread.sleep(3000);

		Dimension d = new Dimension(200, 400);
		driver.manage().window().setSize(d);

		Thread.sleep(2000);

		Point P = new Point(100, 500);
		driver.manage().window().setPosition(P);
		Thread.sleep(2000);

		driver.manage().window().maximize();
		Thread.sleep(2000);

		Navigation nv2 = driver.navigate();
		nv.back();
		nv2.refresh();
		Thread.sleep(2000);
		driver.close();

	}
}
