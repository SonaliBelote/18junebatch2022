import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\supek\\Downloads\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver(); // Browser Launch
		driver.manage().window().maximize();
		Thread.sleep(1000);

		driver.get("https://www.w3schools.com/html/html_tables.asp");
		Thread.sleep(1000);
		
		List <WebElement> rows=  driver.findElements(By.xpath("//table[@id='customers']//tr"));
		System.out.println(rows.size());
		
		List <WebElement> HedderCells= driver.findElements(By.xpath("//table[@id='customers']//tr//th"));
		List <WebElement> RemainingCells= driver.findElements(By.xpath("//table[@id='customers']//tr//td"));
		System.out.println(HedderCells.size() + RemainingCells.size());
		
		//for(WebElement HedderCells1 : rows) {
		//	System.out.println(HedderCells1.getText());
		//}
		for (WebElement cells : rows) {
			System.out.println(cells.getText());
		}

		for (int i = 0; i < rows.size(); i++) {
			System.out.println(rows.get(i).getText());
		}
		for (int i = 1; i < rows.size(); i++) {
			List<WebElement> rows_Cells;
			if (i == 1) {
				rows_Cells = driver.findElements(By.xpath("//table[@id='customers']//tr[" + i + "]/th"));
			} else {
				rows_Cells = driver.findElements(By.xpath("//table[@id='customers']//tr[" + i + "]/td"));
			}

			for (int j = 0; i < rows_Cells.size(); j++) {
				System.out.println(rows_Cells.get(j).getText() + " ");
			}
			System.out.println();

		}
	}
}
