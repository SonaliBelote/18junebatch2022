import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class class3 {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\supek\\Downloads\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver(); // Browser Launch
		driver.get("https://www.google.co.in"); // Url Insert

		Thread.sleep(2000);

		driver.manage().window().maximize();

		Dimension d = new Dimension(400, 500);
		driver.manage().window().setSize(d);

		Point P = new Point(400, 600);
		driver.manage().window().setPosition(P);

		driver.close();

	}
}
