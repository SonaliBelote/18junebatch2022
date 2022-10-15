import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class dragAndDrop2 {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", 
			"C:\\Users\\supek\\Downloads\\chromedriver_win32\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver(); //Browser Launch
    driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
	
 
    WebElement washingtonCityElement = driver.findElement(By.xpath("//div[@id='box3']"));
    WebElement unitedStatesElement = driver.findElement(By.xpath("//div[@id='box103']"));
 
	Actions act  = new Actions(driver);
	Thread.sleep(1000);
	act.dragAndDrop(washingtonCityElement, unitedStatesElement).perform();
	
	
	

}
}
