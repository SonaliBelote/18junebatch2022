package ScreenshotStore;

import java.io.File;
import java.io.IOException;
import java.sql.Date;
import java.sql.Time;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenshotAssignment2 {
	public static void Method1 () throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\supek\\Downloads\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver(); // Browser Launch
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		File Source= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File Dest = new File("D:\\workspace eclipse\\java project 1\\AutomationSelenium\\ScreenshotFolder\\Yogesh.jpg");
		// FileHandler.copy(Source, Dest);
		Thread.sleep(1000);

		Date dt = new Date(1);
		Thread.sleep(1000);
		
		Time tm =new Time(2);
		Thread.sleep(1000);
		
		String S1= dt.toString()+tm.getDate();
		Thread.sleep(1000);
		
		FileHandler.copy(Source, new File("D:\\workspace eclipse\\java project 1\\AutomationSelenium\\ScreenshotFolder\\Yogesh.jpg"+ S1) );
		Thread.sleep(1000);
		driver.close();
}

}
