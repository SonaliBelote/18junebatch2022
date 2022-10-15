import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseActions {
	

		public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\supek\\Downloads\\chromedriver_win32\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			
			driver.get("https://www.amazon.in/");
			
			WebElement selectlang = driver.findElement(By.xpath("//a[@href='/customer-preferences/edit?ie=UTF8&preferencesReturnUrl=%2F&ref_=topnav_lang']"));
			Actions act= new Actions(driver);
			act.moveToElement(selectlang).perform();
			act.click().perform();
			act.click(selectlang).perform();

			act.moveToElement(selectlang).perform();
			act.contextClick().perform();
			act.contextClick(selectlang).perform();

			act.doubleClick().perform();
			act.doubleClick(selectlang).perform();

			act.moveToElement(selectlang).click().build().perform();

			
			
			
		}

	}
