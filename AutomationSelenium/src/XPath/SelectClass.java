package XPath;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectClass {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\supek\\Downloads\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver(); // Browser Launch
		driver.manage().window().maximize();
		
		driver.get("https://facebook.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		Thread.sleep(3000);
		WebElement month= driver.findElement(By.xpath("//select[@id='month']"));
		Select s=new Select(month);
		
		List <WebElement> L1= s.getOptions();
		ArrayList <String> ar= new ArrayList <String> ();
		System.out.println(L1.size());
		
		for(WebElement w : L1 ){
		System.out.println(w.getText());
		String data= w.getText();
		//System.out.println(data);
		ar.add(data);
		}
		Collections.sort(ar);

		System.out.println("*************************");

		for (String s1 : ar) {
			System.out.println(s1);
		}

		System.out.println("*************************");

		for (int i = ar.size() - 1; i >= 0; i--) {
			System.out.println(ar.get(i));

		}
	}
}
