package PopUps;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowser {
	private static final String S = null;

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\supek\\Downloads\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver(); // Browser Launch
		driver.manage().window().maximize();
		Thread.sleep(1000);

		driver.get("https://www.w3schools.com/js/default.asp");
		Thread.sleep(1000);

		driver.findElement(By.xpath("//a[text()='Try it Yourself »']")).click();
		Thread.sleep(1000);

		String MainWindowID = driver.getWindowHandle();// Return main window id
		Thread.sleep(1000);
		String expURL = "https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst";
		String expID = " ";

		Set<String> allID = driver.getWindowHandles();

		String actUrl = driver.getCurrentUrl();

		if (expURL.equals(actUrl)) {
			System.out.println("Correct Window");
			expID = S;
		} else {
			System.out.println("Wrong Window");
		}
		driver.switchTo().window(S);
	}

}