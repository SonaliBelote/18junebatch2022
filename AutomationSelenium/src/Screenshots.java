import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshots {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\supek\\Downloads\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver(); // Browser Launch
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		File Source= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File Dest= new File ("D:\\workspace eclipse\\java project 1\\AutomationSelenium\\ScreenshotFolder\\test.jpg");
		FileHandler.copy(Source, Dest);

}
}