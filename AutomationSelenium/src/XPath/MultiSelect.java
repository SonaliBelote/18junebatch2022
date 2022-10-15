package XPath;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelect {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\supek\\Downloads\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver(); // Browser Launch
		driver.manage().window().maximize();
		
		driver.get("http://practice.cybertekschool.com/dropdown");
		Thread.sleep(1000);
		WebElement lan=driver.findElement(By.xpath("//select[@name='Languages']"));
		Thread.sleep(1000);
		
		Select s =new Select(lan);
		Thread.sleep(1000);
		s.selectByValue("java");
		Thread.sleep(1000);
		s.selectByValue("js");
		Thread.sleep(1000);
		s.selectByValue("c#");
		
	
		WebElement firstselected = s.getFirstSelectedOption();
		System.out.println(firstselected );
		System.out.println(firstselected.getSize() );
		System.out.println(s.getFirstSelectedOption().getSize());
		System.out.println(s.isMultiple());
		
		List <WebElement> l2= s.getAllSelectedOptions();
		List <WebElement> l= s.getOptions();
		System.out.println(l.size());
		System.out.println(l2.size());

		for (int i = 0; i < l.size(); i++) {
			System.out.println(l.get(i).getText());
		}
		s.deselectByValue("java");
		Thread.sleep(1000);
		s.deselectByValue("js");
		Thread.sleep(1000);
		s.deselectByValue("c#");

		s.deselectAll();
		
		
		
		
		
		
		
		
	}
}
