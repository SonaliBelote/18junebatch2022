import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class1 {
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\supek\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver(); //Browser Launch
		driver.get("https://www.selenium.dev/downloads"); //Url Insert
		//driver.navigate.to("https://www.selenium.dev/downloads");
		
		String s1= driver.getCurrentUrl();
		System.out.println(s1);
		String s2= driver.getTitle();
		System.out.println(s2);
		
		Navigation n1= driver.navigate();
		n1.back();
		
		 n1.forward();
		 Thread.sleep(2000);
		 n1.refresh();
		 Thread.sleep(2000);
		 
		 driver.close();
		 driver.quit();
	}
}
